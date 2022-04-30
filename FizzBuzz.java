public class FizzBuzz {
  private static final int n = 20;

  public static void main(String[] args) {
    for (int i = 1; i <= n; i++) {
      // Divisible by 15 means divisible by 5 and 3
      if (i % 15 == 0) {
        System.out.print("FizzBuzz ");
      } else if (i % 3 == 0) {
        System.out.print("Fizz ");
      } else if (i % 5 == 0) {
        System.out.print("Buzz ");
      } else {
        System.out.print(i + " ");
      }
    }
  }
}
