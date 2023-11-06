import java.io.File;
import java.io.IOException;
import java.util.*;

class IntSet{
    private TreeSet<Integer> set;
    public IntSet(int[] a) {
        set = new TreeSet<>();
        for (int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
    }
    public IntSet intersection(IntSet other) {
        Set<Integer> result = new TreeSet<>(this.set);
        result.retainAll(other.set);
        int[] resultArray = new int[result.size()];
        int index = 0;
        for (int num : result) {
            resultArray[index] = num;
            index++;
        }
        return new IntSet(resultArray);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int num : set) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
public class J07009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
