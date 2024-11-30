
// Prob 3:
// Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.
// Input
// Nandy
// Raja
// 5
// Expected output:
// NandyRaja
// NandyRaja
// NandyRaja
// NandyRaja
// NandyRaja
// Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times.
import java.util.Scanner;

class Problem3 {
  public static void main(String[] args) {
    System.out.println("Inputs:");
    Scanner inputFirstName = new Scanner(System.in);
    System.out.println("Enter your first name:");
    String firstName = inputFirstName.nextLine();
    System.out.println("Enter your last name:");
    Scanner inputLastName = new Scanner(System.in);
    String lastName = inputLastName.nextLine();
    System.out.println("Enter number of times to be printed:");
    Scanner inputNum = new Scanner(System.in);
    int num = inputNum.nextInt();
    System.out.println("First name: " + firstName);
    System.out.println("Last name: " + lastName);
    System.out.println("Number of times fullname to be printed: " + num);
    String fullName = firstName + lastName;
    for (int i = 1; i <= num; i++) {
      System.out.println(fullName);
    }
  }
}