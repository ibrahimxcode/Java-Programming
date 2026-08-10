import java.util.Scanner;
public class CalculatorV2 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Here we take two integer that store user input and one chose of user
        int menu;
        double Num1 , Num2 ;
        System.out.println("===========================Welllcome To Advance Calculator===========================");

        //here we take input from user
        System.out.print("Enter Number 1 :-");
        Num1 = sc.nextDouble();

        System.out.print("Enter Number 2 :-");
        Num2 = sc.nextDouble();

        //Here we going to give Operation's Menu to user
        System.out.println("+++++++++++++++++++Here Is All Mathmatical Operation's+++++++++++++++++++");
        System.out.println("1.Additon");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Divison");
        System.out.println("5.Remainder");
        System.out.println("-------------------Please Lets Us Know You're Choice----------------------");

        System.out.print("Enter you'r Choice :-");
        menu = sc.nextInt();

        switch(menu)
        {
            case 1 :
                System.out.printf("Result = %.2f%n",Num1+Num2);//Addition of Num1 + Num2
                break;
            case 2 :
                System.out.printf("Result = %.2f%n",Num1-Num2);//Subtraction of Num1 -Num2
                break;
            case 3 :
                System.out.printf("Result = %.2f%n",Num1*Num2);//Multiplication of Num1 * Num2
                break;
            case 4 :
                if (Num2 != 0) {
                    System.out.printf("Result = %.2f%n", Num1 / Num2);//Division of A / B
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            case 5 :
                if (Num2 != 0) {
                    System.out.printf("Result = %.2f%n", Num1 % Num2);//Remainder of A % B
                } else {
                    System.out.println("Cannot find remainder with zero!");
                }
                break;
            default:
                System.out.println("!!!!!!!!!!!!!!!!!!Invalid Choice!!!!!!!!!!!!!!!!!!");
        }
        sc.close();
    }
}
