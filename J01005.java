// import java.util.Scanner;
import java.util.*;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            double s = (1 * h) / 2;
            double x = s / n;
            List<Double> d = new ArrayList<Double>();
            for(int i = 1; i < n; i++){
                double hi = Math.sqrt((x * i * Math.pow(h, 2)) / s);
                d.add(hi);
            }
            for(double k : d){
                System.out.printf("%.6f ", k);
            }
            System.out.println();
        }
    }
}
