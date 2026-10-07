class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int longest =0;
        int left=0;
        
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);

            if (map.containsKey(c)){
                
                left=Math.max(left,map.get(c)+1);
            }
            map.put(c,right);
            if(longest < (right-left)+1){
                longest= right-left+1;
            }


        }
        return longest;
    }
}
