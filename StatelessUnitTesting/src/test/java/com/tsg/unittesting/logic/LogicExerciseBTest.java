/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DivyaDeverapally
 *  * Ex:
     * placeOf( 1 ) ->   "1st"
     * placeOf( 3 ) ->   "3rd"
     * placeOf( 22 ) ->   "22nd"
 */
public class LogicExerciseBTest {
    
    LogicExerciseB exerciseB= new LogicExerciseB();
    public LogicExerciseBTest() {
    }

    @Test
    public void testPlaceOf1() {
        int num=1;
        String expected="1st";
        assertEquals(expected,exerciseB.placeOf(num));
    }
     @Test
    public void testPlaceOf2() {
        int num=2;
        String expected="2nd";
        assertEquals(expected,exerciseB.placeOf(num));
    }
     @Test
    public void testPlaceOf33() {
        int num=33;
        String expected="33rd";
        assertEquals(expected,exerciseB.placeOf(num));
    }
     @Test
    public void testPlaceOf4() {
        int num=4;
        String expected="4th";
        assertEquals(expected,exerciseB.placeOf(num));
    }
         @Test
    public void testPlaceOf111() {
        int num=111;
        String expected="111st";
        assertEquals(expected,exerciseB.placeOf(num));
    }
       public void testPlaceOf129() {
        int num=129;
        String expected="129th";
        assertEquals(expected,exerciseB.placeOf(num));
    }
    
}
