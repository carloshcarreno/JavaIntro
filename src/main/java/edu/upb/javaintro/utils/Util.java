/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.javaintro.utils;

import edu.upb.javaintro.classes.Person;

/**
 *
 * @author cahuc
 */
public class Util {
    
    public static Person changeName(Person p){
        
        Person z = new Person();
        System.out.println("z: "+z);
        z.setName("Super saiyan "+p.getName());
        return z;
    }
    
}
