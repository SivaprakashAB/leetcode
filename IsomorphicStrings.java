
// 205. Isomorphic Strings
// Solved
// Easy
// Topics
// Companies
// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

// Example 1:

// Input: s = "egg", t = "add"
// Output: true
// Example 2:

// Input: s = "foo", t = "bar"
// Output: false
// Example 3:

// Input: s = "paper", t = "title"
// Output: true


public class Solution {

  boolean isIsomorphic(String s, String t) {

    if (s.length() != t.length()) {             // Check the length of the both if it is not same then return false
      return false;
    }

    Map<Character, Character> charMappingMap = new HashMap<>();    // Create a hashmap to store character mappings (this problem solving iwht HashMap)

    for (int i = 0; i < s.length(); i++) {

      char original = s.charAt(i);                                   // to get the first character of the s string
      char replacement = t.charAt(i);                                // to get the first character of the t string

      if (!charMappingMap.containsKey(original)) {                   //to check if the original is already contains the HashMap (Key)
        if (!charMappingMap.containsValue(replacement))              //to check if the replacement is already contains the HashMap (Value)
          charMappingMap.put(original, replacement);                 //then put the key and value in the map
        else
          return false;                                              // if the key does not contain but the value is contain then definitely is not Isomorphic 
      }
      else {
        char mappedCharacter = charMappingMap.get(original);         // if the key contains already
        if (mappedCharacter != replacement)                          // check the key and value is equal if it not equal then return false;
          return false;
      }
    }
    return true;                                                     // if the iterate successfully then the two string are Isomorphic so  return true
  }

}
 
