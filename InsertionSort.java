import java.util.Arrays;

public class InsertionSort {
    // After comparing elements to the left, shift elements to the right to make room to insert a value
    // Lesser steps than bubble sort, best case is O(n) compared to Selection sort O(n^2)
    public static void main(String[] args) {
        int array[] = {9,1,2,4,3,5,6,7,8};
        insertionSort(array);
            }
        
            private static void insertionSort(int[] array) {
                for(int i=1;i<array.length;i++)
                {
                    int temp=array[i]; //element at 1st index
                    int j=i-1; //element at 0th index
                    while(j>=0 && array[j]>temp) //swapping elements
                    {
                        array[j+1]=array[j]; //swapping
                        j--; //moving back to check again
                    }
                    array[j+1]=temp; //placing element back in the right place. The reason for j++ is because the value of j would have 
                                    //become 1 less after the comparision in the while loop                    
                }
                System.out.println(Arrays.toString(array));
            }
    
}
