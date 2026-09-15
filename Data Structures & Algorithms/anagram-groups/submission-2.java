class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for (String s : strs){
            char[] charS = s.toCharArray();
            Arrays.sort(charS);
            String sortedKey =new String(charS);
            

            if(!map.containsKey(sortedKey)){
                map.put(sortedKey,new ArrayList<>());
            }
            map.get(sortedKey).add(s);
            

        }
        return new ArrayList<>(map.values());
    }
}
