class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int k=0;
       
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1)
        count++;
       
  
        else if(nums[i]==0){
            if(k==0){
            k=count;
            count=0;
            }
            else
            {
                if(count>k){
                    k=count;
                }
                count=0;
            }
        }
         if(i==nums.length-1){
            if(count>k)
            k=count;

        }
  
       }
       return k;
        
    }
}