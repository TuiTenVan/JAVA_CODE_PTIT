/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05067;

import java.util.*;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DonHang> list = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.next();
            int soluong = Integer.parseInt(sc.next());
            list.add(new DonHang(ma, soluong));
        }
        for(DonHang d : list){
            System.out.println(d);
        }
    }
}
//3
//N89BP 4500
//D00TN 3500
//X92SH 2600