import java.util.*;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            List<String> l = new ArrayList<String>();
            Queue<String> q = new LinkedList<String>();
            q.add("6");
            q.add("8");
            l.add("6");
            l.add("8");
            while(q.peek().length() < n){
                String k = q.peek();
                q.poll();
                q.add(k + "6");
                l.add(k + "6");
                q.add(k + "8");
                l.add(k + "8");
            }
            System.out.println(l.size());
            for(int i = l.size() - 1; i >= 0; i--){
                System.out.print(l.get(i) + " ");
            }
            System.out.println();
        }
    }
}
