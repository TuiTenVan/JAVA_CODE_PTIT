package Ktra;
import java.util.*;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        TreeSet<Integer> giao = new TreeSet<Integer>();
        TreeSet<Integer> set = new TreeSet<Integer>();
        TreeSet<Integer> hieu = new TreeSet<Integer>();
        TreeSet<Integer> hieu1 = new TreeSet<Integer>();
        TreeSet<Integer> hieu2 = new TreeSet<Integer>();
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            if(set.contains(b[i])){
                giao.add(b[i]);
            }
            hieu.add(b[i]);
        }
        for(int i=0; i< n; i++) {
            if(!giao.contains(a[i])){
                hieu1.add(a[i]);
            }
        }
        for(int i=0; i< m; i++) {
            if(!giao.contains(b[i])){
                hieu2.add(b[i]);
            }
        }
        for(Integer i : giao){
            System.out.print(i + " ");
        }
        System.out.println();
        for(Integer i : hieu1){
            System.out.print(i + " ");
        }
        System.out.println();
        for(Integer i : hieu2){
            System.out.print(i + " ");
        }
    }
}
