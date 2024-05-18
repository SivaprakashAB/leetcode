// 69. Sqrt(x)
// Solved
// Easy
// Topics
// Companies
// Hint
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.
// Example 2:

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.



 class Solution {
    public int mySqrt(int x) {
        long low =0,high=x,ans=0;
        while(low<=high) 
        {
            long mid = (low+high)/2;  // to get the middle value of the given number
            if(mid*mid == x)  //check its mid * mid == value
              return (int)mid;
            else if(mid*mid < x)  // if the mid * mid value less than given x then increase the low and ans = mid
            {
                low = mid+1;
                ans = mid;
            }
            else
            {
                high = mid-1;  //else to decrease ethe high value
            }
        }
        return (int)ans;
    }
}
