// 49. Group Anagrams
// Solved
// Medium
// Topics
// Companies
// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2:

// Input: strs = [""]
// Output: [[""]]
// Example 3:

// Input: strs = ["a"]
// Output: [["a"]]
 

// Constraints:

// 1 <= strs.length <= 104
// 0 <= strs[i].length <= 100
// strs[i] consists of lowercase English letters.

SOLUTION - 1

 class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> stringAnagramsMap = new HashMap<>();
        for (String s : strs) {
             char[] arr = s.toCharArray();
             Arrays.sort(arr);
             String key = String.valueOf(arr);

        if (!stringAnagramsMap.containsKey(key))
              stringAnagramsMap.put(key, new ArrayList<>());

        stringAnagramsMap.get(key).add(s);
    }

    List<List<String>> resultList = new ArrayList<>();
    for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
         resultList.add(stringAnagrams.getValue());
    }
    return resultList;
  }
}

SOLUTION - 2

 class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> ls = new ArrayList<>();
        HashMap<String, List<String>> m = new HashMap<>();
        for(String str:strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);

            String sortedString = new String(temp);

            m.putIfAbsent(sortedString, new ArrayList<>());
            m.get(sortedString).add(str);
        }

        return new ArrayList<>(m.values());
    }
}

SOLUTION - 3

 class Solution {
     public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramHashMap = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (String s : strs) {
            char[] count = new char[26];
            for (char c : s.toCharArray())
                count[c - 'a']++;

            String countString = new String(count);

            List<String> anagrams = anagramHashMap.getOrDefault(countString, new ArrayList<>());
            anagrams.add(s);
            anagramHashMap.put(countString, anagrams);
        }

        ans.addAll(anagramHashMap.values());

        return ans;
    }
}
