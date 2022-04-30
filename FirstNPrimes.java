public class FirstNPrimes {
  private static final int n;

  public static void main(String[] args) {
    ArrayList<Integer> primes = new ArrayList<>();
    if (n > 0) {
      primes.add(2);
    }
    loop1: for (int i = 3; primes.size() < n; i += 2) {
      for (int j = 0; j < primes.size(); j++) {
        if (i % primes.get(j) == 0) {
          continue loop1;
        } else if (primes.get(j) > Math.sqrt((double) i)) {
          break;
        }
      }
      primes.add(i);
    }
    for (int i = 0; i < primes.size(); i++) {
      System.out.print(primes.get(i));
      System.out.print(" ");
    }
  }
}
