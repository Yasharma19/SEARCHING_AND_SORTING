import java.util.*;

class HelloWorld {
    
    public static boolean Sorted(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
      //Reversing the array
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        //Checking the adjacent elements  
        for(int i=0;i<n-2;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        int arr[] = {8,7,6,1,4,3,2,1};
        System.out.println(Sorted(arr));
    }
}
