class Solution {
    public int[][] divideArray(int[] nums, int k) {

        int[][] result = new int[nums.length/3][3];

        Arrays.sort(nums);

        int index = 0;
        for(int i = 0 ; i < nums.length-2; i= i+3) {
            
            if(nums[i+2] - nums[i] > k){
                return new int[0][0];
            }

            result[index][0] = nums[i];
            result[index][1] = nums[i+1];
            result[index][2] = nums[i+2];

            index++;
        }

        return result;
    }
}