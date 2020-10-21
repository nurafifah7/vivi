/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class DoWhileLoop {
    
  public static void main (String[] args){
        System.out.println("ini adalah awal program");
        int a =0;
        boolean kondisi = false;
        
        do {
           a++;
          System.out.println("do while ke-" + a);
          if (a==10){
              kondisi =true;
          }
        }
        while (kondisi);
         System.out.println("ini adalah akhir program"); 
    }
}

