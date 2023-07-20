import java.util.*;

class HelloWorld {
    public static void Pair(int[] arr,int size,int n){
        Arrays.sort(arr);
        int l=0;
        int r=1;
        
        n=Math.abs(n); // taking Absolute value
        while(l<r && r<size){
            int diff=arr[r]-arr[l];
            if(diff==n && r!=l){
                System.out.println("Pair found ("+arr[l]+","+arr[r]+")");
                return;
            }
            else if(diff>n)
                l++;
            else
                r++;
        }
        System.out.println("No pair found");
        return;
        
        
    }
    public static void main(String[] args) {
        int arr[] = { 1, 8, 30, 40, 100 };
        int size=arr.length;
        int n=60;
        Pair(arr,size,n);
    }
}
