import java.util.*;

public class codeC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        while (k-- > 0) {
            String s;
            s = sc.nextLine();
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            String temp[] = s.split(" ");
            s = "";
            for (int i = 0; i < temp.length; i++) {
                s += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                if (i < temp.length - 1)
                    s += " ";
            }

            System.out.println(s);
        }
    }
}