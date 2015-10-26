import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceTest {

    @Test
    public void testGetDistance() throws Exception {
        Distance distance = new Distance(3, 4);
        assertEquals(distance.getDistance(), 12.0, 0);
    }
}