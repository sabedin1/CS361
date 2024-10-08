/**
 * 
 */
package evaluation;

/**
 * @author Shadman Abedin
 *
 */
public class EvaluationTest {

    public static void main(String[] args) {
        int result = testRecursiveFunction(5);
        System.out.println("Final Result: " + result);
    }

    public static int testRecursiveFunction(int n) {
        System.out.println("Entering testRecursiveFunction with n = " + n);
        
        if (n == 0) {
            System.out.println("Base case reached with n = 0");
            return 0; // Base case
        } else {
            // Recursive call
            int recursiveResult = testRecursiveFunction(n - 1);
            System.out.println("Returning from testRecursiveFunction with n = " + n + ", recursiveResult = " + recursiveResult);
            return n + recursiveResult; // Combine the results
        }
    }
}
