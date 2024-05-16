// 15. 3Sum
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length==0||nums.length<3) 
          return new ArrayList<>();

        Arrays.sort(nums);   // arrays sorted
        Set<List<Integer>> ans = new HashSet<>();  // create a hashset to verify the sum is already getting or not
        for(int i=0; i<nums.length-2; i++)
        {
            int left = i+1;      // this to get the 1 st position of given array
            int right = nums.length-1;   // this is to get the last element of the given array

            while(left<right){
                int total = nums[i] + nums[left] + nums[right];  // to sum the 3 numbers
                if(total == 0 ){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));  // the total equals to zero then add
                    left++;
                    right--;
                }
                else if(total < 0)   //total have less than 0 to increase the left
                   left++;
                else
                   right--;   // else to decrease the right
            }
        }
        return new ArrayList(ans);  // the new arraylist which have the ans array
    }
}
