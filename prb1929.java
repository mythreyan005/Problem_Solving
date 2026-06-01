import java.util.Arrays;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length*2;
        int ans[]=new int[n];
        for(int i=0;i<n/2;i++){
            ans[i]=nums[i];
        }
        for(int i=n/2;i<n;i++){
            ans[i]=nums[i-(n/2)];
        }
        return ans;

        
    }
}