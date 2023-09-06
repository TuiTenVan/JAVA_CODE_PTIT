import java.util.*;

public class J08024 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<Long> q = new LinkedList<Long>();
            q.add((long)9);
            while(!q.isEmpty()){
                long k = q.peek();
                q.poll();
                if(k % n == 0){
                    System.out.println(k);
                    break;
                }
                q.add(k * 10);
                q.add(k * 10 + 9);
            }
        }
    }
}
