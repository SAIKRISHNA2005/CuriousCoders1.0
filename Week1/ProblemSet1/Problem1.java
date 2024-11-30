
// Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.
// Input:  2 Name y
// Expected Output:
// 2
// Name
// y
import java.util.Scanner;

class Problem1 {
  public static void main(String[] args) {
    Scanner intInput = new Scanner(System.in);
    Scanner stringInput = new Scanner(System.in);
    Scanner charInput = new Scanner(System.in);
    System.out.println("Enter the inputs: ");
    int intValue = intInput.nextInt();
    String stringValue = stringInput.nextLine();
    char charValue = charInput.next().charAt(0);
    System.out.println("Output:");
    System.out.println(intValue);
    System.out.println(stringValue);
    System.out.println(charValue);
  }
}