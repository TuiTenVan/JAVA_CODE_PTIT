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
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) sc.readObject();
        ArrayList<Pair> res = new ArrayList<>();
        Map<Pair, Integer> myMap = new HashMap<>();
//        ArrayList<Pair> a = new ArrayList<Pair>();
//        ArrayList<Pair> res = new ArrayList<Pair>();
//        Scanner sc = new Scanner(new File("DATA.in"));
//        while (sc.hasNext()) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            a.add(new Pair(x, y));
//        }
        for (Pair i : a)
        {
            if (i.getFirst() < i.getSecond())
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