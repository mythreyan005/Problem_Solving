class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int a=m+n;
        while(i<n && m<a){
            nums1[m]=nums2[i];
            i++;
            m++;
        }
        Arrays.sort(nums1);
        
    }
}