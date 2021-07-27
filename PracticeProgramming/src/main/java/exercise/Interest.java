/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;
import java.util.Scanner;

/**
 *
 * @author SandeepReddy
 */
public class Interest {
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("How much do you want to invest?");
		double  amount=  input.nextDouble();
	//	double tempAmount=amount;
				System.out.println("How many years are investing?");
				double years= input.nextInt();
				System.out.println("What is the annual interest rate % growth? ");
				double rate= input.nextInt();
				
				for(int i =1; i <= years; i++)
				{
					double tempAmount=amount;
					double res=0;
					System.out.println("Year " + i+":" );
					System.out.format("Began with $%.2f" , amount);
					System.out.println();
					for(int j =0; j <=12; j=j+4)
					{
						amount=amount*(1+((rate/400)));
					}
					
					System.out.format("Earned $%.2f",(amount-tempAmount));
					System.out.println();
					System.out.format("Ended with $%.2f", amount);
					System.out.println();
					System.out.println();
				}
		
	}


}
