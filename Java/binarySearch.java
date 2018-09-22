/*
*
* @author HAK
* September 22, 2018
*
* */
public class binarySearch {

    /*
    * Time Complexity
    * Best O(1)
    * Average O(logn)
    * Worst O(logn)
    *
    * Space Complexity
    * O(1)_
    * */
    public int binarySearchSimple(int [] input, int key){
        int low = 0;
        int high = input.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (key < input[mid]) high = mid - 1;
            else if (key > input[mid]) low = mid + 1;
            else return mid;
        }
        return -1;
    }

    /*
     * Time Complexity
     * Best O(1)
     * Average O(logn)
     * Worst O(logn)
     *
     * Space Complexity
     * O(logn)_
     * */
    public int binarySearchRecursive(int [] input, int key, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low)/2;
        if (key < input[mid]) return binarySearchRecursive(input, key, low, mid-1);
        else if (key > input[mid]) return binarySearchRecursive(input, key, mid+1, high);
        else return mid;
    }
}
