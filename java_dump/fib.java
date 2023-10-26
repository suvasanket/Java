public class fib {
    private static long[] fibcache;

    public static void main(String[] args) {
        int n = 500;
        fibcache = new long[n + 1];
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (fibcache[n] != 0) {
            return fibcache[n];
        }
        long x = (fibonacci(n - 1) + fibonacci(n - 2));
        fibcache[n] = x;
        return x;
    }
}
