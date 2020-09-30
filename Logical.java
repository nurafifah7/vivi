/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.io.*; 
  
class Logical { 
    public static void main(String[] args) 
    { 
        // initializing variables 
        int a = 10, b = 1, c = 10, d = 30; 
  
        // Displaying a, b, c 
        System.out.println("Var1 = " + a); 
        System.out.println("Var2 = " + b); 
        System.out.println("Var3 = " + c); 
        System.out.println("Var4 = " + d); 
  
        // using logical OR to verify 
        // two constraints 
        if (a > b || c == d) 
            System.out.println("One or both"
                               + " the conditions are true"); 
        else
            System.out.println("Both the"
                               + " conditions are false"); 
    } 
} 
