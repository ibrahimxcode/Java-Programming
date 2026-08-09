import java.util.Scanner;
public class simpleinterestC {
    public static void main()
    {
        //formula SI=(P*R*T)/100
        Scanner sc = new Scanner(System.in);
        int R, T;
        double SI, P;

        System.out.print("Enter Principal amount =");
        P = sc.nextDouble();

        System.out.print("Enter Rate of interest =");
        R = sc.nextInt();

        System.out.print("Enter Loan Time =");
        T = sc.nextInt();

        SI = (P*R*T)/100;

        System.out.println("Interest = " +SI);

        sc.close();
    }
}
