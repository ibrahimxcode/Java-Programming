//To use Scanner , we First import it
import java.util.Scanner;
public class Input {
    public static void main(String[] args)
    {
        //create scanner object
        Scanner sc = new Scanner(System.in);

        //take input from user 
        System.out.print("Enter Your Name:-");
        String name = sc.nextLine(); // here we store user given value in age variable

        //Display input
        System.out.println(" Hello !" + name);

        //close Scanner
        sc.close();
    }
}
