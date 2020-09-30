/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class BoleanOr {
      public static void main(String args[]){

// these are boolean variables     
      boolean A = true;
      boolean B = false; 

      System.out.println("A|B = "+(A|B));
      System.out.println("A&B = "+(A&B));
      System.out.println("!A = "+(!A));
      System.out.println("A^B = "+(A^B));
      System.out.println("(A|B)&A = "+((A|B)&A));
    }
}
