package ThucHanh_OOP_buoi_01;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list1 = new ArrayList<String>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().toLowerCase();
            String[] arr = s.split("\\s+");
            for (int j = 0; j < arr.length; j++) {
                list1.add(arr[j]);
            }
        }
        int m = sc.nextInt();
        List<String> list2 = new ArrayList<String>();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine().toLowerCase();
            String[] arr = s.split("\\s+");
            for (int j = 0; j < arr.length; j++) {
                list2.add(arr[j]);
            }
        }
        Set<String> list3 = new TreeSet<>();
        Set<String> list4 = new TreeSet<>();
        for(String x : list1){
            if(!list2.contains(x)){
                list3.add(x);
            }
        }
        for(String x : list2){
            if(!list1.contains(x)){
                list4.add(x);
            }
        }
        for(String x : list3){
            System.out.print(x + " ");
        }
        System.out.println();
        for(String x : list4){
            System.out.print(x + " ");
        }
    }
}
