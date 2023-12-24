import java.util.*;
import java.io.*;

class Person{
    static int i = 1;
    private String ma, name, birth;
    private double diemlt, diemth;
    public Person(String name, String birth, double diemlt, double diemth) {
        this.ma = "PH" + String.format("%02d", i++);
        this.name = name;
        this.birth = birth;
        this.diemlt = diemlt;
        this.diemth = diemth;
    }
    public String ChuanTen(){
        String res = "";
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        for(int  i = 0; i < arr.length; i++){
            res += Character.toUpperCase(arr[i].charAt(0));
            for(int j = 1; j < arr[i].length(); j++){
                res += arr[i].charAt(j);
            }
            res += " ";
        }
        name = res.trim();
        return name;
    }
    public String ChuanHoa(){
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(1) == '/'){
            sb.insert(0, '0');
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, '0');
        }
        birth = sb.toString();
        return birth;
    }
    public int tuoi(){
        int x = Integer.parseInt(birth.substring(6));
        return 2021 - x;
    }
    public int diemTB(){
        double x = (diemth + diemlt)/2;
        if(diemlt >= 8 && diemth >= 8){
            x += 1;
        }
        else if(diemlt >= 7.5 && diemth >= 7.5){
            x += 0.5;
        }
        x = Math.round(x);
        if(x > 10) x = 10;
        return (int)Math.round(x);
    }
    public String toString(){
        return ma + " " + name + " " + tuoi() + " " + diemTB() + " ";
    }
}
public class J07053 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Person> list = new ArrayList<Person>();
        while(t-- > 0){
            String name = sc.nextLine().trim();
            String birth = sc.nextLine().trim();
            double diemlt = Double.parseDouble(sc.nextLine().trim());
            double diemth = Double.parseDouble(sc.nextLine().trim());
            Person p = new Person(name, birth, diemlt, diemth);
            p.ChuanHoa();
            p.ChuanTen();
            list.add(p);
        }
        for (Person p : list) {
            if(p.diemTB() >= 9){
                System.out.println(p + "Xuat sac");
            }
            else if(p.diemTB() >= 8){
                System.out.println(p + "Gioi");
            }
            else if(p.diemTB() >= 7){
                System.out.println(p + "Kha");
            }
            else if(p.diemTB() >= 5){
                System.out.println(p + "Trung binh");
            }
            else{
                System.out.println(p + "Truot");
            }
        }
    }
}
