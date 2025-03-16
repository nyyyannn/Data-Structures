import java.util.Arrays;

public class QuickSort {
    //moves smaller elements to the left of a pivot. Recursively divide the array in 2 partitions.
    //Time complexity: Best case:O(n log(n)), Avg case: O(n log(n)), Worst case: O(n^2) (if already sorted)
    //Space complexity: O(log n) //cause of recursion (lesser than MergeSort)
    public static void main(String[] args) {
        int array []={9,8,7,6,5,4,3,2,1};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    private static void quickSort(int array[], int start, int end)
    {
        if(end<=start) return; //base case
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }
    private static int partition(int array[],int start, int end)
    {
        int pivot = array[end];
        int i,j;
        i=start-1;
        for(j=start;j<=end-1;j++)
        {
            if(array[j]<=pivot)
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
