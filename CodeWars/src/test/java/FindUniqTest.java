import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class FindUniqTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindUniq.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(1.0, FindUniq.findUniq(new double[]{2, 1, 2}), precision);
        assertEquals(2.0, FindUniq.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(0.55, FindUniq.findUniq(new double[]{ 0, 0, 0.55, 0, 0}), precision);
        assertEquals(1.5, FindUniq.findUniq(new double[]{ 3.5, 3.5, 1.5, 3.5, 3.5}), precision);
        assertEquals(8.0, FindUniq.findUniq(new double[]{ 2, 2, 2, 2, 8.0}), precision);
        assertEquals(9.0, FindUniq.findUniq(new double[]{ 9, 3, 3, 3, 3, 3}), precision);
    }
}
