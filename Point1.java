import java.util.Scanner;

public class Point1 {
    private double x, y;
    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point1 other) {
        double d = (x - other.x) * (x - other.x) + (y - other.y) * (y - other.y);
        d = Math.sqrt(d);
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point1 a = new Point1(x1, y1);
            Point1 b = new Point1(x2, y2);
            Point1 c = new Point1(x3, y3);
            double d1 = a.distance(b);
            double d2 = c.distance(b);
            double d3 = a.distance(c);
            if(d1 >= d2 + d3 || d2 >= d3 + d1 || d3 >= d1 + d2){
                System.out.println("INVALID");
            }
            else{
                System.out.printf("%.3f", d1 + d2 + d3);
                System.out.println();
            }
        }
    }
}
