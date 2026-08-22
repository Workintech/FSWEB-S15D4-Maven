import org.example.Main;
import org.example.WorkintechList;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testConvertDecimalToBinary() {
        assertEquals("0", Main.convertDecimalToBinary(0));
        assertEquals("1", Main.convertDecimalToBinary(1));
        assertEquals("10", Main.convertDecimalToBinary(2));
        assertEquals("1111", Main.convertDecimalToBinary(15));
        assertEquals("-101", Main.convertDecimalToBinary(-5));
    }

    @Test
    public void testCheckForPalindrome() {
        assertTrue(Main.checkForPalindrome("Level"));
        assertTrue(Main.checkForPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(Main.checkForPalindrome("hello"));
        assertFalse(Main.checkForPalindrome(""));
        assertFalse(Main.checkForPalindrome(null));
    }

    @Test
    public void testWorkintechListBehaviors() {
        WorkintechList<String> list = new WorkintechList<>();
        list.add("b");
        list.add("a");
        list.add("c");
        list.add(null);
        assertEquals(4, list.size());
        assertFalse(list.isEmpty());
        assertTrue(list.contains("a"));
        list.remove("a");
        assertFalse(list.contains("a"));
        list.add(1, "d");
        assertEquals("d", list.get(1));
        list.set(1, "x");
        assertEquals("x", list.get(1));
        list.sort();
        ArrayList<String> expected = new ArrayList<>();
        expected.add(null);
        expected.add("b");
        expected.add("c");
        expected.add("x");
        assertEquals(expected, list);
    }
}