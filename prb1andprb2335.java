class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int narr[]=new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
               
                if(nums[i]+nums[j]==target){
                narr[0]=i;
                narr[1]=j;
                
                }

            }

        }
        return narr;
    }
}

//prb2335

class Solution {
    public int sum(int num1, int num2) {
        return num1+num2;
    }
}