import java.util.*;

public class J01022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            List<String> list = new ArrayList<String>();
            list.add("0");
            list.add("1");
            for(int i = 2; i < n; i++) {
                String res = list.get(i - 2) + list.get(i - 1);
                list.add(res);
            }
            // System.out.println(list.get(n - 1));
            for(int i = 0; i < list.get(n - 1).length(); i++) {
                if((i + 1) == k){
                    System.out.println(list.get(n - 1).charAt(i));
                }
            }
        }
    }
}
