/*
* Author: cy.andersen
* Date: Jan. 6, 2021
* Description:
*/
import java.util.Scanner;
public class Winning_Score
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Three-point shots for Apples: ");
		int threepointshotA = input.nextInt();
		System.out.println("Two-point shots for Apples: ");
		int twopointshotA = input.nextInt();
		System.out.println("One-point shots for Apples: ");
		int onepointshotA = input.nextInt();
		System.out.println("Three-point shots for Bananas: ");
		int threepointshotB = input.nextInt();		
		System.out.println("Two-point shots for Bananas: ");
		int twopointshotB = input.nextInt();
		System.out.println("One-point shots for Bananas: ");
		int onepointshotB = input.nextInt();
		int Ascore = threepointshotA*3 + twopointshotA*2 + onepointshotA;
		int Bscore = threepointshotB*3 + twopointshotB*2 + onepointshotB;
		if (Ascore>Bscore)
			System.out.println("A");
		if (Ascore<Bscore)
			System.out.println("B");
		else
			System.out.println("T");

	}

}
