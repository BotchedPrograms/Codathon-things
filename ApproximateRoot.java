// Gets square root without Math library
public class ApproximateRoot {
  private static final double num = 69;

  // Gets absolute value
  public static double abs(double num) {
    if (num < 0) {
      return -num;
    }
    return num;
  }

  // No fancy approximation techniques, just a lot of high or lows until it just so happens to be close to the square root
  public static void main(String[] args) {
    int intPart = -1;
    for (int i = 0; i < num; i++) {
      if (i * i >= num) {
        intPart = i-1;
        break;
      }
    }
    double sqrt = intPart;
    double n1 = 0;
    double d1 = 1;
    double n2 = 1;
    double d2 = 1;
    double newNum;
    while (abs(sqrt*sqrt - num) > 0.0000000001) {
      newNum = (n1+n2)/(d1+d2);
      sqrt = intPart + newNum;
      if (sqrt*sqrt < num) {
        n1 = n1+n2;
        d1 = d1+d2;
      } else if (sqrt*sqrt > num) {
        n2 = n1+n2;
        d2 = d1+d2;
      }
    }
    return sqrt;
  }
}
