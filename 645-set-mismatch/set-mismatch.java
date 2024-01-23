class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);
        
        if(nums[0] != 1){
            // 누락된 숫자
            result[1] = 1;
        }
        for(int i = 0; i < nums.length-1; i ++){
            if(nums[i] == nums[i+1]){
                // 중복된 숫자
                result[0] = nums[i];
            }else if(nums[i]+1 != nums[i+1]){
                // 누락된 숫자
                result[1] = nums[i]+1;
            }
        }

        if(nums[nums.length-1] != nums.length){
            result[1] = nums.length;
        }

        return result;
    }
}