import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k <= t; k++) {
            
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
            for(int i = 0; i < n; i++){
                if(map.containsKey(a[i])){
                    int ts = map.get(a[i]);
                    ts++;
                    map.put(a[i], ts);
                }
                else{
                    map.put(a[i], 1);
                }
            }
            System.out.println("Test " + k + ":");
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
    }
}
