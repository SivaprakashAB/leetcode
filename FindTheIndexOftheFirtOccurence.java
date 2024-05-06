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
