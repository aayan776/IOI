import java.util.Arrays;
public class Tallest_Bar{
    public static int maxProfit(int[] prices){
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
    public static int[] leftMax(int[] height){
        int n = height.length;
        int[] left = new int[n];

        if (n == 0) return left;

        left[0] = height[0];

        for (int i = 1; i < n; i++){
            left[i] = Math.max(left[i - 1], height[i]);
        }
        return left;
    }
    public static int[] rightMax(int[] height){
        int n = height.length;
        int[] right = new int[n];

        if (n == 0) return right;

        right[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--){
            right[i] = Math.max(right[i + 1], height[i]);
        }
        return right;
    }
    public static int trapped(int[] height){
        int n = height.length;
        int[] left = leftMax(height);
        int[] right = rightMax(height);

        int water = 0;

        for (int i = 0; i < n; i++){
            water += Math.max(left[i], right[i]) - height[i];
        }
        return water;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        // Bar heights
        int[] height = {4, 2, 0, 3, 2, 5};
        // Display Stock Profit
        System.out.println("Maximum Stock Profit: " + maxProfit(prices));
        // Display Left Maximum
        System.out.println("Left Maximum Array: " + Arrays.toString(leftMax(height)));
        // Display Right Maximum
        System.out.println("Right Maximum Array: " + Arrays.toString(rightMax(height)));
        // Display Trapped Rainwater
        System.out.println("Total Trapped Water: " + trapped(height));
    }
}