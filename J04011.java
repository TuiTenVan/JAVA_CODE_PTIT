import java.util.Scanner;

class Point3D {
    int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        int[] v1 = { p2.x - p1.x, p2.y - p1.y, p2.z - p1.z };
        int[] v2 = { p3.x - p2.x, p3.y - p2.y, p3.z - p2.z };
        int[] v3 = { p4.x - p3.x, p4.y - p3.y, p4.z - p3.z };

        int dotProduct = v1[0] * (v2[1] * v3[2] - v2[2] * v3[1])
                       - v1[1] * (v2[0] * v3[2] - v2[2] * v3[0])
                       + v1[2] * (v2[0] * v3[1] - v2[1] * v3[0]);
        return dotProduct == 0;
    }
}
public class J04011{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
