/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseB.multiplyAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DivyaDeverapally
 * 
 */


 // multiplyAll( 5 , [ 1 , 2 , 3 , 4 , 5 ] ) ->  [ 5 , 10 , 15 , 20 , 25 ]
     // multiplyAll( 0 , [ 1 , 1 , 1 , 1 , 1  , 1 , 1 , 1 , 1 ] ) ->  [ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 ]
     //multiplyAll( -1 , [ -2 , 0 , 0 , 1 ] ) ->  [ 2 , 0 , 0 , -1 ]
public class ArrayExerciseBTest {
    
    public ArrayExerciseBTest() {
    }

 
    @Test
    public void testMultiplyAllWithPositive(){
        
        int[] numbers={1,2,3,4,5};
        int multiplier=5;
        int[] expectedArray={5,10,15,20,25};
        int resultArray[]=multiplyAll(multiplier, numbers);
        assertArrayEquals(expectedArray, resultArray);

        
    }
    @Test
    public void testMultiplyAllWithNegative(){
         int[] numbers={-2,0,0,1};
        int multiplier=-1;
        int[] expectedArray={2,0,0,-1};
        int resultArray[]=multiplyAll(multiplier, numbers);
        assertArrayEquals(expectedArray, resultArray);
    }
     @Test
    public void testMultiplyAllWithZero(){
         int[] numbers={1,1,1,1,1,1,1,1,1};
        int multiplier=0;
        int[] expectedArray={0,0,0,0,0,0,0,0,0};
         int resultArray[]=multiplyAll( multiplier, numbers);
        assertArrayEquals(expectedArray, resultArray);
    }
    
}
