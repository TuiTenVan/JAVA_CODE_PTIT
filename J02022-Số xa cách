import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02022 {

    public static boolean isValid(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs((s.charAt(i) - '0') - (s.charAt(i + 1) - '0')) == 1) {
                return false;
            }
        }
        return true;
    }

    public static List<String> check(String current, String digitsLeft) {
        List<String> results = new ArrayList<>();
        if (digitsLeft.length() == 0) {
            if (isValid(Integer.parseInt(current))) {
                results.add(current);
            }
            return results;
        }

        for (int i = 0; i < digitsLeft.length(); i++) {
            String nextDigit = digitsLeft.substring(i, i + 1);
            String nextCurrent = current + nextDigit;
            String nextDigitsLeft = digitsLeft.substring(0, i) + digitsLeft.substring(i + 1);
            results.addAll(check(nextCurrent, nextDigitsLeft));
        }

        return results;
    }

    public static List<String> findXaCachNumbers(int N) {
        StringBuilder digits = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            digits.append(i);
        }
        List<String> xaCachNumbers = check("", digits.toString());
        return xaCachNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTests = scanner.nextInt();
        List<Integer> inputNumbers = new ArrayList<>();
        for (int i = 0; i < numTests; i++) {
            int N = scanner.nextInt();
            inputNumbers.add(N);
        }

        for (int N : inputNumbers) {
            List<String> xaCachNumbers = findXaCachNumbers(N);
            for (String num : xaCachNumbers) {
                System.out.println(num);
            }
            System.out.println();
        }
    }
}
