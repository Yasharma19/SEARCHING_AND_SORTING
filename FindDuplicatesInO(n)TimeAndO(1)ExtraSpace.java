class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        if(n==1){
            return res;
        }
        for(int i=0;i<n;i++){
            nums[nums[i]%n]=nums[nums[i]%n]+n;
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(nums[i]>n*2){
                res.add(i);
                flag=true;
            }
        }

        if(!flag){
            res.add(-1);
        }
        return res;
    }
}
