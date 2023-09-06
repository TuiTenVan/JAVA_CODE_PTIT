import java.util.Scanner;

public class bieuThucToanHoc {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long sum = 0;
        int x = s.length() - 1;
        long j = (long)Math.pow(2, x);
        long k = 0;
        for (int i = s.length() - 1; i >= 0; i--) {  
            sum += (s.charAt(i) - '0') * j / (long)Math.pow(2, k) * (long)Math.pow(3, k);
            k++;
        }
        if((long)sum % j == 0){
            System.out.println((long)sum / j);
        }
        else{
            long r = (long)sum % j;
            long v = (long)sum - r;
            System.out.print(v / j);
            System.out.print(" ");
            System.out.println(r / gcd(j, r) + "/" + j / gcd(j, r));
        }
    }
}