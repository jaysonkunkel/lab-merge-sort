import java.util.Comparator;

/**
 * A simple way to sort arrays using merge sort.
 *
 * @author YourName Here
 * @author Your NameHere
 * @author Samuel A. Rebelsky
 */
public class MergeSorter {

  // +------------------+--------------------------------------------
  // | Exported methods |
  // +------------------+

  /**
   * Sort an array using the merge sort algorithm.
   */
  public static <T> void sort(T[] vals, Comparator<? super T> comparator) {
    // STUB
  } // sort

  // +-----------------+---------------------------------------------
  // | Local utilities |
  // +-----------------+

  /**
   * Merge the values from positions [lo..mid) and [mid..hi) back into
   * the same part of the array.
   *
   * Preconditions: Each subarray is sorted accorting to comparator.
   */
  static <T> void merge(T[] vals, int lo, int mid, int hi, Comparator<? super T> comparator) {

    T[] merged = java.util.Arrays.copyOfRange(vals, lo, hi);

    int i = lo;
    int j = mid;

    

      for(int k = 0; k < merged.length; k++){

        if(i < mid && j < hi){
          if(comparator.compare(vals[i], vals[j]) == -1 || comparator.compare(vals[i], vals[j]) == 0){
            merged[k] = vals[i];
            i++;
          }
          else{
            merged[k] = vals[j];
            j++;
          }
        }

        if(i >= mid){
          k++;
          merged[k] = vals[j];
        }
        else if(j >= hi){
          k++;
          merged[k] = vals[i];
        }
      }

    for(int k = 0; k < vals.length; k++){
      vals[k] = merged[k];
    }
    
  } // merge

} // class MergeSorter