
package rockpaperscissors.model;

import org.junit.Assert;
import org.junit.Test;


/**
 * Generated Unit Tests
 * 
 */
public class TestPlayer {


    @Test
    public void testConstructor() {
         
        // Generate the arguments
         
         
        // Invoke the method
         
        Player player = new Player("Computer2");
         
        // Assert the fields are what we expect
         
        String name = player.getName();
        Assert.assertEquals("Computer2", name);
    }

}
