In Bitonic sequence, elements are first arranged in increasing order, and then after some particular index they start decreasing.
An array with A[0…i…n-1] is said to be bitonic if there is an index i, such that -
  A[0] < A[1] < A[2] .... A[i-1] < A[i] > A[i+1] > A[i+2] > A[i+3] > ... >A[n-1]  
Where, 0 ≤ i ≤ n-1

public class BitonicSort {
 
    // The parameter dir indicates the sorting direction,
    // ASCENDING or DESCENDING; if (a[i] > a[j]) agrees
    // with the direction, then a[i] and a[j] are
    // interchanged.
 
    void compAndSwap(int a[], int i, int j, int dir)
    {
        if ((a[i] > a[j] && dir == 1)
            || (a[i] < a[j] && dir == 0)) {
            // Swapping elements
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
 
    /* Recursive function to solve the sequence in either ascending or descending order.*/
    void bitonicMerge(int a[], int low, int cnt, int dir)
    {
        if (cnt > 1) {
            int k = cnt / 2;
            for (int i = low; i < low + k; i++)
                compAndSwap(a, i, i + k, dir);
            bitonicMerge(a, low, k, dir);
            bitonicMerge(a, low + k, k, dir);
        }
    }
 
    /*Function which produces a bitonic sequence by recursively sorting its two halves in opposite sorting orders. */
    void bitonicSort(int a[], int low, int cnt, int dir)
    {
        if (cnt > 1) {
            int k = cnt / 2;
           bitonicSort(a, low, k,1);
            bitonicSort(a, low + k, k, 0);
           bitonicMerge(a, low, cnt, dir);
        }
    }
 
    /*Caller of bitonicSort for sorting the entire array
      of length N in ASCENDING order */
    void sort(int a[], int N, int up)
    {
        bitonicSort(a, 0, N, up);
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {
        int a[] = { 3, 7, 4, 8, 6, 2, 1, 5 };
        int up = 1;
        BitonicSort ob = new BitonicSort();
        ob.sort(a, a.length, up);
        System.out.println("\nSorted array");
        printArray(a);
    }
}
