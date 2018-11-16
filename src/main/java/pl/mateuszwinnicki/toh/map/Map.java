package pl.mateuszwinnicki.toh.map;

import pl.mateuszwinnicki.toh.place.Place;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private Place[][] places;

    public Map(Place[][] places) {
        this.places = places;
    }

    public List<Direction> possibleDirections(Position position) {
        var directions = new ArrayList<Direction>();
        if(places[position.getX()+1][position.getY()].placeInfo().travelPossible()) {
            directions.add(Direction.EAST);
        }
        if(places[position.getX()-1][position.getY()].placeInfo().travelPossible()) {
            directions.add(Direction.WEST);
        }
        if(places[position.getX()][position.getY()+1].placeInfo().travelPossible()) {
            directions.add(Direction.NORTH);
        }
        if(places[position.getX()][position.getY()-1].placeInfo().travelPossible()) {
            directions.add(Direction.SOUTH);
        }
        return directions;
    }

    public Place placeAt(Position position) {
        return places[position.getX()][position.getY()];
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (int x = 0; x < places.length; x++) {
            for (int y = 0; y < places[x].length; y++) {
                sb.append(places[x][y].type().toString(), 0, 1).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
