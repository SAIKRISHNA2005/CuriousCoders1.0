import java.util.Scanner;

public class CountDigitsinaNumber {

  public static int countDigits(int number) {
    int count = 0;
    while (number != 0) {
      number /= 10;
      count++;
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    if (number == 0) {
      System.out.println("1");
    } else {
      int digitCount = countDigits(number);
      System.out.println("Number of digits: " + digitCount);
    }

    sc.close();
  }
}
