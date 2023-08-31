import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine();
            String k = sc.nextLine();
            String[] arr1 = s.split("\\s+");
            String[] arr2 = k.split("\\s+");
            HashSet<String> h1 = new HashSet<String>();
            HashSet<String> h2 = new HashSet<String>();
            for(int i = 0; i < arr2.length; i++) {
                h1.add(arr2[i]);
            }
            for(int i = 0; i < arr1.length; i++) {
                if(!h1.contains(arr1[i])){
                    h2.add(arr1[i]);
                }
            }
            for(String x : h2) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
