package Dynamic_Programing;
import java.util.*;

public class IntegerComposition{
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int[] dp = new int[n + 1];
        if (n == 0) dp[0] = 1;
        if (n >= 1) dp[1] = 1;
        if (n >= 2) dp[2] = 2;
        if (n >= 3) dp[3] = 4;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        if(n!=0)
        System.out.println(dp[n]);
    }
}
