import java.util.Scanner;
public class Voting 
{
	public static void main(String[] args) 
	{
        int age;
        @SuppressWarnings("resource")
		Scanner scann = new Scanner(System.in);
        System.out.println("Enter the age");
        age=scann.nextInt();
        System.out.println(age>=18 ? "Ready to vote" : "You are not eligible");
	}

}
