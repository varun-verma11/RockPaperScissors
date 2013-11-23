package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import utils.SHAPES;

public class AIRandomMoveGenerator
{
    private static final List<SHAPES> VALUES = Collections
            .unmodifiableList(Arrays.asList(SHAPES.values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public SHAPES generateMove()
    {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
