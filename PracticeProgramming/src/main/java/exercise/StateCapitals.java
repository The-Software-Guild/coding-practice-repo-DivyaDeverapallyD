/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DivyaDeverapally
 */
public class StateCapitals {
    public static void main(String[] args)
    {
        HashMap<String,String> stateCapitalsMap= new HashMap<String, String>();
        stateCapitalsMap.put("Alberta","Edmonton");
        stateCapitalsMap.put("British Columbia","Victoria");
        stateCapitalsMap.put("Manitoba","Winnipeg");
        stateCapitalsMap.put("New Brunswick","Fredericton");
        stateCapitalsMap.put("Ontario","Toronto");
        stateCapitalsMap.put("Quebec","Montreal");
        
        //System.out.println(stateCapitalsMap.keySet());
        Collection<String> states= stateCapitalsMap.keySet();
        System.out.println("STATES"+"\n"+"===========");
        for(String s: states)
            System.out.println(s);
        System.out.println();
        System.out.println("CAPITALS"+"\n"+"===========");
        Collection<String> capitals= stateCapitalsMap.values();
        for(String  c: capitals)
             System.out.println(c);
        System.out.println();
        
         System.out.println("STATES/CAPITAL PAIRS"+"\n"+"===========");
         for(Map.Entry<String,String> entry: stateCapitalsMap.entrySet())
                 {
                     System.out.println(entry.getKey() +" - "+ entry.getValue());
                 }
        
    }
    
}
