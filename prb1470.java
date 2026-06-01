class Solution {
    public int[] shuffle(int[] nums, int n) {
       int i=0;
       int k=0;
       int j=n;
       int narr[]=new int[n*2];
      while(i<n && j<n*2){
        narr[k]=nums[i];
        k++;
        narr[k]=nums[j];
        i++;
        j++;
        k++;

      }
       
        return narr;

    }
}

