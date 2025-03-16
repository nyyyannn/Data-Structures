import java.util.Arrays;

public class MergeSort {
    //recursively divides an array in 2, sorts the and recombines them
    //Run time complexity: O(n log n)
    //Space complexity: O(n)
    public static void main(String[] args) {
        int array[]={9,8,7,6,5,4,2,3,1};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void mergeSort(int[] array)
    {
        int middle = array.length/2;
        int leftArray[] = new int[middle];
        int rightArray[] = new int[array.length-middle];
        int j=0;

        if(array.length<=1) return; //base case
        for(int i=0;i<array.length;i++) //only adding elements to the left and right sub arrays
        {
            if(i<middle)
            {
                leftArray[i]=array[i];
            }
            else
            {
                rightArray[j]=array[i];
                j++;
            }
        }
        mergeSort(leftArray); //splits the array into 2
        mergeSort(rightArray); //splits the array into 2 
        merge(leftArray,rightArray,array); //merges those arrays into one array
    }
    private static void merge(int []leftArray, int []rightArray, int []array)
    {
        int i=0,l=0,r=0;
        while(l<leftArray.length && r<rightArray.length)
        {
            if(leftArray[l]<rightArray[r])
            {
                array[i]=leftArray[l];
                i++;
                l++;
            }
            else
            {
                array[i]=rightArray[r];
                i++;
                r++;
            }
        }
        while(l<leftArray.length)
        {
            array[i]=leftArray[l];
            i++;
            l++;
        }
        while(r<rightArray.length)
        {
            array[i]=rightArray[r];
            i++;
            r++;
        }
    }
}
