/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05068;


/**
 *
 * @author nguye
 */
public class DonHang {
    private  String ma;
    private int soluong;
    public DonHang(String ma, int soluong){
        this.ma = ma;
        this.soluong = soluong;
    }
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public Long DonGia(){
        String x = ma.substring(0, 1);  
        if(x.equals("X")){
            return (long)128000;
        }
        else if(x.equals("D")){
            return (long)11200;
        }
        else{
            return (long)9700;
        }
    }
    public Long Thue(){
        String x = ma.substring(0, 1);  
        String s = ma.substring(ma.length() - 2);
        if(s.equals("TN")){
            return (long) 0;
        }
        else{
            if(x.equals("X")){
            return (long)(soluong * DonGia() * 0.03);
        }
        else if(x.equals("D")){
            return (long)(soluong * DonGia() * 0.035);
        }
            else{
                return (long)(soluong * DonGia() * 0.02);
            }
        }
    }
    public Long ThanhTien(){
        return DonGia() * soluong + Thue();
    }
    public String Hang(){
        String s = ma.substring(ma.length() - 2);
        if(s.equals("BP")){
            return "British Petro";
        }
        else if(s.equals("ES")){
            return "Esso";
        }
        else if(s.equals("SH")){
            return "Shell";
        }
        else if(s.equals("CA")){
            return "Castrol";
        }
        else if(s.equals("MO")){
            return "Mobil";
        }
        else{
            return "Trong Nuoc";
        }
    }
    public String toString(){
        return ma + " " + Hang() + " " + DonGia() + " " + Thue() + " " + ThanhTien();
    }
}
