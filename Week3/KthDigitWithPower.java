class KthDigitWithPower {
  public static void main(String[] args) {
    int A = 3, B = 3, k = 1;
    long power = (long) Math.pow(A, B);
    long i = 1;

    while (power > 0) {
      long ans = power % 10;
      if (k == i) {
        System.out.println(ans);
        break;
      }
      i++;
      power = power / 10;
    }
  }
}