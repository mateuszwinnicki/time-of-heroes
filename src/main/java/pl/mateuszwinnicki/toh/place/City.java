package pl.mateuszwinnicki.toh.place;

class City implements Place {

    @Override
    public PlaceType type() {
        return PlaceType.CITY;
    }

    @Override
    public PlaceInfo placeInfo() {
        return PlaceInfo.def();
    }

}
