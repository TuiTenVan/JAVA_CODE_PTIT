import java.util.*;

public class J02028{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long[] a = new long[(int) n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            int ok = 0;
            int curr = 0;
            long sum = 0;
            if(k == 0 && a[0] > 0){
                ok = 0;
            }
            else{
                for(int i = 0; i < n; i++){
                    sum += a[i];
                    while(sum > k && curr <= i){
                        sum -= a[curr];
                        curr++;
                    }
                    if(sum == k){
                        ok = 1;
                        break;
                    }
                }
            }
            if(ok == 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}