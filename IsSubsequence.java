// 392. Is Subsequence
// Solved
// Easy
// Topics
// Companies
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false

class Solution {
    public boolean isSubsequence(String s, String t) {
        int len = t.length();
        int j=0,i=0;
        if(s.length()>=1){
        while(j<s.length()&&i<t.length())
        {
            if(t.charAt(i)==s.charAt(j))
            {
               j++;i++;
            }
            else
            {
                i++;
            }
        }   
        if(j==s.length())
            return true;
        else
           return false;}
           return true;
    }
}
