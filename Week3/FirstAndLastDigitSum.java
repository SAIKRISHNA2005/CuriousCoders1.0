import java.util.Scanner;

class FirstAndLastDigitSum {

  public static int cornerDigitSum(int N) {
    int lastDigit = N % 10;
    int firstDigit = N;
    while (firstDigit >= 10) {
      firstDigit /= 10;
    }
    return firstDigit + lastDigit;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number N: ");
    int N = sc.nextInt();
    int result = cornerDigitSum(N);
    System.out.println("The sum of the first and last digit is: " + result);
    sc.close();
  }
}
