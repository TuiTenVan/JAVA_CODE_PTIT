/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05074;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class DiemDanh {
    private String ma, name, lop;
    public DiemDanh(String ma, String name, String lop){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public String toString(){
        return ma + " " + name + " " + lop + " ";
    }
}
