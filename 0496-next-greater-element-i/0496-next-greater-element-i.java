class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] dummy=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums1[i]!=nums2[j]){
                j++;
            }
            int gre=-1;
            for(int k=j+1;k<nums2.length;k++){
                if(nums2[j]<nums2[k]){
                    gre=nums2[k];
                    break;
                }
            }
            dummy[i]=gre;
        }
        return dummy;
    }
}