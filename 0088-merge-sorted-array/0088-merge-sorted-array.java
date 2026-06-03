class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] nums3 = new int[n+m];
        int l=0;
        int  r=0;
        int index=0;
        while(l <m && r<n){
            if(nums1[l] < nums2[r]){
                nums3[index++]=nums1[l++];
            }else{
                nums3[index++]= nums2[r++];
            }
        }
        while(l<m){
            nums3[index++]=nums1[l++];
        }
        while(r<n){
            nums3[index++]=nums2[r++];
        }
        
        for (int i = 0; i < m + n; i++) {
            nums1[i] = nums3[i];
        }
    }
}