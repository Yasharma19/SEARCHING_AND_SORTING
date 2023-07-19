import java.util.*;

class HelloWorld {
    
    public static int Ceiling(int[] arr,int low,int high,int x){
        
        //if less than 1st element,then it is ceiling
        if(x<arr[low]){
            return arr[low];
        }
        
        for(int i=low;i<high;i++){
            
            //if x is present itself then return x  as Ceiling.
            if(arr[i]==x){
                return arr[i];
            }
            
            //Between Two Elements
            if(x>arr[i] && x<=arr[i+1]){
                return arr[i+1];
            }
            
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 10, 10, 12, 19};
        int x=3;
        System.out.println(Ceiling(arr,0,arr.length-1,x));
    }
}
