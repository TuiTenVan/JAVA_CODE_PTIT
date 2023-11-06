import java.util.Scanner;

class ClassPoint {
    int x, y, z;
    public ClassPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Plane {
    ClassPoint p1, p2, p3, p4;
    public Plane(ClassPoint p1, ClassPoint p2, ClassPoint p3, ClassPoint p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    public boolean isCoplanar() {
        int[] v1 = new int[3];
        int[] v2 = new int[3];
        int[] v3 = new int[3];

        v1[0] = p2.x - p1.x;
        v1[1] = p2.y - p1.y;
        v1[2] = p2.z - p1.z;

        v2[0] = p3.x - p1.x;
        v2[1] = p3.y - p1.y;
        v2[2] = p3.z - p1.z;

        v3[0] = p4.x - p1.x;
        v3[1] = p4.y - p1.y;
        v3[2] = p4.z - p1.z;

        int[] crossProduct = new int[3];
        crossProduct[0] = v2[1] * v3[2] - v2[2] * v3[1];
        crossProduct[1] = v2[2] * v3[0] - v2[0] * v3[2];
        crossProduct[2] = v2[0] * v3[1] - v2[1] * v3[0];

        return (crossProduct[0] == 0 && crossProduct[1] == 0 && crossProduct[2] == 0);
    }
}

public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        for (int t = 0; t < T; t++) {
            ClassPoint p1 = new ClassPoint(sc.nextInt(), sc.nextInt(), sc.nextInt());
            ClassPoint p2 = new ClassPoint(sc.nextInt(), sc.nextInt(), sc.nextInt());
            ClassPoint p3 = new ClassPoint(sc.nextInt(), sc.nextInt(), sc.nextInt());
            ClassPoint p4 = new ClassPoint(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Plane plane = new Plane(p1, p2, p3, p4);
            String result = plane.isCoplanar() ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
