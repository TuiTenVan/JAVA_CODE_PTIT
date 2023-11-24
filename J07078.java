import java.io.File;
import java.util.*;

public class J07078 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            List<Integer> ans = new ArrayList<>();
            int i = 0;
            while(i <= s1.length() - s2.length()){
                String tmp = s1.substring(i, i + s2.length());
                if(tmp.equals(s2)){
                    ans.add(i + 1);
                }
                i++;
            }
            for(Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}