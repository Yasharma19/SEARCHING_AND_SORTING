import java.util.*;

class HelloWorld {
    
    public static int Equal(int[] arr){
        int sum=0;
        int n=arr.length;
        int y;
        //Odd-take middle
        if(n%2==1){
            y=arr[n/2];
        }
        //Even-take average
        else{
            y=(arr[n/2]+arr[(n-2)/2])/2;
        }
        for(int i=0;i<n;i++){
            sum+=Math.abs(arr[i]-y);     //this is given in the question
        }
        return sum;
    }
    
    public static void main(String[] args){
        int arr[] = { 1, 100, 101 };
        Arrays.sort(arr);
        System.out.println(Equal(arr));
    }
}
