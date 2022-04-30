public class QuadraticSolver {
  private static final int a;
  private static final int b;
  private static final int c;
  
  // Quadratic Solver
  public static void main(String[] args) {
    double delta = Math.sqrt((double) (b*b-4*a*c));
    if (b*b-4*a*c < 0) {
      System.out.print("N/A");
    } else if (delta == 0) {
      System.out.print(-b/(2.0*a));
    } else {
      System.out.print((-b+delta)/(2.0*a) + " and " + (-b-delta)/(2.0*a));
    }
  }
}
