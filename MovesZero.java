
// 283. Move Zeroes
// Solved
// Easy
// Topics
// Companies
// Hint
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

class Solution {
    public void moveZeroes(int[] nums) {
        int n=0,i=0;
       while( i < nums.length){
        if(nums[i]!=0){      // to check every element is zero or not if it not zero assign with the nums array
            nums[n] = nums[i];
            n++;}
            i++;
        }
        while(n < nums.length){   balance the element filled with zero
            nums[n] = 0;
            n++;
        }
    }
}
