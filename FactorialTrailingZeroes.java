// 172. Factorial Trailing Zeroes
// Solved
// Medium
// Topics
// Companies
// Given an integer n, return the number of trailing zeroes in n!.

// Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

 

// Example 1:

// Input: n = 3
// Output: 0
// Explanation: 3! = 6, no trailing zero.
// Example 2:

// Input: n = 5
// Output: 1


 class Solution {
    public int trailingZeroes(int n) {
      int result =0;
      while(n>0)
      {
        n = n/5;        // every interval of 5 number increase the number of zero  +1, so divided 5 commonly
        result = result +  n;
      }
      return result;
    }
}
Explanation: 5! = 120, one trailing zero.
Example 3:

Input: n = 0
Output: 0
