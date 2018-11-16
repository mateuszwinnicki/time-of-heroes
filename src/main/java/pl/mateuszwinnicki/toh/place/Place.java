package pl.mateuszwinnicki.toh.place;

import pl.mateuszwinnicki.toh.action.Action;

import java.util.Collections;
import java.util.List;

public interface Place {

    PlaceType type();

    PlaceInfo placeInfo();

    default List<Action> possibleActions() {
        return Collections.emptyList();
    }

}
