// 275. H-Index II
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper and citations is sorted in ascending order, return the researcher's h-index.

// According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

// You must write an algorithm that runs in logarithmic time.

 

// Example 1:

// Input: citations = [0,1,3,5,6]
// Output: 3
// Explanation: [0,1,3,5,6] means the researcher has 5 papers in total and each of them had received 0, 1, 3, 5, 6 citations respectively.
// Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
// Example 2:
// Input: citations = [1,2,100]
// Output: 2
 

// Constraints:

// n == citations.length
// 1 <= n <= 105
// 0 <= citations[i] <= 1000
// citations is sorted in ascending order.

SOLUTION - 1 
 
 class Solution {
    public int hIndex(int[] citations) {
        int i=0;
        while( i < citations.length && citations [citations.length-1-i] > i)
               i++;
        return i;
    }
}

SOLUTION - 2

 class Solution {
    public int hIndex(int[] citations) {
        int l = 0;
        int h = citations.length;
        int ans = -1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(ispossible(citations,m)){
                ans = m;
                l = m+1;
            }else{
                h = m-1;
            }
        }
        return ans;
    }
    public boolean ispossible(int []citations,int m){
        int count = 0;
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=m){
                count++;
            }
            if(count>=m){
                return true;
            }
        }
        return false;
    }
}

SOLUTION - 3

 class Solution {
    public int hIndex(int[] cit) {
        int mxP = 0;
        int n = cit.length;
        // int mx = cit[0];
        // for(int i=1;i<n;i++){
        //     mx = Math.max(mx,cit[i]);
        // }
        Arrays.sort(cit);
        for(int i=1;i<=n;i++){
            if(cit[n-i]>=(i)){
                mxP=i;
            }
            else{
                break;
            }
        }
        return mxP;
        
    }
}
