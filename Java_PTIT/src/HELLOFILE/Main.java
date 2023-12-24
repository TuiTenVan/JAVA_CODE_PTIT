/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HELLOFILE;
import java.io.File;
import java.util.*;
/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("Hello.txt"));
            while(sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
