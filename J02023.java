import java.util.Scanner;

public class J02023{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();

        if (n == 1 && s < 10) {
            System.out.println(s + " " + s);
        } else if (s == 0 || s > n * 9) {
            System.out.println("-1 -1");
        } else {
            int k = s / 9;
            int d = s - k * 9;
            if (k == n) {
                for (int i = 0; i < n; i++)
                    System.out.print(9);
                System.out.print(" ");
                for (int i = 0; i < n; i++)
                    System.out.print(9);
            } else if (d == 0) {
                System.out.print(1);
                for (int i = k + 1; i < n; i++)
                    System.out.print(0);
                System.out.print(8);
                for (int i = 1; i < k; i++)
                    System.out.print(9);
                System.out.print(" ");
                for (int i = 0; i < k; i++)
                    System.out.print(9);
                for (int i = k; i < n; i++)
                    System.out.print(0);
            } else {
                if (k == n - 1) {
                    System.out.print(d);
                    for (int i = k + 1; i < n; i++)
                        System.out.print(0);
                    for (int i = 0; i < k; i++)
                        System.out.print(9);
                } else {
                    System.out.print(1);
                    for (int i = k + 2; i < n; i++)
                        System.out.print(0);
                    System.out.print(d - 1);
                    for (int i = 0; i < k; i++)
                        System.out.print(9);
                }
                System.out.print(" ");
                for (int i = 0; i < k; i++)
                    System.out.print(9);
                System.out.print(d);
                for (int i = k + 1; i < n; i++)
                    System.out.print(0);
            }
        }

        scanner.close();
    }
}
