package game;

import model.Player;
import view.Game;
import controller.GameController;

public class RockPaperScissors
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        new GameController(new Game(), new Player("name"), new Player("name"));
    }

}
