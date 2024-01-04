import java.util.Scanner;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            int cnt = arr.length;
            int chan = 0;
            int le = 0;
            for(int i = 0; i < arr.length; i++){
                if(Integer.parseInt(arr[i]) % 2 == 0){
                    chan++;
                }
                else{
                    le++;
                }
            }
            if((cnt % 2 == 0 && chan > le) || (cnt % 2 != 0 && chan < le)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        } 
    }
}

