package pl.mateuszwinnicki.toh.place;

class Forest implements Place {

    @Override
    public PlaceType type() {
        return PlaceType.GREENFIELD;
    }

    @Override
    public PlaceInfo placeInfo() {
        return PlaceInfo.def();
    }

}
