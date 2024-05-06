class Solution {
    public boolean isPalindrome(int x) {
       int a=0,k=x,sum=0;
       while(x>0)
       {
         a = x%10;
         sum = (sum*10) + a;
         x = x/10;
       }   
       if(sum==k)
          return true;
       else
          return false;
    }
}
