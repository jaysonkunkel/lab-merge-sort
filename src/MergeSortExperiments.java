import java.util.Arrays;
import java.util.Comparator;
import java.io.PrintWriter;

/**
 * Experiments with merge sort.
 *
 * @author YourName Here
 * @author Your NameHere
 * @author Samuel A. Rebelsky
 */
public class MergeSortExperiments {
  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Run a bunch of experiments.
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    experiment01(pen);
    experiment02(pen);
  } // main

  // +-------------+-------------------------------------------------
  // | Comparators |
  // +-------------+

  /**
   * Compare integers.
   */
  static Comparator<Integer> compareInts = (x,y) -> x == y ? 0 : x < y ? -1 : 1;

  /**
   * Compare strings.
   */
  static Comparator<String> compareStrings = (x,y) -> x.compareTo(y);

  // +-------------+-------------------------------------------------
  // | Experiments |
  // +-------------+

  /**
   * Sort a small array of integers.
   */
  static void experiment01(PrintWriter pen) {
    integerSortExperiment(pen, new Integer[] { 3, 5, 1, 2, 4, 3 });
  } // experiment01(PrintWriter)

  /**
   * Sort a small array of strings.
   */
  static void experiment02(PrintWriter pen) {
    stringSortExperiment(pen, new String[] { "foo", "bar", "baz", "qux", "fu" });
  } // experiment(02)

  // +---------+-----------------------------------------------------
  // | Helpers |
  // +---------+

  /**
   * Sort an array of integers.
   */
  static void integerSortExperiment(PrintWriter pen, Integer[] vals) {
    pen.print(Arrays.toString(vals));
    pen.print(" -> ");
    MergeSorter.sort(vals, compareInts);
    pen.println(Arrays.toString(vals));

    Integer[] newVals = {1, 3, 5, 2, 3, 4};
    pen.println(Arrays.toString(newVals));
    int mid = (0 + newVals.length) /2;
    MergeSorter.merge(newVals, 0, mid, newVals.length, compareInts);
    pen.println(Arrays.toString(newVals));

  
  } // integerSortExperiment(PrintWriter, Integer[])   

  /**
   * Sort an array of strings.
   */
  static void stringSortExperiment(PrintWriter pen, String[] vals) {
    pen.print(Arrays.toString(vals));
    pen.print(" -> ");
    MergeSorter.sort(vals, compareStrings);
    pen.println(Arrays.toString(vals));

    String[] newVals = {"fu", "bar", "f", "fu", "wham"};
    pen.println(Arrays.toString(newVals));
    int mid = (0 + newVals.length) / 2;
    MergeSorter.merge(newVals, 0, mid, newVals.length, compareStrings);
    pen.println(Arrays.toString(newVals));

  } // stringSortExperiment(PrintWriter, String[])   

} // class MergeSortExperiments