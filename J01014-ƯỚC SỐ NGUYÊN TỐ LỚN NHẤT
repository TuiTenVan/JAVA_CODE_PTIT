import java.util.*;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            List<Long> l = new ArrayList<Long>();
            for(long i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    while(n % i == 0){
                        n /= i;
                    }
                    l.add(i);
                }
            }
            if(n > 1) l.add(n);
            Collections.sort(l);
            System.out.println(l.get(l.size() - 1));
        }
    }
}
