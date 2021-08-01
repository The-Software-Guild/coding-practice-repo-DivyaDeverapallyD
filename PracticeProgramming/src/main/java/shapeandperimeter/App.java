/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeandperimeter;

/**
 *
 * @author DivyaDeverapally
 */
public class App {
    
    public static void main(String[] args)
    {
        Shape circle= new Circle(5);
        System.out.println("Area of circle : "+ circle.getArea()+"\t"+" Perimeter is  : "+ circle.getPerimeter());
   Shape square= new Square(10);
    System.out.println("Area of square : "+ square.getArea()+"\t"+" Perimeter is  : "+ square.getPerimeter());
    }
    
}
