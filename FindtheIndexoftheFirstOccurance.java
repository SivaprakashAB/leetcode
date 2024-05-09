28. Find the Index of the First Occurrence in a String
Solved
Easy
Topics
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

class Solution {
    public int strStr(String haystack, String needle) {
        int answer =0;      // initialize the answer integer variable
        int len = needle.length();  //save the length of the needle into len variable
    for(int i=0;i<=haystack.length()-len;i++)   // limit is array - needle length
    {
        int k=i;int j=0,m=0;
        while(haystack.charAt(k)==needle.charAt(m)&&m<needle.length()){ // to check all charater in the needle equal to the haystack also the limit is needle length
            if(j==0)
            {
                answer = k; // save the first same word index (needle, haystack)
            }
            j++;k++;m++;
            if(j==needle.length()) // check the continuos same characters in the needle and haystack equal to needle length
            {
                return answer;
            }
        }
    }
    return -1;
}
}
