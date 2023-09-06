import java.util.Scanner;

public class MaHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long ans = n % 100;
            double result = ans * Math.pow(1 + 1.0 / 100, k);
            n += (long)result;
            System.out.println((long) result); // In ra kết quả sau k lần mã hóa
        }
    }
}
