class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int count=0;
        int x=0;
        for(int i=0;i<nums.length;i++){
             sum=sum+nums[i];
             while(nums[i]>0){
                x=nums[i]%10;
             count=count+x;
             nums[i]=nums[i]/10;

             }


        }
        return Math.abs(sum-count);


        
    }
}