import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Pair<T, U>{
    private T x;
    private U y;
    public Pair(T x, U y){
        this.x = x;
        this.y = y;
    }
    public static boolean snt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public boolean isPrime(){
        if(x instanceof Integer && y instanceof Integer){
            int m = (Integer) x;
            int n = (Integer) y;
            return snt(n) && snt(m);
        }
        return false;
    }
    public String toString(){
        return x + " " + y;
    }
}

public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
