package leetcode;

public class stock {
    
    public int maxProfit(int[] prices) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        int biggest = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < left) {
                left = prices[i];
                right = Integer.MIN_VALUE;
            }else if (prices[i] > right && prices[i] > left) {
                right = prices[i];
                int temp = right -left;
                if (temp > biggest) {
                    biggest = temp;
                }

            }
        }
        return biggest;

    }
}
