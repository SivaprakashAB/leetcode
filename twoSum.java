// 1. Two Sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

    class Solution { 
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();    //to crete the map which contain integer(key) , integer (value)
       for(int i=0;i<nums.length;i++)
       {
            int compilment = target - nums[i];    // to get the compilment of the number 
            if(map.containsKey(compilment))         // to check the compilment is present in this array
            {
                return new int[]{map.get(compilment),i};    //if it is yes , return those both indexes
            }
            map.put(nums[i],i);   // to put in the hash table with the key and value
       }
       return new int[]{};    //no answer to return empty array
    }
}
