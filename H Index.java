// 274. H-Index
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

// According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

 

// Example 1:

// Input: citations = [3,0,6,1,5]
// Output: 3
// Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
// Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
// Example 2:

// Input: citations = [1,3,1]
// Output: 1
 

// Constraints:

// n == citations.length
// 1 <= n <= 5000
// 0 <= citations[i] <= 1000

SOLUTION - 1
 
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);             // to sort the array 
        int i=0;
        while( i < citations.length && citations [citations.length-1-i] > i)  // to check the i value is less than citations length and check back to front value is grearter than i
               i++;
        return i;
    }
}

SOLUTION - 2
 
 class Solution {
    public int hIndex(int[] citations) {
        int l = citations.length;
        int[] buckets = new int[l+1];
        
        for (int c:citations){
            if (c>=l){
                buckets[l]++;
            }else{
                buckets[c]++;
            }
        }

        int count = 0;
        for (int i=l; i>=0; i--){
            count+=buckets[i];
            if (count>=i){
                return i;
            }
        }
         return 0;
    }
}

SOLUTION - 3

 class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        sort(citations);
        
        int count = 0;
        int ans = 0;
        for(int i=n-1;i>=0;i--){
            count++;
            if(citations[i] >= count){
                ans = Math.max(count,ans);
            }
            else
            break;
        }
    
    return ans;
    }

    void sort(int[] nums){
        int max = -1;
        for(int x : nums){
            if(x>max)
            max = x;
        }

        int[] arr = new int[max+1];

        for(int x : nums)
        arr[x]++;

        int p = 0;
        for(int i=0;i<=max;i++){
            while(arr[i]!=0){
            nums[p++] = i;
            arr[i]--;
            }
        }

    }
