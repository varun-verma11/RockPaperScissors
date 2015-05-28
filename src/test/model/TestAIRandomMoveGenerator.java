
package rockpaperscissors.model;

import org.junit.Test;
import org.mockito.Mockito;
import rockpaperscissors.utils.SHAPES;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Random;


/**
 * Generated Unit Tests
 * 
 */
public class TestAIRandomMoveGenerator {


    @Test
    public void testConstructor() {
         
        // Invoke the method
         
        AIRandomMoveGenerator aIRandomMoveGenerator = new AIRandomMoveGenerator();
    }

    @Test
    public void testGenerateMove()
        throws IllegalAccessException, NoSuchFieldException
    {
         
        // Generate the fields
         
        Random mockRandom = Mockito.mock(Random.class);
        Mockito.when(mockRandom.nextInt(Mockito.eq(3))).thenReturn(2);
        List mockCollections$UnmodifiableRandomAccessList = Mockito.mock(List.class);
        AIRandomMoveGenerator aIRandomMoveGenerator = new AIRandomMoveGenerator();
        Field field = aIRandomMoveGenerator.getClass().getDeclaredField("RANDOM");
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, (field.getModifiers()&(~Modifier.FINAL)));
        field.set(aIRandomMoveGenerator, mockRandom);
        Field field1 = aIRandomMoveGenerator.getClass().getDeclaredField("SIZE");
        field1 .setAccessible(true);
        Field modifiersField1 = Field.class.getDeclaredField("modifiers");
        modifiersField1 .setAccessible(true);
        modifiersField1 .setInt(field1, (field1 .getModifiers()&(~Modifier.FINAL)));
        field1 .set(aIRandomMoveGenerator, 3);
        Field field2 = aIRandomMoveGenerator.getClass().getDeclaredField("VALUES");
        field2 .setAccessible(true);
        Field modifiersField2 = Field.class.getDeclaredField("modifiers");
        modifiersField2 .setAccessible(true);
        modifiersField2 .setInt(field2, (field2 .getModifiers()&(~Modifier.FINAL)));
        field2 .set(aIRandomMoveGenerator, mockCollections$UnmodifiableRandomAccessList);
         
        // Invoke the method
         
        SHAPES sHAPES = aIRandomMoveGenerator.generateMove();
         
        // Assert that our method interactions are what we expect.
         
        Mockito.verify(mockRandom, Mockito.times(1)).nextInt(Mockito.eq(3));
        Mockito.verify(mockCollections$UnmodifiableRandomAccessList, Mockito.times(1)).get(Mockito.eq(2));
    }

}
