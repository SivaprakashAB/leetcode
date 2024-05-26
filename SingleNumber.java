// 136. Single Number
// Solved
// Easy
// Topics
// Companies
// Hint
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]
// Output: 1
// Example 2:

// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:

// Input: nums = [1]
// Output: 1
 

// Constraints:

// 1 <= nums.length <= 3 * 104
// -3 * 104 <= nums[i] <= 3 * 104
// Each element in the array appears twice except for one element which appears only once.

SLOUTION - 1
 
class Solution {
    public int singleNumber(int[] nums) {
      int sing = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sing = sing ^ nums[i];
    }
    return sing;
    }
}

SOLUTION - 2

 class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i+=2){
            if(nums[i-1] != nums[i]){
                return nums[i-1];
            }
            
        }
        return nums[nums.length-1];
    }
}

SOLUTION - 3

 class Solution {
    public int singleNumber(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    i = j - 1;
                    break;
                }
            }
        }
        return nums[nums.length - 1];
    }
}
