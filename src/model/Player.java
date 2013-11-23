package model;

import utils.SHAPES;

public class Player
{
    private final String name;
    private SHAPES move;

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
