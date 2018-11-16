package pl.mateuszwinnicki.toh.action;

import pl.mateuszwinnicki.toh.player.Player;

public interface Action {

    void doWith(Player player);

    ActionInfo actionInfo();

    ActionType actionType();

}
