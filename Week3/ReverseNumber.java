import java.util.Scanner;

class ReverseNumber {
  public static int reverseNumber(int n) {
    int reversed = 0;
    while (n != 0) {
      int digit = n % 10;
      reversed = reversed * 10 + digit;
      n /= 10;
    }

    return reversed;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int reversedNumber = reverseNumber(n);
    System.out.println("Reversed number: " + reversedNumber);
    sc.close();
  }
}
