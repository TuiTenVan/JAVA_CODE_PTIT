import java.util.Scanner;

public class J01007 {
    public static boolean fibo(long n){
        long[] f = new long[(int) 1000];
        if(n == 0 || n == 1) return true;
        f[0] = 1;
        f[1] = 1;
        int cnt = 2;
        for(int i = 2; i < 93; i++){
            f[i] = f[i - 1] + f[i - 2];
            if(f[i] == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(fibo(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
