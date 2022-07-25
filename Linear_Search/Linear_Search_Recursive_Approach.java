import java.io.*;

public class Linear_Search_Recursive_Approach 
{
    public static int linearSearch(int arr[], int size, int key)
    {
        if(size == 0){
            return -1;
        }
        if(arr[size-1] == key)
        {
            return size-1;
        }
        else
        {
            int ans = linearSearch(arr, size-1, key);
            return ans;
        }
    }
    public static void main(String args[])
    {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int ans = linearSearch(arr, arr.length, 7);
        if(ans == -1)
        {
            System.out.println("The number is not in the array or array size is 0");
        }
        
        System.out.println("The number is at position :" + ans);
    }
}
