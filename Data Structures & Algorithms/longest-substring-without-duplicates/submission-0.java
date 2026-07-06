class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int start_point = 0;
        int current_sub = 0; 
        int max_sub = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i< s.length();i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c)>=start_point)
            {
                start_point = map.get(c)+1 ;
                current_sub = i - map.get(c);
                map.put(c,i);
                continue;

            }
            else
            {
                map.put(c,i);
                current_sub++;
            }
            if(current_sub>max_sub)
            {
                max_sub = current_sub;
            }
        }
        return max_sub;
    }
}
