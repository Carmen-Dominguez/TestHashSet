/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhashset;

/**
 *
 * @author cdomi
 */
import java.util.*;

public class TestHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create HashSet
        HashSet<String> set = new HashSet<String>();

        //add strings to the set
        set.add("Washington DC");
        set.add("New York");
        set.add("San Francisco");
        set.add("Seatle");
        //set.add("New York");
        set.add("New Orleans");
        
        

        System.out.println(set);

        //Obtain an iterator
        Iterator<String> it = set.iterator();
        
        

        while (it.hasNext()) {

            System.out.print(it.next());
        }
        
        
    }
}
