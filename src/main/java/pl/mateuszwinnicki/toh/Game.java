package pl.mateuszwinnicki.toh;

import pl.mateuszwinnicki.toh.map.Direction;
import pl.mateuszwinnicki.toh.map.Map;
import pl.mateuszwinnicki.toh.map.MapGenerator;
import pl.mateuszwinnicki.toh.map.Position;
import pl.mateuszwinnicki.toh.place.Place;

import java.util.List;

public class Game {

    public static void main(String[] args) {
        var generator = new MapGenerator(20, 5, 10);
        var map = new Map(generator.generateMap());
        System.out.println(map);


        var position = new Position(2, 2);

        for(var i=0; i<30; i++) {
            Place place = map.placeAt(position);
            System.out.println("Player at: " + place.type());
            List<Direction> directions = map.possibleDirections(position);
            System.out.println("Possible directions: " + directions);
            Direction direction = directions.get(0);
            System.out.println("Moving to: " + direction);
            position.move(direction);
            System.out.println("Next\n");
        }


    }

}
