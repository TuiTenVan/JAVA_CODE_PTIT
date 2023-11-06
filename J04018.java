import java.util.*;

class SoPhuc{
    private int a, b;
    public SoPhuc(int a, int b){
        this.a = a;
        this.b = b;
    }
    public SoPhuc addSoPhuc(SoPhuc other){
        int x = a + other.a;
        int y = b + other.b;
        return new SoPhuc(x, y);
    }
    public SoPhuc mulPhuc(SoPhuc other){
        int x = a * other.a - b * other.b;
        int y = a * other.b + b * other.a;
        return new SoPhuc(x, y);
    }
    public String toString(){
        if (b > 0) return a + " + " + b + "i";
        else{
            b *= -1;
            return a + " - " + b + "i";
        }
    }
}
public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            SoPhuc s1 = new SoPhuc(a, b);
            SoPhuc s2 = new SoPhuc(c, d);
            SoPhuc s3 = s1.addSoPhuc(s2);
            SoPhuc s4 = s3.mulPhuc(s1);
            SoPhuc s5 = s3.mulPhuc(s3);
            System.out.println(s4 + ", " + s5);
        }
    }
}
