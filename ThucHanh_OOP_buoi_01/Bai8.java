package ThucHanh_OOP_buoi_01;

import java.io.*;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Bai8{
    public static boolean check(int n){
        String s = "";
        s = n + "";
        if(s.length() < 2) return false;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        FileInputStream in1 = new FileInputStream("DATA1.in");
        FileInputStream in2 = new FileInputStream("DATA2.in");
        ObjectInputStream o1 = new ObjectInputStream(in1);
        ObjectInputStream o2 = new ObjectInputStream(in2);
        ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
        int[] a = new int[100000];
        int[] b = new int[100000];
        for(Integer i : list1){
            if(check(i)){
                a[i]++;
            }
        }
        for(Integer i : list2){
            if(check(i)){
                b[i]++;
            }
        }
        for(int i = 0; i < 100000; i++){
            if(a[i] > 0 || b[i] > 0){
                System.out.println(i + " " + a[i] + " " + b[i]);
            }
        }
    }
}