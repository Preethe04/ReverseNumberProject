public class ReverseNumber {
    public static int reverse(int number) {
        long n = Math.abs((long) number);
        long reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        if (number < 0) reversed = -reversed;
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            throw new ArithmeticException("Reversed number exceeds integer range");
        }
        return (int) reversed;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Reverse of " + number + " = " + reverse(number));
    }
}
