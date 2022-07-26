/* Problem: 
          Given a sorted array arr[] of n elements, write a function to search a given element x in arr[] and return the index of x in the array.

                Consider array is 0 base index.

Examples: 

Input: arr[] = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170}, x = 110
Output: 6
Explanation: Element x is present at index 6. 

Input: arr[] = {10, 20, 30, 40, 60, 110, 120, 130, 170}, x = 175
Output: -1
Explanation: Element x is not present in arr[].
 
--------------------------------------------------------------------------------------

****Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n). 


 *Binary Algorithm --
                    1. Divide the sorted array into 2 parts
                    2. if the element of the middle index matches with the searched element return the index number
                    3.if the elment is less than the value of the middle index ignore right half and consider left half
                    4. if element is more than the value of the middle index ignore the left
                    5.repeats steps 1 to 4 unless we find the desired number
                    6. if number not in the array return -1 to show number is not in the array



 
*/


public class BinarySearchRecursiveApproach
{
    public static int binarySearch(int arr[], int l, int r, int x)
    // l = leftmost index i.e 0; r = rightmost index i.e arr.length -1; x = searched value
    {
        if(r >= l)
        {
            int mid = l + (r - l) / 2;

            //checking if mid = searched element
            if(arr [mid] == x)
            {
                return mid;
            }
            //checking if x is left part of array
            if(arr[mid] > x)
            {
               return binarySearch(arr, mid - 1, r, x);
            }
            //checking if x is rigth part of array
            if(arr[mid] < x)
            {
               return binarySearch(arr, mid + 1, r, x);
            }
        }
        return -1;
    }

    public static void main (String args [])
    {
        int arr[] = {2,3,4,10,40};
        int n =arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n-1, x);
        if(result == -1)
        {
            System.out.println("Searched value is not present");
        }
        else
        {
            System.out.println("Element found at index = " + result);
        }
    }
}