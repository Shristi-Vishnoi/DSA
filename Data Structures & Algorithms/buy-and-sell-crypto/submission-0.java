class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=0;
        for(int i=0;i<n-1;i++){
           int profit=0;
           for(int j=i+1;j<n;j++){
            profit=prices[j]-prices[i];
            maxProfit=Math.max(profit,maxProfit);
           }
        }
        return maxProfit;
    }
}
