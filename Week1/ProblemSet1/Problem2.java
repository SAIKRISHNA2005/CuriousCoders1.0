
// Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.
// If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.
// Input: 45 45 45
// Expected Output: 
// Triangle cannot be formed
// Explanation -> We are getting 3 inputs, that is three angles of triangle, but here the sum of three angles that is 45+45+45 is not equal to 180 so Triangle cannot be formed is the output.
import java.util.Scanner;

class Problem2 {
  public static void main(String[] args) {
    System.out.println("Enter input1: ");
    Scanner Input1 = new Scanner(System.in);
    int Value1 = Input1.nextInt();
    System.out.println("Enter input2: ");
    Scanner Input2 = new Scanner(System.in);
    int Value2 = Input2.nextInt();
    System.out.println("Enter input3: ");
    Scanner Input3 = new Scanner(System.in);
    int Value3 = Input3.nextInt();
    System.out.println("The three input angles of triangle are: ");
    System.out.println("Input1: " + Value1 + "\n" + "Input2: " + Value2 + "\n" + "Input3: " + Value3); // given input is
                                                                                                       // 45 45 45
    if ((Value1 + Value2 + Value3) == 180) {
      System.out.println("Traingle can be formed");
    } else {
      System.out.println("Triangle cannot be formed");
    }

  }
}