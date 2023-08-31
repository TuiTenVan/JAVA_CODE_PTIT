import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> h = new HashMap<>();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String[] arr = s.split("\\s+");
            String res = arr[arr.length - 1];
            for(int i = 0; i < arr.length - 1; i++){
                res += arr[i].charAt(0);
            }
            if(h.containsKey(res)){
                int ts = h.get(res);
                ts ++;
                h.put(res, ts);
                res += ts + "@ptit.edu.vn";
                System.out.println(res);
            }
            else{
                h.put(res, 1);
                res +=  "@ptit.edu.vn";
                System.out.println(res);
                
            }
        }
    }
}
