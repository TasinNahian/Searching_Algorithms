// Given an array arr[] of n elements, the task is to write a function to search a given element x in arr[].

// Examples :  

// Input : arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170}, x = 110;
// Output : 6
// Explaination: Element x is present at index 6

// Input : arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170}, x = 175;
// Output : -1
// Explaination: Element x is not present in arr[].


//Why search from both sides? -  more faster to find the value since 
// 2 if statements are executed in a single loop



public class Linear_Search_Closing_Both_Sides
{

    public static void search(int arr[], int search_Element)
    // search_Element is the number we are searching for in array
    {
        int length = arr.length;
        int left = 0;
        int right = arr.length-1;
        int position = -1;
        
        for(left = 0; left <= right;)
        {
            //if search element is found from "left" variable
            if(arr[left] == search_Element)
            {
                position = left;
                System.out.println("Number found at postion " + 
                (position + 1) + " with attempt " + (left+1) );
                break;
            }

            //if search element is found from "right" variable
            if(arr[right] == search_Element)
            {
                position = right;
                System.out.println("Number found at postion " + 
                (position + 1) + " with attempt " + (length - right) );
                break;
            }
            left++;
            right--;
            
        }


        //if element not found
        if(position <= -1){
            System.out.println("the number is not in the array");
        }

    }
    public static void main(String args[] )
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int search_Element = 5;
        //Function call
        search(arr, search_Element);
    }
    
}
