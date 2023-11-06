package ThucHanh_OOP_buoi_03;

import java.util.Scanner;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Set<Integer> se1 = new TreeSet<Integer>();
            Set<Integer> se2 = new LinkedHashSet<Integer>();
            List<Integer> list = new ArrayList<Integer>();
            int n = sc.nextInt();
            int[] a= new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] % 2 == 0){
                    se1.add(a[i]);
                }
                else{
                    list.add(a[i]);
                }
            }
            list.sort((s1,s2) -> s2 - s1);
            for(Integer x : list){
                se2.add(x);
            }
            for(Integer y : se1){
                System.out.print(y + " ");
            }
            System.out.println();
            for(Integer z : se2){
                System.out.print(z + " ");
            }
            System.out.println();
        }
    }
}
