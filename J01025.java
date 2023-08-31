import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        
        int min_x = Math.min(x1, x3);
        int min_y = Math.min(y1, y3);
        int max_x = Math.max(x2, x4);
        int max_y = Math.max(y2, y4);
        
        int side_length = Math.max(max_x - min_x, max_y - min_y);
        
        int square_area = side_length * side_length;
        
        System.out.println(square_area);
    }
}
