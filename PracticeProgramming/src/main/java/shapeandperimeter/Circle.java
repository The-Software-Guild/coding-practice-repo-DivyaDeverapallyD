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
public class Circle  extends  Shape{
    private int radius;
    
    public Circle(int radius)
    {
        this.radius=radius;
    }
    
    @Override
    public double  getArea(){
        
        
     return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
}
