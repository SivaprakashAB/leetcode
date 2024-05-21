
// 383. Ransom Note
// Solved
// Easy
// Topics
// Companies
// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

 

// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true

class Solution {                                                             //  this question used to solve the hashing method 
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ans = new int[26];                   // to create a integer array which is have element equal to alphabet length
        for(char ch : magazine.toCharArray()){     // to change the magazine string convert char array and to iterate with for each method
            ans[ch-'a']++;                         // to increase the suitable element address value in the ans array
        }
        for(char ch: ransomNote.toCharArray()){
            ans[ch-'a']--;                         // to decrease the suitable element address value in the ans array
            if(ans[ch-'a']<0)                      // if does any have the value in the ans array then return false ( difference to ransomenote , magazine )
              return false;
        }
        return true;                               //if all itertor is finish then return true
    }
}
