import java.util.*;

public class duongcaotoc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String s = "";
        int index = 0;
        while(n-- > 0){
            s = sc.nextLine();
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) > '9' && s.charAt(i) < '0'){
                index++;
            }    
            else{
                break;
            } 
        }
        while(m-- > 0){
            String k = sc.nextLine();
            String[] arr = k.split("\\s+");
            String a = arr[0].substring(index);
            String b = arr[1].substring(index);
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            int ans = Math.abs(x - y) - 1;
            System.out.println(ans);
        }
    }
}
