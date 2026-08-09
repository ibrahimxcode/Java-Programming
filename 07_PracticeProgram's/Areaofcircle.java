import java.util.Scanner;
public class Areaofcircle {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159, radius, result;

        System.out.print("Enter Radius of Circle:-");
        radius = sc.nextDouble();

        result = pi * radius * radius;

        System.out.println("Area of Circle is :-" + result);

        sc.close();
    }
}
