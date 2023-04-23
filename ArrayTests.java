import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void reverseManyItems(){
    //tests reverseInPlace method
    int[] numList = {0, 10, 20};
    ArrayExamples.reverseInPlace(numList);
    assertArrayEquals(new int[]{20, 10, 0}, numList);
    //fails: for loop kept changing the elements and updating to the already updated elements
    //fix: make a copy of list and update list according to that copy
  }

  @Test
  public void newArrayReversed(){
    //tests reversed method
    int[] numList = {5, 10, 15};
    assertArrayEquals(new int[] {15, 10, 5}, ArrayExamples.reversed(numList));
    //fails: changes array given instead of updating the new array
    //fix: update new array index to be the updated index of the original array
  }
}

