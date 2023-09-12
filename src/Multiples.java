public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int c = 0;
        do_FizzBuzz1000(i, c);
    }
    public static void do_FizzBuzz1000(int i, int c) {
        while (i < 1001) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
                i++;
                c++;
            } else if (divisibleBy3) {
                i++;
                c++;
            } else if (divisibleBy5) {
                i++;
                c++;
            } else {
                i++;
            }
        }
        System.out.println(c);
    }

}
