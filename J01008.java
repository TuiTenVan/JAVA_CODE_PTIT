import java.util.*;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++){
            long n = sc.nextLong();
            System.out.print("Test " + (k + 1) + ": ");
            for(long i = 2; i <= n; i++){
                if(n % i == 0){
                    long cnt = 0;
                    System.out.print(i + "(");
                    while(n % i == 0){
                        cnt++;
                        n /= i;
                    }
                    System.out.print(cnt + ") ");
                }
            }
            if(n > 1){
               System.out.print(n + "(1)");
            }
            System.out.println();
        }
    }
}
// Test 1: 2(2) 3(1) 5(1)
// Test 2: 2(7)
// Test 3: 2(4) 5(4)