package model;

import utils.SHAPES;

public abstract class Player
{
    private final String name;
    private SHAPES nextMove;

    public Player(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setNextMove(SHAPES nextMove)
    {
        this.nextMove = nextMove;
    }

    public SHAPES getNextMove()
    {
        return nextMove;
    }
}
