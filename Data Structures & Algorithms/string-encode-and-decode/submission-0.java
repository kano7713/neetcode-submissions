class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s:strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> res = new ArrayList();

        while (i<str.length()){
            int j=i;

            while (str.charAt(j)!='#'){
                j++;
            }
            int startS=j+1;
            int len=Integer.parseInt(str.substring(i,j));
            
            res.add(str.substring(startS,startS+len));

            i=startS+len;
            
          
            
        }
        return res;
    }
}
