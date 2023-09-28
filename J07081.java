import java.util.*;
import java.io.*;

class ClassSinhVien{
    private String ma, name, sdt, email;
    public ClassSinhVien(String ma, String name, String sdt, String email){
        this.ma = ma;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getMa(){
        return ma;
    }
    public String toString(){
        return ma + " " + name + " " + sdt + " " + email;
    }
}
public class J07081 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        List<ClassSinhVien> list = new ArrayList<>();
        sc.nextLine();
        while(n-- > 0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String sdt = sc.nextLine();
            String email = sc.nextLine();
            ClassSinhVien sv = new ClassSinhVien(ma, name, sdt, email);
            list.add(sv);
        }
        list.sort((s1, s2) -> {
            if(s1.getName().equals(s2.getName())){
                return s1.getMa().compareTo(s2.getMa());
            }
            else{
                String[] arr1 = s1.getName().split("\\s+");
                String[] arr2 = s2.getName().split("\\s+");
                if(arr1[arr1.length - 1].equals(arr2[arr2.length - 1])){
                    if(arr1[0].equals(arr2[0])){
                        return arr1[1].compareTo(arr2[1]);
                    }
                    else{
                        return arr1[0].compareTo(arr2[0]);
                    }
                }
                else{
                    return arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]);
                }
            }
        });
        for(ClassSinhVien c : list){
            System.out.println(c);
        }
        sc.close();
    }
}
