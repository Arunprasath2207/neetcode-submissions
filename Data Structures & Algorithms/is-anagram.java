class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        String s1 = new String(sChar);
        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);
        String t1 = new String(tChar);
        if(s1.equals(t1))
        {
            return true;
        }
        return false;
    }
}
