import java.util.*;

class HelloWorld {
    public static int find(int[] arr,int x,int k){
        int i=0;
        //Mainly it is a linear search with a custom change
        while(i<arr.length){
            if(arr[i]==x){
                return i;   //returns index number
            }
            
            //Jump the difference between
            // current array element and x
            // divided by k We use max here
            i = i + Math.max(1, Math.abs(arr[i]
                                      - x) / k);
        }
        System.out.println("Element not found.");
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 7, 6 };
        int x = 6;
        int k = 2;
         
        System.out.println("Element " + x +
                        " is present at index "
                        + find(arr, x, k));
    }
}
