import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {

  private static final double EPSILON = 1E-9;
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = { 1, 2 };
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{ 2, 1 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = { 3 };
    int[] input3 = { 1, 2 };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{ 3 }, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{ 2, 1 }, ArrayExamples.reversed(input3));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {2.0};
    double[] input2 = {1.0, 2.0, 3.0};
    double[] input3 = {1.0, 1.0, 1.0, 3.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), EPSILON);
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input2), EPSILON);
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input3), EPSILON);
  }
}
