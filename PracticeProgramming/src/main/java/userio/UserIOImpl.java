/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userio;

import java.util.Scanner;

/**
 *
 * @author DivyaDeverapally
 */
public class UserIOImpl implements UserIO{
    
    Scanner input= new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String userInput= input.next();
        return userInput;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        int userIn= input.nextInt();
        return userIn;
        
    }

    @Override
    public int readInt(String prompt, int min, int max) {
         System.out.println(prompt + min + " and "+ max );
         int number= input.nextInt();
         if(number >= min && number <= max)
         {
             return number;
         }
         else
           readInt(prompt,min,max);
         
         return 0;
        
    }

    @Override
    public double readDouble(String prompt) {
          System.out.println(prompt);
          double userIn= input.nextDouble();
          return userIn;
       
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt + min + " and "+ max );
         double number= input.nextInt();
         if(number >= min && number <= max)
         {
             return number;
         }
         else
           readDouble(prompt,min,max);
         
         return 0;
    }

    @Override
    public float readFloat(String prompt) {
       System.out.println(prompt);
          float userIn= input.nextFloat();
          return userIn;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
       System.out.println(prompt + min + " and "+ max );
         float number= input.nextInt();
         if(number >= min && number <= max)
         {
             return number;
         }
         else
           readDouble(prompt,min,max);
         
         return 0;
    }

    @Override
    public long readLong(String prompt) {
    System.out.println(prompt);
          long userIn= input.nextLong();
          return userIn;   
    }

    @Override
    public long readLong(String prompt, long min, long max) {
       System.out.println(prompt + min + " and "+ max );
         long number= input.nextInt();
         if(number >= min && number <= max)
         {
             return number;
         }
         else
           readDouble(prompt,min,max);
         
         return 0;
    }
    
}
