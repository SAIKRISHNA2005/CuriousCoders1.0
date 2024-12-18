import java.util.Scanner;

public class Pattern10 {

  public static void printTriangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows (n): ");
    int n = sc.nextInt();
    printTriangle(n);
    sc.close();
  }
}
