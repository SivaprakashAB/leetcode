// 189. Rotate Array
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:

// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]


class Solution {
    public void rotate(int[] nums, int k) {
    int j=0,m=0;
    int[] num = new int[k];
    int n = nums.length;
      m=0;
      if(k>n){
      k = k-n;
      }
      if(n>1){
        if((k%2==1)&&(n==2))    // to check the length of the given array is 2 elements only and k is odd
        {
           int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
        else if((k%2==0)&&(n==2)){   //to check the length of the given array is 2 elements only and k is even
            nums[0] = nums[0];
            nums[1] = nums[1];
        }
        else{
      for(int i=n-k;i<n;i++)
        {
            num[m] = nums[i];  // take the last 3 element only to assign to another array
            m++;
        }
        for(int i=n-k-1; i>=0; i--)
        {
            nums[i+k] = nums[i];  // to assign the 1,2,3,4,5,6 k=3 then _,_,_,1,2,3
        }
        for(int i=0;i<k;i++)
        {
            nums[i] = num[i];  // to assign the 4,5,6 in the front of the array
        }
    }}
    }
}
