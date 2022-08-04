/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        int nextNumber;
        if (n == 1) {
            nextNumber = 1;
        }
        else if (n % 2 == 1) {
            nextNumber = 3 * n + 1;
        }
        else {
            nextNumber = n/2;
        }
        return nextNumber;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

