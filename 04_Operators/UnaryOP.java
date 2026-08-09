public class UnaryOP {
    public static void main(String[] args) {

        // Unary Operators work on only one value

        int A = 10;

        // Unary plus
        System.out.println("Unary Plus = " + (+A));

        // Unary minus
        System.out.println("Unary Minus = " + (-A));

        // Increment
        A++;
        System.out.println("After Increment = " + A);

        // Decrement
        A--;
        System.out.println("After Decrement = " + A);

        // Logical NOT
        boolean result = true;
        System.out.println("Logical NOT = " + (!result));
    }
}