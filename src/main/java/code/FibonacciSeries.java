    package code;

    /**
    ** Fibonacci Series 0 1 1 2 3 5 8 13 21
     * ++i
     */

    public class FibonacciSeries {

        private static void printFibonacciSeries (int limit) {

            int t1 = 0, t2 = 1;
            System.out.println("total count " +limit);

            for (int i=1; i <= limit; i++) {

                if (i == limit) {
                    System.out.println(t1 + " ");
          } else {

            System.out.println(t1 + ", ");
            int sum = t1 + t2;

            t1 = t2;
            t2 = sum;

                }

            }
        }

        public static void main (String args[]) {

    //        printFibonacciSeries(Integer.parseInt(args[0]));
            printFibonacciSeries(10);
        }
    }
