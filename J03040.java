import java.util.Scanner;

public class J03040 {
    public static boolean check1(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) - '0' >= s.charAt(i + 1) - '0'){
                return false;
            }
        }
        return true;
    }
    public static boolean check2(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) - '0' != s.charAt(i + 1) - '0'){
                return false;
            }
        }
        return true;
    }
    public static boolean check4(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8'){
                return false;
            }
        }
        return true;
    }
    public static boolean check3(String s){
        for(int i = 0; i < s.length() - 3; i++){
            if((s.charAt(i) - '0') != (s.charAt(i + 1) - '0')){
                return false;
            }
        }
        if((s.charAt(s.length() - 1) - '0') != (s.charAt(s.length() - 2) - '0')){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String x = s.substring(5);
            String[] arr = x.split("\\.");
            String res = "";
            for(int i = 0; i < arr.length; i++){
                res += arr[i];
            }
            if(check1(res) || check2(res) || check3(res) || check4(res)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }   
    }
}
