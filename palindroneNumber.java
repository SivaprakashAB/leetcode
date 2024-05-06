// 9. Palindrome Number

// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome
    
class Solution {
    public boolean isPalindrome(int x) {
       int a=0,k=x,sum=0;
       while(x>0)   // to check the x value is grater than zero or not
       {
         a = x%10;        // to get the last number of the given number
         sum = (sum*10) + a;        // to create the reverse order of the number
         x = x/10;        // to get the divided of the number
       }   
       if(sum==k)        // to check the given and answer number is same return true
          return true;
       else                // else return false.
          return false;
    }
}
