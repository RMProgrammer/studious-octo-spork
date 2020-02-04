package code;


/**
 * Class reverses an integer
 * @author rmalar
 */
public class ReverseInteger {

    /**
     * This method reverses an integer
     * @param myNumber is the number to reverse
     */

    private static int reverseInteger (int myNumber) {
        int revNum = 0;
        boolean flag = false;

        while (!flag) {
            revNum = (revNum * 10) + (myNumber % 10);
            myNumber /=10;

            if (myNumber == 0) {
                flag = true;
            }
        }

        return revNum;
    }

    public static void main (String[] args) {
        if (!(args[0].equals(null)) || (!(args[0].equals('0')))) {
            int rev = reverseInteger(Integer.parseInt(args[0]));
            System.out.println(rev);
        }
        else
            System.out.println("Input number is empty");
    }
}
