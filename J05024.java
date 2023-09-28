import java.util.*;

class ClassSinhVien22 {
    private String ma, name, lop, email;
    public ClassSinhVien22(String ma, String name, String lop, String email) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    public String getMa() {
        return ma.substring(3,7 );
    }
    public String getLop(){
        return lop.substring(0,1);
    }
    public String toString() {
        return ma + " " + name + " " + lop + " " + email;
    }
}

public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<ClassSinhVien22> list = new ArrayList<ClassSinhVien22>();
        for (int i = 0; i < t; i++) {
            String ma = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            ClassSinhVien22 sv = new ClassSinhVien22(ma, name, lop, email);
            list.add(sv);
        }
        int q = sc.nextInt();
        sc.nextLine(); 
        while (q-- > 0) {
            String s = sc.nextLine().trim();
            // String ans = "";
            // if (nganh.equals("Ke toan")) {
            //     ans = "DCKT";
            // } else if (nganh.equals("Cong nghe thong tin")) {
            //     ans = "DCCN";
            // } else if (nganh.equals("An toan thong tin")) {
            //     ans = "DCAT";
            // } else if (nganh.equals("Vien thong")) {
            //     ans = "DCVT";
            // } else if (nganh.equals("Dien tu")) {
            //     ans = "DCDT";
            // }
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            // for (ClassSinhVien22 sv : s) {
            //     String res = sv.getMa().substring(3, 7);
            //     // System.out.println(res);
            //     String clc = sv.getLop().substring(0, 1);
            //     if(ans.equals("DCCN") && !clc.equals("E") && res.equals(ans)){
            //         System.out.println(sv);
            //     }
            //     else if(ans.equals("DCAT") && !clc.equals("E") && res.equals(ans)){
            //         System.out.println(sv);
            //     }
            //     else if(res.equals(ans)){
            //         System.out.println(sv);
            //     }
            // }
            for(ClassSinhVien22 i:list){
                if(s.equals("Ke toan")){
                    if(i.getMa().equals("DCKT"))
                        System.out.println(i);
                }
                else if(s.equals("Cong nghe thong tin")){
                    if(i.getMa().equals("DCCN") && !i.getLop().equals("E"))
                        System.out.println(i);
                }
                else if(s.equals("An toan thong tin")){
                    if(i.getMa().equals("DCAT") &&  !i.getLop().equals("E"))
                        System.out.println(i);
                }
                else if(s.equals("Vien thong")){
                    if(i.getMa().equals("DCVT"))
                        System.out.println(i);
                }
                else if(s.equals("Dien tu")){
                    if(i.getMa().equals("DCDT"))
                        System.out.println(i);
                }
                            
            }
        }
    }
}


// 4
// B16DCCN011
// Nguyen Trong Duc Anh
// D16CNPM1
// sv1@stu.ptit.edu.vn
// B15DCCN215
// To Ngoc Hieu
// D15CNPM3
// sv2@stu.ptit.edu.vn
// B15DCKT150
// Nguyen Ngoc Son
// D15CQKT02-B
// sv3@stu.ptit.edu.vn
// B15DCKT199
// Nguyen Trong Tung
// D15CQKT02-B
// sv4@stu.ptit.edu.vn
// 1
// Ke toan