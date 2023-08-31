import java.util.Scanner;

public class Point {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    public Point(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double distance(double x1, double y1, double x2, double y2) {
        double ans = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        ans = Math.sqrt(ans);
        return ans;
    }
    public String toString() {
        return String.format("%.4f", distance(x1, y1, x2, y2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            Point p = new Point(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.println(p);
        }
    }
}
