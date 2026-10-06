class Solution {
    public int maxProfit(int[] prices) {
        int minpri=prices[0];
        int maxpro = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] < minpri){
                minpri=prices[i];
            }else if(prices[i] - minpri > maxpro ){
                maxpro=prices[i] - minpri;
            }
        }
        return maxpro;
    }
}
