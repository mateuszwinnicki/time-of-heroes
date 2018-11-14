package pl.mateuszwinnicki.toh.map;

import pl.mateuszwinnicki.toh.place.Place;
import pl.mateuszwinnicki.toh.place.PlaceFactory;

public class MapGenerator {

    private Integer width;
    private Integer length;
    private Integer nonGreenfieldChance;

    public MapGenerator(Integer width, Integer length, Integer nonGreenfieldChance) {
        this.width = width;
        this.length = length;
        this.nonGreenfieldChance = nonGreenfieldChance;
    }

    public Place[][] generateMap() {
        var places = new Place[width+2][length+2]; // +2 for border
        for(var x=0; x<width+2; x++) {
            for(var y=0; y<length+2; y++) {
                if(isBorder(width, length, x, y)) {
                    places[x][y] = PlaceFactory.border();
                } else {
                    places[x][y] = PlaceFactory.getRandomPlace(nonGreenfieldChance);
                }
            }
        }
        return places;
    }

    private static Boolean isBorder(Integer width, Integer length, Integer x, Integer y) {
        return x == 0 || x == width + 1 || y == 0 || y == length + 1;
    }

}
