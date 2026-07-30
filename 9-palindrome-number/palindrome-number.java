class Solution {
    public boolean isPalindrome(int x) {
         String no =Integer.toString(x);

         for(int i=0;i<no.length()/2;i++)
         {
            if(no.charAt(i)!=no.charAt(no.length()-i-1))
            {
                return false;
            }
         }
         return true;
    }
}