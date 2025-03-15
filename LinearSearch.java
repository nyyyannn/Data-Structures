import java.util.*;
public class LinearSearch {

    //Runtime complexity: O(n)
    //Disadvantages: Slow for large datasets
    //Advantages: 
    //1.Fast for searches of small and medium data sets
    //2.NO need to sort 
    //3.Useful for Data Structures that do not have random access (Linked List)
    public static void main(String[] args) {
        int array [] = {3,2,1,4,5,7,6,8,9};
        int index = linearSearch(array,3);
        System.out.println(index);
    }   
    private static int linearSearch(int [] array, int element)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==element)
            {
                return i;
            }
        }
        return -1;
    }
}
