package pl.mateuszwinnicki.toh.place;

import java.util.Random;

public class PlaceFactory {

    /**
     * @param nonGreenfieldChance change on non greenfield place in percent
     * @return random place
     */
    public static Place getRandomPlace( int nonGreenfieldChance) {
        var random = new Random();
        var greenfield = random.nextInt(100) > nonGreenfieldChance;
        if(greenfield) {
            return randomGreenfield();
        }
        return randomPlace();
    }

    private static Place randomPlace() {
        return new City();
    }

    private static Place randomGreenfield() {
        return new Forest();
    }

    public static Place border() {
        return new Border();
    }


}
