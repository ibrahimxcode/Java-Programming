import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args)
    {
        //formula = (celsius*9/5)+32
        Scanner sc = new Scanner(System.in);
        int celsius;
        double Fahrenheit;

        System.out.print("Enter Celsius:-");
        celsius = sc.nextInt();

        Fahrenheit = (celsius*9/5)+32;

        System.out.println("Fahrenheit="+Fahrenheit);

        sc.close();

    }
}
