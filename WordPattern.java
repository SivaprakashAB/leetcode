
// 290. Word Pattern
// Solved
// Easy
// Topics
// Companies
// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

// Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false
// Example 3:

// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false


class Solution {                                                                 //this problem to solve with the help of the HashMap
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> char_Map = new HashMap<>();                        //to create two Hashmap one is (Character , String)  another one is (String , Character)
        Map<String , Character> word_Map = new HashMap<>();
        String str[] = s.split(" ");                                              // to split the string where is present space (" ") based
        if(pattern.length() != str.length){                                       // if the both string length is differ then return false
            return false;
        }
        for(int i=0;i<str.length;i++)
        {
                char ch = pattern.charAt(i);                                     // to get the every character from the pattern string
                String word = str[i];                                            // to get the first word from the string
                if(!char_Map.containsKey(ch))                                    // check if the character (Key) already not contains
                {
                    if(char_Map.containsValue(word))                              //the value is already present then return false
                    {
                        return false;
                    }
                    else                                                          // the value is not present then add with the map with key , Value
                    {
                        char_Map.put(ch,word);
                    }
                }
                else                                                          //if the key already present then to get the key and to compare with the value of the current 
                {
                    String Mapped = char_Map.get(ch);
                    if(!Mapped.equals(word))                                  //if it is equals then forget else return false
                    {
                        return false;
                    }
                }
        }
        return true;                                                      //if the iterate fully then successfully wordpattern is eqaul to another then return true
    }
}
