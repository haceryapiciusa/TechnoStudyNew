package Day17;

public class BinarySearch {
    private static int target;


    // Driver method to test above
    public static void main(String args[]) {

        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int target = 10;

        int size = arr.length;

        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }

    // Returns index of target if it is present in arr[],
    // else return -1
    static int binarySearch(int arr[], int target) {

        int left = 0;//start from 0
        int right = arr.length - 1;//end position is 9

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;

                // If target is smaller, ignore right half
            else
                right = mid - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;

    }
}