import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            long sum = 0;
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            long res = 0;
            int index = -1;
            for(int i = 1; i <= n; i++){
                sum -= a[i];
                if(sum == res){
                    index = i;
                    break;
                }
                res += a[i];
            }
            System.out.println(index);
        }
    }
}