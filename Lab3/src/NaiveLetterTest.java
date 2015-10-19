import org.junit.Test;

import static org.junit.Assert.*;

public class NaiveLetterTest {

    @Test
    public void testToLower() throws Exception {
        assertEquals('c', NaiveLetter.toLower('C'));
    }

    @Test
    public void testToUpper() throws Exception {
        assertEquals('C', NaiveLetter.toUpper('c'));
    }
}