package Pattern;
import java.util.*;
public class PascalTriangle {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 0; i < n; i++) {
            int num = 1;
            System.out.print(" ".repeat(n - i - 1));
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
