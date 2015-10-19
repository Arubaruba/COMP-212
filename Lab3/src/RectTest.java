import org.junit.Test;

import static org.junit.Assert.*;

public class RectTest {

    @Test
    public void testGetArea() throws Exception {
        Rect rect = new Rect(3, 4);
        assertEquals(rect.getArea(), 12, 0);
    }

    @Test
    public void testGetPerimeter() throws Exception {
        Rect rect = new Rect(3, 4);
        assertEquals("", rect.getPerimeter(), 14, 0);
    }
}