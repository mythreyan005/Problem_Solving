class Solution {
    public int missingNumber(int[] nums) {
    
        int nu=nums.length;
        int sum=0;
        nu=nu*(nu+1)/2;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return nu-sum;

    }
}