
// Prob 2:
// Write a program to take x and print multiples of x till 1000.
// Input:
// 100
// Expected Output:
// 100
// 200
// 300
// 400
// 500
// 600
// 700
// 800
// 900
// 1000
// Explanation - Input is 100, multiples of 100 is 100*1, 100*2, 100*3 and so on till 1000
import java.util.Scanner;

class Problem2 {
  public static void main(String[] args) {
    Scanner inputNum = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int x = inputNum.nextInt();
    System.out.println("Number entered: " + x);
    System.out.println("Multiples of entered number is: ");
    for (int i = x; x <= 1000; x = i + x) {
      System.out.println(x);
    }
  }
}