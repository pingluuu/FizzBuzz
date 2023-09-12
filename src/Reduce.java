public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int c = 0;
        do_reduce(i, c);
    }
    public static void do_reduce(int i, int c) {
        while (i > 0) {

            // Find out which numbers divide i.
            boolean even = i % 2 == 0;
            boolean odd = i % 2 != 0;

            // Print our appropriate result.
            if (even) {
                i = i/2;
                c++;
            } else {
                i--;
                c++;
            }
        }
        System.out.println(c);
    }

}
