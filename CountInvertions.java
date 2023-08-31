// COUNT INVERTIONS ARE THE COUNT OF COMPARE OF LEFT>RIGHT, 0 WHEN SORTED AND MAXIMUM WHEN IN REVERSE ORDER//

// SOLUTION WITH HIGH TIME COMPLEXITY = O(N2)
class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {   
        long ans=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]>arr[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
}
