import java.util.Arrays;

public class SelectionSort {
    //Search through an array and keep track of the minimum value during each
    //iteration. At the end of each iterations, we swap variables.
    //Time complexity: O(n^2)
    //Space complecity: O(n)

    public static void main(String[] args) {
        int array[]={9,8,3,2,1,4,5,6,7};
        selectionSort(array);
    }
    private static void selectionSort(int array[])
    {
        int temp;
        int j=0;
        for(int i=0;i<array.length-1;i++) //only used for comparing the elements, NOT FOR SWAPPING!
        {
            int min=array[i];
            int index=i;
            for(j=i+1;j<array.length;j++)
            {
                if(array[j]<min)
                {
                    min=array[j];
                    index=j;
                }
            }
            temp=array[i]; //only use the outer elements to swap
            array[i]=array[index];
            array[index]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
