public class bestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
    //Brute force

    // public static int maxProfit(int[] prices){
    //     int result=0;
    //     for(int i=0;i<prices.length;i++){
    //         for(int j=i+1;j<prices.length;j++){
    //             result=Math.max(result, prices[j]-prices[i]);
    //         }
    //     }
    //     return result;
    // }

    //Optimal approach using one for looop O(n)time complexity and o(1) space complexity
    public static int maxProfit(int[] prices){
        int minPrice=prices[0];
        int result=0;
        for(int i=1;i<prices.length;i++){
            minPrice=Math.min(minPrice, prices[i]);
            result=Math.max(result,prices[i]-minPrice);
        }
        return result;
    }
}
