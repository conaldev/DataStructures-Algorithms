class Solution {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] ans = new int[len];
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(prices[j]<= prices[i]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
