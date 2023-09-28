import java.util.Scanner;


class Point{
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point other){
        double d = Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
        return d;
    }
}
class Area{
    private Point x, y, z;
    public Area(Point x, Point y, Point z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double area(){
        double a = x.distance(y);
        double b = y.distance(z);
        double c = x.distance(z);
        if(a + b <= c || a + c <= b || b + c <= a){
            return 0;
        }
        else{
            double s = Math.sqrt((a + b + c) * (a + b - c) * (-a + b + c) * (a - b + c)) / 4;
            double r = (a * b * c) / (4.0 * s);
            double S = Math.PI * r * r;
            return S;
        }
    }
    public String toString(){
        if(area() == 0){
            return "INVALID";
        }
        else{
            return String.format("%.3f", area());
        }
    }
}
public class J04010 { 
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
            Area a = new Area(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
            System.out.println(a);
        }

    }
}
