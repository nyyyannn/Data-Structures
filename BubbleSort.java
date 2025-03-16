import java.util.Arrays;

public class BubbleSort {

    //compares two elements and swaps them until the entire array is sorted
    //Highly inefficient
    //Time complexity: O(n^2)
    //Space complecity: O(n)
    public static void main(String[] args) {
        int arr [] = {9,2,3,4,5,6,7,1,8};
        bubbleSort(arr);
    }
        
    public static void bubbleSort(int[] array) 
    {
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-i-1;j++) //the reason it is array.length-i-1 is because after i iterations, the last i elements are already sorted
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
