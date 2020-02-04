package code;

/**
 * Class adds two integers
 * sumTwo method has to be updated - It should take 2 int arrays as input
 * and find if the sum is equal to the target no
 * @author rmalar
 */

public class SumTwo {

    /**
     * This method sums two integers and returns an integer
     * @param first is the first number
     * @param second is the second number
     */

    private static int sumTwo(int first, int second) {

        int sumInt = first + second;
        System.out.println ("Sum of two integrs " +sumInt);
        return sumInt;
    }

    public static void main (String[] args) {
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);

        sumTwo(one, two);
    }

}
