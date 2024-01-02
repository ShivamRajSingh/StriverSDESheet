public class StockBuyAndSell {
    public int maxProfit(int[] price) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i =0; i < price.length; i++){
            int sellingPrice = price[i];
            if(buyingPrice < sellingPrice){
                int profit = sellingPrice - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyingPrice = sellingPrice;
            }
        }
        return maxProfit;
    }
}
