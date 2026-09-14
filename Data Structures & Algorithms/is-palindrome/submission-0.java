class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while (left<right){
            char l= Character.toLowerCase(s.charAt(left));
            char r= Character.toLowerCase(s.charAt(right));

            if (!Character.isLetterOrDigit(l)){
                left++;
                l=s.charAt(left);
            }else if(!Character.isLetterOrDigit(r)){
                right--;
                r=s.charAt(right);
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
