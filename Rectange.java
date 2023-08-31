import java.util.Scanner;

public class Rectange {
    private int width, height;
    private String color;
    public Rectange(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public String getColor() {
        String res = "";
        res += Character.toUpperCase(color.charAt(0));
        for(int i = 1; i < color.length(); i++) {
            res += Character.toLowerCase(color.charAt(i));
        }
        return res;
    }
    public int chuVi(){
        int p = (width + height) * 2;
        return p;
    }
    public int dienTich(){
        int c = width * height;
        return c;
    }
    public String toString() {
        return chuVi() + " " + dienTich() + " " + getColor();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        String color = sc.next();
        Rectange x = new Rectange(width, height, color);
        if(width < 0 || height < 0){
            System.out.println("INVALID");
        }
        else System.out.println(x);
    }
}
