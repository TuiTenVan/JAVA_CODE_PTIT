import java.util.*;

public class J02102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n]
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
                list.add(a[i][j]);
            }
        }
        list.sort();
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        for(int i = c1; i <= c2; i++){
            System.out.print(list.get(i) + " ");
        }
        h1++;
        for(int i = h1; i <= h2; i++){
            System.out.print();
        }
    }
}
