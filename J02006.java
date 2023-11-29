import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];        
        int[] b = new int[m];        
        TreeSet<Integer> h = new TreeSet<Integer>();
        // TreeSet<Integer> ans = new TreeSet<Integer>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        for(int x : a){
            h.add(x);
        }
        for(int x : b){
            h.add(x);
        }
        for(int x : h){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
