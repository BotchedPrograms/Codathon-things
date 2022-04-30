public class FibonacciNumbers {
  private static final int n = 10;

  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 1;
    int num3;
    if (n > 0) {
      System.out.print("1 ");
    }
    if (n > 1) {
      System.out.print("1 ");
    }
    for (int i = 0; i < n-2; i++) {
      num3 = num1 + num2;
      num1 = num2;
      num2 = num3;
      System.out.print(num3 + " ");
    }
  }
}
