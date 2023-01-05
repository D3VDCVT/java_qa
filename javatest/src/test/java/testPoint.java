import org.testng.Assert;
import org.testng.annotations.Test;

public class testPoint {
    @Test
    public void testResult() {

        Point ab = new Point(4,2, 8, 2);
        Assert.assertEquals(ab.result(), 4.0);
    }
}
