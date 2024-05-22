
// 242. Valid Anagram
// Solved
// Easy
// Topics
// Companies
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false


class Solution {
    public boolean isAnagram(String s, String t) {
        String str1 = s.toLowerCase();
        String str2 = t.toLowerCase();

        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");

        int[] count = new int[26];

        for(int i=0;i<str1.length(); i++){
            count[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length(); i++){
            count[str2.charAt(i)-'a']--;
        }
        for(int ch : count){
            if(ch!=0)
               return false;
        }
        return true;
    }
}
