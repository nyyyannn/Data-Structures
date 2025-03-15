public class InterpolationSearch {
    public static void main(String[] args) {

        //improvement over binary search used for uniformaly distributed guesses where a 
        //value might be based on a calculated probe results
        //if probe is incorrect, search area is narrowed and new probe is calculated
        
        //average case: O(log(log n))
        //worst case: O(n)
        
        int array[]={1,2,3,4,5,6,7,8,9};
        int index = interPolation(array,3);
        System.out.println(index);  
    }
    private static int interPolation(int[] array, int value) 
    {
        int low = 0;
        int high = array.length-1;
        while(value>=array[low] && value<=array[high] && low<=high)
        {
            int probe = low + (high-low)*(value-array[low])/(array[high]-array[low]);
            if(value<array[probe])
            {
                high=probe-1;
            }
            else if(value>array[probe])
            {
                low=probe+1;
            }
            else
            {
                return probe;
            }
        }
        return -1;
    }
}
