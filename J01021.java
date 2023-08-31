import java.util.Scanner;

public class J01021 {
    public static long mod = (int)1e9 + 7;
    public static long chiaTri(long a , long b){
        if(b == 0){
            return 1;
        }
        long x = chiaTri(a, b / 2);
        x = (x * x) % mod;
        if(b % 2 == 0){
            return x;
        }
        else{
            return (x * a) % mod;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0){
                return;
            }
            System.out.println(chiaTri(a, b));
        }
    }
}
