class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];

        int rank = 1;
        for(int i = 0; i < nums.length; i++){
            int maxIndex = 0;
            int j = 0;
            while(j < nums.length){
                if(nums[j] > nums[maxIndex]){
                    maxIndex = j;
                }
                j++;
            }
            nums[maxIndex] = -1;
            if(rank == 1) result[maxIndex] = "Gold Medal";
            else if(rank == 2) result[maxIndex] = "Silver Medal";
            else if(rank == 3) result[maxIndex] = "Bronze Medal";
            else result[maxIndex] = Integer.toString(rank);
            rank++;
        }
        return result;
    }
}
