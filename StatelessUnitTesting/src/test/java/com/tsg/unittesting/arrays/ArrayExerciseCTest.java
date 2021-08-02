/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author DivyaDeverapally
 */
//stringThemTogether( { 1, 3, 3, 7 }  ) ->  "1337"
// stringThemTogether( { 1, 33, 555, 7777, 99999 } ) ->  "133555777799999"
//stringThemTogether( { }  ) ->  ""
public class ArrayExerciseCTest {
    ArrayExerciseC arrayExerciseC = new ArrayExerciseC();
    public ArrayExerciseCTest() {
    }

    @Test
    public void testStringThemTogetherSingleDigit() {
         int[] nums= {1, 3, 3, 7};
        String expected="1337";
        String result=arrayExerciseC.stringThemTogether(nums);
         assertEquals(expected, result);
    }
     @Test
    public void testStringThemTogetherBigNumbers() {
        
         int[] nums= {1,33,555, 7777, 99999};
        String expected="133555777799999";
        String result=arrayExerciseC.stringThemTogether(nums);
         assertEquals(expected, result);
    }
     @Test
    public void testStringThemTogetherEmptyArray() {
        int[] nums= {};
        String expected="";
        String result=arrayExerciseC.stringThemTogether(nums);
         assertEquals(expected, result);
       // AssertEquals(expected,stringThemTogether(nums));
    }
}
