package ThucHanh_OOP_buoi_01;

import java.io.*;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.*;

public class Bai12{
    public static void main(String[] args) throws Exception {
        FileInputStream in1 = new FileInputStream("DATA1.in");
        FileInputStream in2 = new FileInputStream("DATA2.in");
        ObjectInputStream o1 = new ObjectInputStream(in1);
        ObjectInputStream o2 = new ObjectInputStream(in2);
        ArrayList<String> list1 = (ArrayList<String>) o1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
        Set<String> set1 = new TreeSet<>(list1);
        Set<Integer> set2 = new TreeSet<>(list2);
        List<String> ans = new ArrayList<>();
        for(String s : set1){
            String tmp = s;
            for(Integer s2 : set2){
                tmp += s2;
                ans.add(tmp);
                tmp = s;
            }
        }
        for(String s : ans){
            System.out.println(s);
        }
        o1.close();
        o2.close();
    }
}