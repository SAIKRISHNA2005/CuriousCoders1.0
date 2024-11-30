
// Prob 1:
// Write a program which takes two values x and y. Prints x for y number of times.
// Input:
// 2 
// 3
// Expected Output
// 2
// 2
// 2
// Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output.
import java.util.Scanner;

class Problem1 {
  public static void main(String[] args) {
    Scanner inputNum = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = inputNum.nextInt();
    Scanner inputTimes = new Scanner(System.in);
    System.out.println("Enter number of times to be printed: ");
    int n = inputTimes.nextInt();
    System.out.println("Number entered: " + num);
    System.out.println("Number of times to be printed: " + n);
    for (int i = 1; i <= n; i++) {
      System.out.println(num);
    }
  }
}