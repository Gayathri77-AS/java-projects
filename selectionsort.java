public class selectionsort {
    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 5, 22, 11, 90, 12};

        // Perform selection sort
        selectionSort(myArray);
        selectionSort_optimized(myArray);

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int minValue = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minValue;
        }
    }

    public static void selectionSort_optimized(int[] arr) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; i++)
        { 
           int minIndex = i; // Find the minimum element in the unsorted part of the array 
           for (int j = i + 1; j < n; j++)
            { 
              if (arr[j] < arr[minIndex])
              { 
                minIndex = j; 
              } 
            } // Swap the found minimum element with the first element
            int temp = arr[minIndex]; 
            arr[minIndex] = arr[i]; 
            arr[i] = temp;
        } 
    }
}
