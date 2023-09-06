import java.util.*;
public class J08012{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        Map<Integer, Integer> list = new HashMap<>();
        for(int i = 0; i < n - 1; i++){
            a[i][0] = sc.nextInt();
            if(list.containsKey(a[i][0])){
                int ts = list.get(a[i][0]);
                ts++;
                list.put(a[i][0], ts);
            }
            else{
                list.put(a[i][0], 1);
            }
            a[i][1] = sc.nextInt();
            if(list.containsKey(a[i][1])){
                int ts = list.get(a[i][1]);
                ts++;
                list.put(a[i][1], ts);
            }
            else{
                list.put(a[i][1], 1);
            }
        }    
        int ok = 0;
        for(Map.Entry<Integer, Integer> entry : list.entrySet()){
            if(entry.getValue() == n - 1){
                ok = 1;
                break;
            }
        }
        if(ok == 0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}