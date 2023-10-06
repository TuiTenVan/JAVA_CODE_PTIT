package test;

import java.io.FileInputStream;
import java.io.*;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.*;

public class Main
{
    public static int gcd(int a, int b){
        while(b > 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) sc.readObject();
        ArrayList<Pair> res = new ArrayList<>();
        Map<Pair, Integer> myMap = new HashMap<>();
        for (Pair i : a)
        {
            if (i.getFirst() < i.getSecond() && gcd(i.getFirst(), i.getSecond()) == 1)
            {
                if (!myMap.containsKey(i))
                {
                    myMap.put(i, 1);
                    res.add(i);
                }
            }

        }
        Collections.sort(res);
        for (Pair i : res)
            System.out.println(i);
    }
}