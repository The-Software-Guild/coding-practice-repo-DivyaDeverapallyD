/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.DogBuddy.howManyWoofs;
import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DivyaDeverapally
 */
 /**
     * Given an array of ints, find and return the maximum value.
     * 
     * Example Results:
     * maxOfArray( {1}  ) ->  1
     * maxOfArray( {3,4,5}  ) ->  5
     * maxOfArray( {-9000, -700, -50, -3}  ) ->  -3
     * 
     * @param numbers array of integers
     * @return int max
     */
public class ArrayExerciseATest {
    
    public ArrayExerciseATest() {
    }

    @Test
    public void testSomeMethod() {
    }
    
    @Test
    public void testmaxOfArraySize1(){
        int[] array={1};
        int expected=1;
        assertEquals(expected, maxOfArray(array));
    }
    
    @Test
    public void testMaxOfArrayPositive(){
        int[] array= {3,4,5};
        int expected=5;
         assertEquals(expected, maxOfArray(array));
    }
    
    @Test
    public void testMaxOfArrayNegative(){
        int[] array= {-9000, -700, -50, -3} ;
        int expected= -3;
         assertEquals(expected, maxOfArray(array));
    }
    
}
