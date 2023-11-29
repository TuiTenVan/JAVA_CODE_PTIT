import java.util.Scanner;

public class J02020 {
    public static void sinh(int n, int k){
        int[] a = new int[k + 1];
        for(int i = 1; i <= k; i++){
            a[i] = i;
        }
        int cnt = 0;
        while(a[0] <= n - k + 1){
            
            for(int t = 1; t <= k; t++){
                System.out.print(a[t] + "");
            }
            System.out.print(" ");
            int j = k;
            while(j > 0 && a[j] == n - k + j){
                j--;
            }
            if(j > 0){
                a[j]++;
                for(int t = j + 1; t <= k; t++){
                    a[t] = a[t - 1] + 1;
                }
            }
            else{
                break;
            }
            cnt++;
        }
        System.out.println();
        System.out.println("Tong cong co " + (cnt + 1)+ " to hop");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sinh(n, k);
    }
}
