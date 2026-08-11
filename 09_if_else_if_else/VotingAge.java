/*In this program we're going to learn conditional statements which are if, else if ,else.
The allow program to make decision bassed on conditions.*/
//Here we check whether the person is eligible for voting.
import java.util.Scanner;
public class VotingAge {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // First declear variable to store user age .
        int age;
        // Here we ask for age from user
        System.out.print("Enter You're Age :-");
        age = sc.nextInt();

        //Here we use to check age is eligible for voting by conditional statements
        if(age < 18)// Here we check Whether the person's age is below 18
        {
            System.out.printf("Sorry ! you're age %d is not eligible for voting%n",age);
        }
        else if ( age >= 18)//Here we check Whether the person's is eligible for voting 
        {
            System.out.println("You're eligible for voting");
        }
        else//If user give unwanted input
        {
            System.out.print("!!Invaild Input!!");
        }
        sc.close();
    }
}
