/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.javaintro;

import edu.upb.javaintro.classes.Person;
import edu.upb.javaintro.utils.Util;

/**
 *
 * @author cahuc
 */
public class Main {
    
    public static void main(String[] args) {
   
        Person a = new Person();
        a.setName("Charlie");
        System.out.println("a: "+a);

        
        a = Util.changeName(a);
        
        System.out.println("new a: "+a);

        
        System.out.println("Person a: "+a.getName());
        
    }
    
}
