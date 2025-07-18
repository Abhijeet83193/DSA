public class profitstock {
    public static int profit(int prices[]) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++ ){
            if (buyPrice < prices[i]) {
                int stockProfit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, stockProfit); 
            }else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
        
    }
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        int result = profit(prices);
        System.out.println(result);
    }
}
