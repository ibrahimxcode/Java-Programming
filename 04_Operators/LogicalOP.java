public class LogicalOP {
    public static void main(String[] args) {

        // Logical Operators used to combine conditions

        int A = 10;
        int B = 5;

        // AND operator
        System.out.println("A > 5 AND B < 10 = " + (A > 5 && B < 10));

        // OR operator
        System.out.println("A > 20 OR B < 10 = " + (A > 20 || B < 10));

        // NOT operator
        System.out.println("NOT (A > B) = " + !(A > B));
    }
}