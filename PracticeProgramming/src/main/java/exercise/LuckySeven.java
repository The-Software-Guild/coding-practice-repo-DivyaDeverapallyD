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
public class LuckySeven {
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("How many dollars do you have? ");
		int amount = input.nextInt();
		int maxHold = 0;
		int maxHoldRollCount = 0;
		int min = 1, max = 6;
		
		int rollCount = 0;

		while (amount > 0) {
			rollCount++;
			int ran1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
			int ran2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
			if (ran1 + ran2 == 7) {
				amount = amount + 4;
			} else {
				amount = amount - 1;
			}

			if (amount > maxHold) {
				maxHold = amount;
				maxHoldRollCount = rollCount;
			}

			if (amount == 0) {
				System.out.println("You are broke after  " + rollCount + " rolls.");
				break;
			}

		}

		System.out.println("You should have quit after " + maxHoldRollCount + " rolls when you had $" + maxHold);

	}


    
}
