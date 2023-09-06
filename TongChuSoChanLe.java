import java.util.Scanner;

public class TongChuSoChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int chan = 0;
            int le = 0;
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 0){
                    chan += s.charAt(i) - '0';
                }
                else{
                    le += s.charAt(i) - '0';
                }
            }
            System.out.println(le + " " + chan);
        }
    }
}
