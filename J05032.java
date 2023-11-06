import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

class Age{
    private String name;
    private Date birth;
    public Age(String name, String birth) throws ParseException{
        this.name = name;
        this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
    }
    public long getCheckAge(){
        long x = birth.getTime() / (60 * 60 * 1000);
        return x;
    }
    public String toString(){
        return name;
    }
}
public class J05032 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Age> list = new ArrayList<Age>();
        while(t-- > 0) {
            String s = sc.nextLine().trim();
            String[] arr = s.split("\\s+");
            String name = arr[0].trim();
            String birth = arr[1].trim();
            Age a = new Age(name, birth);
            list.add(a);
        }
        list.sort((s1, s2) -> Long.compare(s2.getCheckAge(), s1.getCheckAge()));
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }
}
