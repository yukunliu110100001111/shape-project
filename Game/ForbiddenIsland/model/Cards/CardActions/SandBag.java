package Game.ForbiddenIsland.model.Cards.CardActions;

import Game.ForbiddenIsland.model.ActionContext;
import Game.ForbiddenIsland.model.GameState;

public class SandBag implements CardAction {
    @Override
    public void execute(GameState gameState, ActionContext context) {
        context.getTargetTile().drain();
    }
}
