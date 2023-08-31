import java.util.Scanner;

public class J03032 {
    public static String dao(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for(String s2 : arr){
                System.out.print(dao(s2) + " ");
            }
            System.out.println();
        }
    }
}
