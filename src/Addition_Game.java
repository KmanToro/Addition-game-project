import java.util.Scanner;

public class Addition_Game {
public static void main(String[] args) {
	
//establish point system
	int points = 0;
	System.out.println("Your poiunt =" + points);
	
//asking the user to add two different numbers
	System.out.println("What is the sum of the following numbers");

//making initial random numbers
	int randomnum1 = (int) (Math.random() * 9)+1;
	int randomnum2 = (int) (Math.random() * 9)+1;
	int CorrectAnswer1 = (int) randomnum1 + (int)randomnum2;
	Scanner input = new Scanner(System.in);
	
	System.out.println(randomnum1 + " and " + randomnum2 + "=");	
	int GivenAnswer = input.nextInt();
	
	if (GivenAnswer == CorrectAnswer1)
	{
	System.out.println("Correct!!");
	System.out.println("your points = " + points +1);
	}
	else
	{
	System.out.println("Sorry your answer is incorrect. :( ");
	System.out.println("your points = " + points +0);	
	}


}
}
