import java.util.Scanner;


class Point{
    private double x, y;
    public static Point nextPoint(Scanner sc){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return new Point(x, y);
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point other){
        double d = Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
        return d;
    }
}
class Triangle{
    private Point x, y, z;
    public Triangle(Point x, Point y, Point z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public boolean valid(){
        double a = x.distance(y);
        double b = y.distance(z);
        double c = x.distance(z);
        if(a + b <= c || a + c <= b || b + c <= a){
            return false;
        }
        else{
            return true;
        }
    }
    public String getPerimeter(){
        double a = x.distance(y);
        double b = y.distance(z);
        double c = x.distance(z);
        return String.format("%.3f", a + b + c);
    }
}
public class J04019 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
