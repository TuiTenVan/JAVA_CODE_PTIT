import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            List<Character> list = new ArrayList<Character>();
            String s = sc.nextLine();
            int sum = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) - '0' >= 0 && s.charAt(i) -'0' <= 9){
                    sum +=  s.charAt(i) - '0';
                } 
                else{
                    list.add(s.charAt(i));
                }
            }
            Collections.sort(list);
            String res = "";
            for(Character c : list){
                res += c;
            }
            res += sum;
            System.out.println(res);
        }
    }
}
