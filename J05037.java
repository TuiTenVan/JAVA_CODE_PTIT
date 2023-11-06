
import java.util.*;
class GiaBan implements Comparable<GiaBan>{
    private int stt;
    private String name,donVi;
    private double giaNhap,soLuong;

    public GiaBan(int stt,String name, String donVi, double giaNhap, double soLuong) {
        this.stt=stt;
        this.name = name;
        this.donVi = donVi;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }
    
    private int getPhi(){
        return  (int) Math.round(0.05*giaNhap*soLuong);
    }
    private int thanhTien(){
        return(int) Math.round(getPhi()+giaNhap*soLuong);
    }
    private int giaBan(){
        int ban= (int) Math.round( 1.02*thanhTien()/soLuong);
        if(ban%100>0){
            return (ban/100+1)*100;
        }
        return ban;
    }

    @Override
    public String toString() {
        return "MH"+String.format("%02d",stt)+" " + name + " " + donVi + " "+getPhi()+" "+thanhTien()+" "+giaBan();
    }
    
    @Override 
    public int compareTo(GiaBan o){
        return o.giaBan()-giaBan();
    }
    
}
public class J05037  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List <GiaBan> a=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            a.add(new GiaBan(i,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble()));
            sc.nextLine();
        }
        Collections.sort(a);
        for(GiaBan i:a){
            System.out.println(i);
        }
    }
        
    
    
}
