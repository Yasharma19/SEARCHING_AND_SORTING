import java.util.*;

class HelloWorld {
    public static void Swap(int[] arr1,int[] arr2,int idx1,int idx2){
        if(arr1[idx1]>arr2[idx2]){
            int temp=arr1[idx1];
            arr1[idx1]=arr2[idx2];
            arr2[idx2]=temp;
        }
    }
    //USING GAP METHOD, WE TAKE A GAP BETWEEN LEFT AND RIGHT AND COMPARE IF LEFT>RIGHT THEN SWAP IT 
    //SWAP=(m+n)/2
    public static void Merge(int[] arr1,int[] arr2,int n,int m){
        int l=(n+m);
        int gap=(l/2)+(l%2);  //% for ceiling
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<l){
                //Left in arr1 and Right in arr2
                if(left<n && right>=n){
                    Swap(arr1,arr2,left,right-n);
                }
                //Both in arr2
                else if(left>=n){
                    Swap(arr1,arr2,left-n,right-n);
                }
                //Both in arr1
                else{
                    Swap(arr1,arr2,left,right);
                }
                left++;
                right++;
            }
            if(gap==1){
                break;
            }
            gap=(gap/2)+(gap%2);
        }
    }
    
    public static void main(String[] args) {
        int[] arr1={1,2,4,6,10};
        int[] arr2={0,3,8};
        
        Merge(arr1,arr2,arr1.length,arr2.length);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        
    }
}
