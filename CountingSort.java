import java.util.*;

class HelloWorld {
    public static void printt(int[] arr,int n){
        for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
        }
    }
    
    public static void CountSort(int[] arr,int n){
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            l=Math.max(l,arr[i]);
        }
        
        int count[]=new int[l+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={3,4,5,8,2,1,1,0,2};
        int n=arr.length;
        CountSort(arr,n);
        printt(arr,n);
    }
}
