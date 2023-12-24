import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextDouble();
        double max_value = -1000000000; // 9 so 0
        double min_value = 1000000000;
        double ans = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            max_value = Math.max(max_value, a[i]);
            min_value = Math.min(min_value, a[i]);
        }
        for(int i = 0; i < n; i++) {
            if(a[i] != max_value && a[i] != min_value){
                ans += a[i];
                cnt += 1;
            }
        }
        System.out.println(String.format("%.2f", ans / cnt));
    }
}