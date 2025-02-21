package Dynamic_Programing;
import java.util.*;
public class IntegerPartition {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        x.close();
        System.out.println(countPartitions(n));
    }
    public static int countPartitions(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: One way to partition 0
        for (int num = 1; num <= n; num++) {  // Iterate over possible numbers
            for (int sum = num; sum <= n; sum++) {  // Fill dp array
                dp[sum] += dp[sum - num];
            }
        }
        return dp[n]; // The answer is dp[n], which stores the number of partitions for n
    }
}
