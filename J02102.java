import java.util.*;

public class J02102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
                list.add(a[i][j]);
            }
        }
        Collections.sort(list);
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        int index = 0;
        int[][] b = new int[n][n];
        while(c1 <= c2 && h1 <= h2){
            for(int i = c1; i <= c2; i++){
                b[h1][i] = list.get(index);
                index ++;
            }
            h1++;
            for(int i = h1; i <= h2; i++){
                b[i][c2] = list.get(index);
                index++;
            }
            c2--;
            for(int i = c2; i >= c1; i--){
                b[h2][i] = list.get(index);
                index++;
            }
            h2--;
            for(int i = h2; i >= h1; i--){
                b[i][c1] = list.get(index);
                index++;
            }
            c1++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
