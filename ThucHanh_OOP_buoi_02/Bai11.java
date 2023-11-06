package ThucHanh_OOP_buoi_02;

import java.util.Scanner;

public class Bai11 {
    static String s = "";
    static void check(){
        System.out.print(s);
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
    }
    static void run(int i, int n){
        String tmp = s;
        s += "0";
        if(s.length() < n){
            run(i + 1, n);
        }
        else check();
        s = tmp;
        s += "1";
        if(s.length() < n){
            run(i + 1, n);
        }
        else check();
        s = tmp;
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            for(int i = 2; i <= n; i+=2){
                run(1, i/2);
            }
            System.out.println();
        }
    }
}
