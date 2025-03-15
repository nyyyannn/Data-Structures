import java.util.Arrays;

public class BinarySearch {

    //Runtime: O(log n)
    //Advantage: Useful for larger datasets
    //Disadvantages:
    //1.Elements need to be sorted
    //2.Not efficient for smaller datasets
    public static void main(String[] args) {
        int array[] = new int[1000000];
        int target = 777777;

        for(int i=0;i<array.length;i++)
        {
            array[i] = i;
        }

        //built-in bindary search method
        // int index = Arrays.binarySearch(array, target);
        // System.out.println(index);

        int index = binarySearch(array, target);
        System.out.println(index);
    }
    private static int binarySearch(int array[], int target)
    {
        int low = 0;
        int high = array.length - 1;

        while(low<=high)
        {
            int middle = low + (high-low)/2; //to prevent integer overflow, by doing this, the value of middle will never cross the Integer.MAX_VALUE
            if(array[middle]==target) return middle;
            else if(target<array[middle]) high = middle-1;
            else if(target>array[middle]) low = middle+1;
        }
        return -1;
    }
}
