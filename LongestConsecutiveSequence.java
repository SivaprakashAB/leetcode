// 128. Longest Consecutive Sequence
// Solved
// Medium
// Topics
// Companies
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109

SOLUTION - 1
 
class Solution {
    public int longestConsecutive(int[] nums) {
       int longestlength = 0;
       HashMap<Integer,Boolean> my = new HashMap<>();
       for(int num : nums){
            my.put(num , Boolean.FALSE);
       }
       for(int num : nums)
       {
            int currentlength = 1;
            int next = num+1;
            while( my.containsKey(next) && my.get(next)==false )
            {
                currentlength++;
                my.put(next , Boolean.TRUE);
                next++;
            }

            int prevnum = num-1;
            while( my.containsKey(prevnum) && my.get(prevnum)==false ){
                currentlength++;
                my.put(prevnum , Boolean.TRUE);
                prevnum--;
            }
            longestlength = Math.max(currentlength , longestlength);
       }
       return longestlength;
    }
}

SOLUTION - 2

 class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int curr_streak=1;
        int long_streak = 1;
        if(nums.length==0)
        return 0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                if(nums[i]==nums[i-1]+1)
                curr_streak++;
                else
                {
                    long_streak = Math.max(long_streak,curr_streak);
                    curr_streak=1;
                }
            
            }
        }
        return Math.max(long_streak,curr_streak);
    }
}

SOLUTION - 3

 class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0 ; i<n ; i++){
            hs.add(nums[i]);
        }

        int max=0;

        for(int i=0 ; i<n ; i++){
            int count=1;
            
            int left=nums[i];
            while(hs.contains(--left)){
                count++;
                hs.remove(left);
            }

            int right=nums[i];
            while(hs.contains(++right)){
                count++;
                hs.remove(right);
            }

            max=Math.max(max,count);
        }
        return max;
    }
}
