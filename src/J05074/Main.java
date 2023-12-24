/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05074;

import java.util.*;

/**
 *
 * @author nguye
 */
public class Main {
    public static int check(String s){
        int dd = 10;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'v'){
                dd -= 2;
            }
            else if(s.charAt(i) == 'm'){
                dd -= 1;
            }
        }
        return dd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DiemDanh> list = new ArrayList<>();
        Map<String, DiemDanh> map = new HashMap<>();
        for(int i = 1; i <= t; i++){
            String ma = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            DiemDanh d = new DiemDanh(ma, name, lop);
            list.add(d);
        }
        for(int i = 1; i <= t; i++){
            String[] arr = sc.nextLine().trim().split("\\s+");
            String msv = arr[0];
            String s = arr[1];
            for(DiemDanh j : list){
                if(j.getMa().equals(msv)){
                    map.put(s, j);                    
                }           
            }
        }
        List<Map.Entry<String, DiemDanh>> ans = new ArrayList<>(map.entrySet());  
        for(DiemDanh d : list){
            for(Map.Entry<String, DiemDanh> e : ans){     
                if(d.equals(e.getValue())){
                    if(check(e.getKey()) <= 0){
                        System.out.println(e.getValue()+ "" + "0 KDDK");
                    }
                    else{
                        System.out.println(e.getValue()+ "" + check(e.getKey()));
                    }                  
                }                
            }
        }
    }
}
//4
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN785
//Nguyen Viet Van
//D19CQAT05-B
//B19DCCN998 xxxmvmmvmv
//B19DCCN997 xmxmxxxvxx
//B19DCCN785 xxxxxxxxxx
//B19DCCN999 xvvmxvmvvm