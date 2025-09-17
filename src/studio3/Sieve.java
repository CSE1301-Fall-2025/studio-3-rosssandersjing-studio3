import java.util.Scanner;

public class Sieve {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Find all prime numbers up to: ");
        int n = scanner.nextInt();
        scanner.close();

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
    
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}