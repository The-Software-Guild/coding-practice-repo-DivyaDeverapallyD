/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import static com.tsg.unittesting.logic.LogicExerciseA.friendlyGreeting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DivyaDeverapally
 */
//friendlyGreeting( "Goofus" , false ) ->   "hi"
//friendlyGreeting( "Gallant" , true ) ->   "Hello, Gallant!"
//friendlyGreeting( null , false ) ->   "..."
public class LogicExerciseATest {
    
    public LogicExerciseATest() {
    }

    @Test
    public void testFriendlyGreetingTrue() {
        String visitorName="Gallant";
        boolean isFriend=true;
        String expected="Hello, Gallant!";
        assertEquals(expected, friendlyGreeting(visitorName,isFriend));
        
        
    }
      @Test
    public void testFriendlyGreetingFlase() {
        String visitorName="Goofus";
        boolean isFriend=false;
        String expected="hi";
        assertEquals(expected, friendlyGreeting(visitorName,isFriend));
    }
      @Test
    public void testFriendlyGreetingNull() {
        String visitorName=null;
        boolean isFriend=false;
        String expected="...";
        assertEquals(expected, friendlyGreeting(visitorName,isFriend));
    }
    
}
