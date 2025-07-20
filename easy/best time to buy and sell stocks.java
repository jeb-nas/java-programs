class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int buy=prices[0];
        for (int i=1;i<prices.length;i++){
        if (buy>prices[i])
        buy=prices[i];
    pro=Math.max(prices[i]-buy,pro);
      }
       return pro; 
    }
}
