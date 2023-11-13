import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void filterAddsSingleElementForWhichStringCheckerIsTrue(){
      StringChecker sc = (s) -> true;
        List<String> inputList = new ArrayList<>();
        inputList.add("Test");
        List<String> outList = ListExamples.filter(inputList, sc);
        assertEquals(1, outList.size());
        assertEquals("Test", outList.get(0));
    }  

    @Test
    public void filterRetainsOrderOfInput(){
        StringChecker sc = (s) -> true;
        List<String> inputList = new ArrayList<>();
        inputList.add("A");
        inputList.add("B");
        List<String> outList = ListExamples.filter(inputList, sc);
        assertEquals(2, outList.size());
        assertEquals("A", outList.get(0));
        assertEquals("B", outList.get(1));
    }

    @Test
    public void filterDoesNotIncludeElementsWhereSCReturnsFalse(){
        StringChecker sc = (s) -> false;
        List<String> inputList = new ArrayList<>();
        inputList.add("A");
        inputList.add("B");
        List<String> outList = ListExamples.filter(inputList, sc);
        assertEquals(0, outList.size());
    }
}