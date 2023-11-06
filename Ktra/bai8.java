package Ktra;
import java.util.*;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for(Integer i : a){
                if(map.containsKey(i)){
                    int ts = map.get(i);
                    ts++;
                    map.put(i, ts);
                }
                else{
                    map.put(i,1);
                }
            }
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
                public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b){
                    return b.getValue() - a.getValue();
                }
            });
            for(Map.Entry<Integer, Integer> entry : list){
                for(int i = 0; i < entry.getValue(); i++){
                    System.out.print(entry.getKey() + " ");
                }
            }
            System.out.println();
        }
    }
}
