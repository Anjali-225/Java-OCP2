/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_Polymorphism_StaticExamples;

/**
 *
 * @author anjali
 */
public class StaticError {
    
    private int x;
    
    public static void staticMethod() {
    /*  
        x = 1; // compile error
        instanceMethod(); // compile error
    */
    }
    
    public void instanceMethod() {
        x = 2;
    }
}
