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
public class Square extends Shape{
    int side;
    public Square(int side)
    {
        this.side=side;
    }

    @Override
    double getArea() {
        return side*side;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double getPerimeter() {
        return (4*side);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
