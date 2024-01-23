class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int[] counts = new int [nums.length];

        for(int num : nums){
            counts[num-1]++;
        }

        int[] result = new int[2];

        for(int i = 0 ; i < counts.length; i++){
            if(counts[i] == 0) result[1] = i+1;
            if(counts[i] == 2) result[0] = i+1;
        }
        return result;
    }
}