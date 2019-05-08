class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int indexInNum2 = 0;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j])
                    indexInNum2 = j;
            }
            int nextGreaterNum = -1;
            for(int k = indexInNum2; k < nums2.length; k++){
                if(nums2[k] > nums1[i]){
                    nextGreaterNum = nums2[k];
                    break;
                }
            }
            result[i] = nextGreaterNum;
        }
        return result;
    }
}
