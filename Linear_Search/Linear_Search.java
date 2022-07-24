package Searching_Algorithms.Linear_Search;
// Given an array arr[] of n elements, 
// the task is to write a function to search a given element x in arr[].


// Input : arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170}, x = 110;
// Output : 6
// Explaination: Element x is present at index 6

// Input : arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170}, x = 175;
// Output : -1
// Explanation: Element x is not present in arr[].

//Below code is just a simple approach that goes from 
//array[0] to right

class Linear_Search {

    public static int search(int arr[], int x){
        int n;
        n = arr.length;
        for(int i = 0; i < n; i++){
            if (arr [i] == x)
                return i;
        }
            return -1;
    }
    

    public static void main(String args []){
        int arr [] = {2, 3, 4, 10, 40, 34, 55, 66, 65, 34, 545, 454};
        int x = 454;
    
        //Function call
        int result = search(arr, x);
        if(result == -1){
            System.out.println("Element not in array");
        }
        else
            System.out.println("Element index is at " + result);
     }
}


   
