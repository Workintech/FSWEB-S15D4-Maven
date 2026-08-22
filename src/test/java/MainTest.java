import org.example.Main;
import org.example.WorkintechList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(org.example.ResultAnalyzer.class)
public class MainTest {

    @Test
    @DisplayName("Stack ile palindrom saayılar doğru bulunabiliyor mu ?")
    public void testPalindrome(){
        assertEquals(true, Main.checkForPalindrome("I did, did I?"));
        assertEquals(true, Main.checkForPalindrome("Racecar"));
        assertEquals(false, Main.checkForPalindrome("hello"));
        assertEquals(true, Main.checkForPalindrome("Was it a car or a cat I saw ?"));
        assertEquals(false, Main.checkForPalindrome("Test"));
        assertEquals(false, Main.checkForPalindrome("Welcome"));
    }

    @Test
    @DisplayName("convertToDecimal methodu 10 luk tabandaki sayıları 2 lik taban cevirebiliyor mu ?")
    public void testConvertToDecimal(){
        assertEquals("101", Main.convertDecimalToBinary(5));
        assertEquals("110", Main.convertDecimalToBinary(6));
        assertEquals("1101", Main.convertDecimalToBinary(13));
    }

    @Test
    @DisplayName("convertDecimalToBinary methodu doğru çalışıyor mu ?")
    public void testConvertDecimalToBinary() {
        assertEquals("0", Main.convertDecimalToBinary(0));
        assertEquals("1", Main.convertDecimalToBinary(1));
        assertEquals("10", Main.convertDecimalToBinary(2));
        assertEquals("1111", Main.convertDecimalToBinary(15));
        assertEquals("-101", Main.convertDecimalToBinary(-5));
    }

    @Test
    @DisplayName("checkForPalindrome methodu doğru çalışıyor mu ?")
    public void testCheckForPalindrome() {
        assertTrue(Main.checkForPalindrome("Level"));
        assertTrue(Main.checkForPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(Main.checkForPalindrome("hello"));
        assertFalse(Main.checkForPalindrome(""));
        assertFalse(Main.checkForPalindrome(null));
    }

    @Test
    @DisplayName("WorkintechList doğru tipe sahip mi ?")
    public void testWorkintechListType(){
        WorkintechList list = new WorkintechList();
        assertEquals(true, list instanceof ArrayList);
        assertEquals(true, list instanceof List);
    }

    @Test
    @DisplayName("WorkintechList'e aynı eleman birden fazla kez eklenebiliyor mu ?")
    public void testWorkintechListAddMethod(){
        WorkintechList<String> list = new WorkintechList<>();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        assertEquals(6, list.size());
    }

    @Test
    @DisplayName("WorkintechList sort metodu doğru çalışıyor mu?")
    public void testWorkintechListSortMethod(){
        WorkintechList<String> list = new WorkintechList<>();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        list.sort();
        assertEquals("Ali", list.get(0));
        assertEquals("Zeynep", list.get(list.size()-1));
    }

    @Test
    @DisplayName("WorkintechList remove metodu doğru çalışıyor mu?")
    public void testWorkintechListRemoveMethod(){
        WorkintechList<String> list = new WorkintechList<>();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        list.remove("Ali");
        assertNotEquals("Ali", list.get(0));
        assertEquals("Mehmet", list.get(0));
    }

    @Test
    @DisplayName("WorkintechList genel davranış testi")
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