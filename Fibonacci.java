/**
 * 
 */
package fibonacci;

/**
 * @author Shadman Abedin
 *
 */
public class Fibonacci {

    // Method to return the Fibonacci number at a given position
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int position = 5; // Change this value to test other positions
        int result = fib(position);
        System.out.println("Fibonacci number at position " + position + " is " + result);
    }
}
