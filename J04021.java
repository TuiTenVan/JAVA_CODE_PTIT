import java.util.*;

class IntSet{
    private TreeSet<Integer> set;
    public IntSet(int[] a) {
        set = new TreeSet<>();
        for (int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
    }
    public IntSet union(IntSet other) {
        Set<Integer> result = new TreeSet<>(this.set);
        result.addAll(other.set);
        int[] resultArray = new int[result.size()];
        int index = 0;
        for (int num : result) {
            resultArray[index] = num;
            index++;
        }
        return new IntSet(resultArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int num : set) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
public class J04021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
