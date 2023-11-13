05050/Bill.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05050;

/**
 *
 * @author buihu
 */
public class Bill {
    private String id,code;
    private long number,price,bonus,sum;
    private long last,current;

    public Bill(String id, int code, long last, long current) {
        this.code="KH"+String.format("%02d", code);
        this.id = id;
        this.last = last;
        this.current = current;
    }
    public void caculate(){
        if(this.id.substring(0,2).equals("KD")){
            this.number=3;
        }else if(this.id.substring(0,2).equals("NN")){
            this.number=5;
        }else if(this.id.substring(0,2).equals("TT")){
            this.number=4;
        }else if(this.id.substring(0,2).equals("CN")){
            this.number=2;
        }
        this.price=(this.current-this.last)*this.number*550;
        if(this.current-this.last>100){
            this.bonus=this.price;
        }else if(this.current-this.last >=50){
            this.bonus=(long)Math.ceil(this.price*0.35f);
        }else{
            this.bonus=0;
        }
        this.sum=this.bonus+this.price;
            
            
            
            
    }

    @Override
    public String toString(){
        return this.code+" "+this.number+" "+this.price+" "+this.bonus+" "+this.sum;
    }
        
    
        
    
    
}

J05050/Main.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05050;

import java.util.*;

/**
 *
 * @author buihu
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Bill> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String id=sc.nextLine();
            long last=Long.parseLong(sc.nextLine());
            long current=Long.parseLong(sc.nextLine());
            Bill x=new Bill(id,i,last,current);
            x.caculate();
            arr.add(x);
        }
        for(Bill x: arr){
            System.out.println(x);
        }
            
            
            
    }
}