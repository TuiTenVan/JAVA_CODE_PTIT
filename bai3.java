import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(" ");
        int l = Integer.parseInt(inputLine[0]);
        int h = Integer.parseInt(inputLine[1]);
        String p = scanner.nextLine().trim();

        int result = countPrimeSubstrings(l, h, p);
        
        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasSubstring(int num, String p) {
        String numStr = Integer.toString(num);
        return numStr.contains(p);
    }

    public static int countPrimeSubstrings(int l, int h, String p) {
        int[] isPrime = sieve(h);
        int count = 0;
        for (int i = l; i <= h; i++) {
            if (i < isPrime.length && isPrime[i] == 1 && hasSubstring(i, p)) {
                count++;
            }
        }
        return count;
    }

    public static int[] sieve(int n) {
        int[] isPrime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = 1;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = 0;
                }
            }
        }
        return isPrime;
    }
}
