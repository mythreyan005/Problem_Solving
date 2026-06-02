class Solution {
    public int[] findErrorNums(int[] nums) {
        int narr[]=new int[2];
        int n=nums.length;
        int sum=0;
        int diff=0;
        int freqe=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    freqe=nums[i];
                }
            }
        }
        diff=(n*(n+1)/2)-sum;
        narr[1]=freqe+diff;
        narr[0]=freqe;
        return narr;


        
        
    }
}