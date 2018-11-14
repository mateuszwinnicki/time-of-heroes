package pl.mateuszwinnicki.toh;

import pl.mateuszwinnicki.toh.map.Map;
import pl.mateuszwinnicki.toh.map.MapGenerator;

public class Game {

    public static void main(String[] args) {
        var generator = new MapGenerator(20, 5, 10);
        var map = new Map(generator.generateMap());
        System.out.println(map);
    }

}
