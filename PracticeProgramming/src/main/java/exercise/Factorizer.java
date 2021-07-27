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
public class Factorizer {
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
         System.out.print("What number would you like to factor? ");
         int num=input.nextInt();
          System.out.print("The Factors of "+ num +" are : ");
          int c=0;
          int sum=0;
          for(int i =1 ; i < num; i++)
          {
              if(num%i==0)
              {
                  System.out.print(i+"\t");
                  sum=sum+i;
                  c++;
              }
          }
          System.out.println(num);
          System.out.println(num + "has "+ c +"  Factors");
          if(sum==num)
          {
              System.out.println(num + " is a perfect number.");
          }
          if(isPrime(num))
          {
              System.out.println(num  + "is a prime number.");
          }
          else
          {
               System.out.println(num  + "is not a prime number.");
          }
       
          
          
         
    }
    
    public static  boolean isPrime(int num)
    {
        boolean isPrime=true;
        
        for(int i =2; i < num; i++)
        {
            if(num % i==0)
                isPrime=false;
        }
        return isPrime;
    }
}
