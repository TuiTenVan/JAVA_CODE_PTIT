package danhsachsinhvien1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class SinhVien implements Serializable{
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa)
    {
        this.ma = String.format("B20DCCN%03d", id + 1);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            this.ngaysinh = sdf.parse(ngaysinh);
        }
        catch (Exception e)
        {
            
        }
    }
    
    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + ten + " " + lop + " " + sdf.format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}
public class J07013
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> a = (ArrayList<SinhVien>) inp.readObject();
        for (SinhVien i : a)
            System.out.println(i);
    }
}



