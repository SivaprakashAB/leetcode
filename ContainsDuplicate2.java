// 219. Contains Duplicate II
// Solved
// Easy
// Topics
// Companies
// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> ans= new HashMap<>();          // to geneerate the hashmap which include the integer(key) and integer(value)
       for(int i=0;i<nums.length;i++){
        if(!ans.containsKey(nums[i])){
            ans.put(nums[i],i);                              // to update the hashmap with new key 
        }
        else{
            int prevIndex = ans.get(nums[i]);               //if the key is already present then to get the previous key index
            if(Math.abs(prevIndex-i)<=k)
               return true;                                 //if the difference between previous index and current index less than the k value then return the true
            else{
                ans.put(nums[i],i);                         //else value is greater than the k value than to only to include the key and value in the hashmap
            }
        }
    }
     return false;                                         // if the loop end wiht successfully than return false
}
}
