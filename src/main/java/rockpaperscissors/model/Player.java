package rockpaperscissors.model;

import rockpaperscissors.utils.SHAPES;

/**
 * This class is used to model a player in the Rock paper scissors game
 * 
 * @author Varun Verma
 * 
 */
public class Player
{
    private final String name;
    private SHAPES move;

    /**
     * This is a constructor for player to intialise with a name
     * 
     * @param name
     *            :specifies the name
     */
    public Player(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setMove(SHAPES nextMove)
    {
        this.move = nextMove;
    }

    public SHAPES getMove()
    {
        return move;
    }
}
