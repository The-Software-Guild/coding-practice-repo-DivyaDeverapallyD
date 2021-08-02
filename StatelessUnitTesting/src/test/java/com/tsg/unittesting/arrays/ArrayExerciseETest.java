/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseE.camelCaseIt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DivyaDeverapally
 */

//camelCaseIt( {"llama", "llama", "duck"}  ) ->  "llamaLlamaDuck"
//camelCaseIt( {"lambs", "eat", "oats", "and", "does", "eat", "oats"}  ) ->  "lambsEatOatsAndDoesEatOats"
public class ArrayExerciseETest {
    
    public ArrayExerciseETest() {
    }

    @Test
    public void testCamelCaseIt1() {
        String[] words={"llama", "llama", "duck"};
        String expected="llamaLlamaDuck";
        assertEquals(expected,camelCaseIt(words));
    }
       @Test
    public void testCamelCaseIt2() {
        String[] words={"lambs", "eat", "oats", "and", "does", "eat", "oats"};
        String expected="lambsEatOatsAndDoesEatOats";
        assertEquals(expected,camelCaseIt(words));
    }
       @Test
    public void testCamelCaseIt3() {
        String[] words={"DO", "OR", "DO", "NOT", "THERE", "IS", "NO", "TRY"};
        String expected="doOrDoNotThereIsNoTry";
        assertEquals(expected,camelCaseIt(words));
    }
    
    
}
