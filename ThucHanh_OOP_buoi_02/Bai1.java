package ThucHanh_OOP_buoi_02;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        sc.nextLine();
        BigInteger sum = new BigInteger("0");
        List<BigInteger> list = new ArrayList<>();
        while(n-- > 0) {
            BigInteger s = new BigInteger(sc.nextLine());
            list.add(s);
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
        for(BigInteger i : list) {
            sum = sum.add(i);
        }
        System.out.println(sum);
    }
}
