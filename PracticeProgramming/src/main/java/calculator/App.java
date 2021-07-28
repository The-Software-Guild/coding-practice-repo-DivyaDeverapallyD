/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author DivyaDeverapally
 */
public class App {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   boolean  isContinue= true;
   while(isContinue){
   System.out.println("Choose Operation 1/2/3/4");
   System.out.println("1: Addition"+"\n"+ "2: Subtraction"+"\n"+"3: Division"+
           "\n"+"4: Multiplication");
   
   int operation =input.nextInt();
   System.out.println("Enter value 1 : ");
   int value1= input.nextInt();
 
   System.out.println("Enter value 2 : ");
     int value2= input.nextInt();
     
     SimpleCalculator calculator= new SimpleCalculator();
     int result =0;
        switch (operation) {
            case 1:
                result = calculator.addition(value1, value2);
                break;
            case 2:
                result =  calculator.subtraction(value1, value2);
                break;
            case 3:
                result = calculator.division(value1, value2);
                break;
            case 4:
                result = calculator.multiplication(value1, value2);
                break;
            default:
                System.out.println("Wrong option ");
                
                break;
        }
        System.out.println("Result is : "+ result);
        System.out.println("Do you want to continue??(Y/N)");
        String option= input.next();
        if(option.equalsIgnoreCase("N"))
        {
            isContinue= false;
            System.out.println("Thanks for Plaing ");
            return;
        }
         
        
        
   }
         
   
  
   
    
            
    }
}
