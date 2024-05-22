
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
        String str1 = s.toLowerCase();      // to generate the lowerecase of the first string
        String str2 = t.toLowerCase();      // to generte the lowercase of the second string

        str1 = str1.replace(" ","");    //to delete the spaces
        str2 = str2.replace(" ","");

        int[] count = new int[26];   //initrialize the array which equal to the alphabet length

        for(int i=0;i<str1.length(); i++){
            count[str1.charAt(i)-'a']++;           //to increase the count when a alphaber is present using ascii value
        }
        for(int i=0;i<str2.length(); i++){
            count[str2.charAt(i)-'a']--;         //to decrease the count when a alphabet is present which present in the first string
        }
        for(int ch : count){
            if(ch!=0)
               return false;        // if the ch is not zero then return false
        }
        return true;               // if the iteration is end wihtout any distract then return true
    }
}
