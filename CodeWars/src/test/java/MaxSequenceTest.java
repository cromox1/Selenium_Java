import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxSequenceTest {
    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, MaxSequence.sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() throws Exception {
        assertEquals("Example array should have a max of 6", 6, MaxSequence.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    @Test
    public void testNegetiveArray() throws Exception {
        assertEquals("Negetive array should have a max of 0", 0, MaxSequence.sequence(new int[]{-2, -3, -1, -5, -4}));
    }
    @Test
    public void testMixNegetiveArray() throws Exception {
        assertEquals("Example array should have a max of 63", 63, MaxSequence.sequence(new int[]{17, -31, 3, 23, 5, 19, -27, -42, -25, -26, -21, 2, 43, -5, 23}));
    }
    @Test
    public void testBigArrayOne() throws Exception {
        assertEquals("Example big array should have a max of 339", 339, MaxSequence.sequence(new int[]{-21, -12, -16, -14, 11, -16, 29, -2, -2, 1, -30, 26, -2, 28, -1, 4, -19, -28, -9, 4, -15, 15, -13, 13, -25, 11, 18, 16, -10, 12, -16, 17, 3, -21, 17, -20, 27, 22, -12, 22, -7, 13, 14, 7, 3, 25, 16, 9, -30, 25}));
    }

}

/*
Some examples

With input: [31,30,-5,-38,48,46,38,-35,49,22,-8,22,-27,-17,12,34,-31]
Test Passed: Value == 202

Log
With input: [-9,47,1,15,-21,32,-25,36,49,-11,15,25,13,15,5,34,-22,38,-22,40,36,-19,6,-5,-21,-45,-10,-19,36,22,-1,-37,1,-25,-35,-31,49]
Expected: 300, instead got: 215

Log
With input: [50,-16,-15,-24,-5,22]
Expected: 50, instead got: 34

Log
With input: [-26,0,-46,-3,-12,37,-46,48,14,42,-35,-49,8,-41]
Test Passed: Value == 104

Log
With input: [32,50,-5,-32]
Test Passed: Value == 82

Log
With input: [2,-18,19,-20,25,-22,-7,-25,-39,31,-38,-6,10,-15,31,-10,48,3,-45,-19,-23,4,32,27,-29,4,36,44,9,46,-27,-42,-42,-22,15,43,-26,21,37,27,9,-42,9,-36,-4,-18,27,-33,-18,-21,45,34,4,37,7,2,26,22,-47,-15,49,-20,37,27,-13,-29,24,-18,-14]
Expected: 238, instead got: 205

Is it the thing I am missing?

[50,-16,-15,-24,-5,22] // Expected: 50, instead got: 34

array = [50,-16,-15,-24,-5, 22]  / expected = 50
 */