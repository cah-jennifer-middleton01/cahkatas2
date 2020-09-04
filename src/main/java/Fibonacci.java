public class Fibonacci {
    public static String outputSequence(int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < end; ) {
            sb.append(fibonacci(i));
            i++;
            if (i != end) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private static int fibonacci(int i) {
        if (i >= 2) {
            return fibonacci(i - 1) + fibonacci(i - 2);
        } else if (i == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
