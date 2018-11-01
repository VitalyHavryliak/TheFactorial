import java.util.Scanner;

public class Main {
    static long is_factorial_of(long x)
    {
        long divisor;

        for (divisor = 1; divisor < x; x /= divisor++)
            if (x % divisor != 0)
                return -1;

        return x == divisor ? divisor : -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(is_factorial_of(scanner.nextLong()));
    }
}
