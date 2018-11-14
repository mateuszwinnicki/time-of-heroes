package pl.mateuszwinnicki.toh.place;

public class PlaceInfo {

    private Boolean travelPossible;

    public Boolean travelPossible() {
        return travelPossible;
    }

    PlaceInfo setTravelPossible(Boolean travelPossible) {
        this.travelPossible = travelPossible;
        return this;
    }

    public static PlaceInfo def() {
        return new PlaceInfo()
            .setTravelPossible(true);
    }

}
