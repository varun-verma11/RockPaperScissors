package rockpaperscissors.model;

import rockpaperscissors.utils.SHAPES;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * This is a random move generator for the AI player.
 * 
 * @author Varun Verma
 * 
 */
public class AIRandomMoveGenerator
{
    /**
     * Initialises a list of values for the shapes
     */
    private static final List<SHAPES> VALUES = Collections.unmodifiableList(Arrays.asList(SHAPES
            .values()));

    /**
     * This field specifies the number of the shapes
     */
    private static final int SIZE = VALUES.size();

    /**
     * This field specifies a random number generator
     */
    private static final Random RANDOM = new Random();

    /**
     * This method generates a move randomly
     * 
     * @return
     */
    public SHAPES generateMove()
    {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
