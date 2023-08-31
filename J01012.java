import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();  
            int count = 0;
            for (int i = 1; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    if (i % 2 == 0) {
                        count++;
                    }
                    if ((N / i) != i && (N / i) % 2 == 0) {
                        count++;
                    }
                }
            }
            System.out.println(count); 
        }
    }
}
