package Ktra;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

class Pair<K, V> {

  private K num1;
  private V num2;

  public Pair() {
  }

  public Pair(K num1, V num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public boolean isPrime() {
    int a = (Integer) num1;
    int b = (Integer) num2;
    if (check(a) && check(b)) {
      return true;
    }
    return false;
  }

  private static boolean check(int a) {
    if (a == 2) return true;
    if (a < 2 || a % 2 == 0) return false;
    for (int i = 3; i <= sqrt(a);i+=2){
      if (a % i == 0) return false;
    }  
    return true;
  }

  public String toString() {
    return "(" + num1 + "," + num2 + ")";
  }
  
}

public class bai2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[n][n];
    List<Pair<Integer,Integer>> res = new ArrayList<>();
    for (int i = 0 ; i < n; i++){
      for(int j = 0 ; j < n;j++) {
        a[i][j] = sc.nextInt();
        if (a[i][j] == 1 && i < j){
          Pair<Integer ,Integer> Pair = new Pair<>(i + 1, j + 1);
          res.add(Pair);
        }
      }
    }
    for (Pair<Integer,Integer> p : res){
      System.out.println(p);
    }
  }
}
