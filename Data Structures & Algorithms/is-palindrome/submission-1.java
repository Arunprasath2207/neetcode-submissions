class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String lettersOnly = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = lettersOnly.length()-1;
        while(i<=j)
        {
            if(lettersOnly.charAt(i) != lettersOnly.charAt(j) )
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
