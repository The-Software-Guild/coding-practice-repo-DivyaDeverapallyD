/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.logic;

/**
 *
 * @author ahill
 */
public class LogicExerciseB {

    /**
     * Given a number, return the 'place rank' word associated with it.
     * I.e. pretend you're ranking folks running in a race from the order they
     * arrived at the finish line. Assume nonzero, positive inputs! 
     * Also, start by going up to 100, but stretch to more if you can!
     *
     * Ex:
     * placeOf( 1 ) ->   "1st"
     * placeOf( 3 ) ->   "3rd"
     * placeOf( 22 ) ->   "22nd"
     *
     * @param place
     * @return String
     */
    public String placeOf(int place) {
        String res="";
        if(place==1 || (place%10 == 1))
            res=res+place+"st";
        else if(place ==2 || (place%10 ==2))
            res=res+place+"nd";
        else if(place==3 || (place%10==3))
            res=res+place+"rd";
        else{
            res=res+place+"th";
        }
        
        return res.trim();
       
    }

}
