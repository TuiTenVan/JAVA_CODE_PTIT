import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a <= 0 || b <= 0){
            System.out.println("0");
            return;
        }
        long p = (a + b) * 2;
        long s = a * b;
        System.out.println(p + " " + s);
    }
}
