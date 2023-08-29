import java.util.*;

class HelloWorld{
    
    public static int T(int[] arr,int a){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]<a){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={5,1,3,4,7};
        System.out.println(T(arr,12));
    }
}
