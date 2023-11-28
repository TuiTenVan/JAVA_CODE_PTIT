import java.util.Scanner;

public class J03035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String x = sc.nextLine();
            String y = sc.nextLine();
            int B = Integer.parseInt(y);
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j <= 9; j++) {
                    char[] arr = x.toCharArray();
                    int ok = 1;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == '?') {
                            if (k == 0 && i == 0) {
                                ok = 0;
                                break;
                            }
                            arr[k] = (char) (i + '0');
                        }
                    }
                    if(ok == 1){
                        int tmp = Integer.parseInt(new String(arr));
                        if (tmp > B) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
