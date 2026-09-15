class Solution {
    public boolean isPalindrome(String s) {
        char[] str=s.toCharArray();
        int left=0;
        int right=str.length-1;
        
        while(left <right){
            char l = Character.toLowerCase(str[left]);
            char r = Character.toLowerCase(str[right]);

            if(!Character.isLetterOrDigit(l)){
                left++;
            }else if(!Character.isLetterOrDigit(r)){
                right--;
            }else{
                if(l!=r){
                    return false;
                }
                left++;
                right--;
            }
            
        }
        return true;
    }
}
