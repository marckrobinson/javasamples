public class MyQuickSort {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // partitionIndex is the index where the pivot has been placed
            // at its correct position in the sorted array
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as pivot
        int pivot = arr[high];
        // Pointer for the greater element
        int i = (low - 1);

        // Traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                // If element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // Swapping element at i with element at j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the greater element specified by i
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the position from where partition is done
        return (i + 1);
    }

    public static void main(String[] args) {
        MyQuickSort qs = new MyQuickSort();
        int[] arr = {10, 7, 8, 9, 1, 5};
        qs.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
