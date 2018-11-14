package pl.mateuszwinnicki.toh.place;

/**
 * Special class which indicate border of the map
 */
class Border implements Place {

    @Override
    public PlaceType type() {
        return PlaceType.BORDER;
    }

    @Override
    public PlaceInfo placeInfo() {
        return new PlaceInfo().setTravelPossible(false);
    }
}
