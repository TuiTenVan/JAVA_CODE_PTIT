import java.util.Scanner;

public class J02035 {
    public static int find(int[] arr, int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < arr[(mid - 1 + n) % n] && arr[mid] < arr[(mid + 1) % n]) {
                return mid;
            } else if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else if (arr[mid] < arr[high]) {
                high = mid - 1;
            } else {
                high--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int cnt = find(arr, n);
            System.out.println(cnt);
        }
    }
}
