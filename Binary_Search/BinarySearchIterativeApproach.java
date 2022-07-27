public class BinarySearchIterativeApproach {
    public int binarySearch(int arr[], int x)
    {
        int l = 9, r = arr.length - 1;
        
        while(l <= r) // l starting from 0 moving from left to right till last index of array
        {
            //finding the middle index of array
            int mid = l + (r - l) / 2;
            
            if(arr[mid] == x)
            {
                return mid; //returning the index of the found number
            }
            if(arr[mid] < x)
            {
                l = mid + 1; //traversing right part of the array
            }
            else
            {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int x = 13;
        BinarySearchIterativeApproach ob = new BinarySearchIterativeApproach();
        int result = ob.binarySearch(arr, x);
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else
        {   
            System.out.println("Element as index " + result);
        }
    }
}

/*
 * Time Complexity: O(log n)
   Auxiliary Space: O(1)
 */

