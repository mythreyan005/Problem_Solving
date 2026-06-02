class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int farr[]=new int[nums.length+1];
        List<Integer> numlist=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            farr[nums[i]]++;
        }
       
        
        for(int i=1;i<=nums.length;i++){
            if(farr[i]==0)
            numlist.add(i);
        }
        
        return numlist;
    }
}