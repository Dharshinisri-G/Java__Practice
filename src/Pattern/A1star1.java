package Pattern;
import java.util.*;
public class A1star1 {
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("  ".repeat(n - i));
            for (char c = 'A'; c <= 'A' + i; c++)
                System.out.print(c + " ");
            for (int j = 1; j <= i + 1; j++)
                System.out.print(j + " ");
            System.out.println();
        }
        int no = 1;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print("  ".repeat(n - i));
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j <= i + 1; j++)
                System.out.print(no++ + " ");
            System.out.println();
        }
    }
}
