class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        // we use xor for these type of question (bcoz xor of same element is 0 )
        // here by iterating we store xor of numbers from 0 to length of array so it will cancel the same element
        // & return the single time repeating number
        for(int i=0; i<nums.length;i++){
            res ^= nums[i];
        }
        return res;
    }
}