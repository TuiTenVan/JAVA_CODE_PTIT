package ThucHanh_OOP_buoi_03;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class CheckOnline{
    private String name;
    private Date start, end;
    public CheckOnline(String name, String start, String end) throws ParseException{
        this.name = name;
        this.start = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(start);
        this.end = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(end);
    }
    public long check(){
        long x = start.getTime();
        long y = end.getTime();
        return (y - x) / (1000 * 60);
    }
    public String toString(){
        return name + " " + check();
    }
}
public class Bai2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<CheckOnline> list = new ArrayList<CheckOnline>();
        while(t-- > 0) {
            String name = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();
            CheckOnline c = new CheckOnline(name, start, end);
            list.add(c);
        }
        list.sort((s1,s2) -> Long.compare(s2.check(), s1.check()));
        for(CheckOnline s : list){
            System.out.println(s);
        }
    }
}
