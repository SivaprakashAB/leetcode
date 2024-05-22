// 217. Contains Duplicate
// Solved
// Easy
// Topics
// Companies
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> ans= new HashSet<>();              //Using hashset to check duplicate
       for(int i=0;i<nums.length;i++){
        if(ans.contains(nums[i])){                        //check the number is come which also present in the previously than it is duplicate to return true
            return true;
        }
        ans.add(nums[i]);                                // if the number does not come previously than to add the hashset certainly
       }
       return false;                                  // if the loop is complete without any distract than return false
    }
}
 
