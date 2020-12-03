/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ozura
 */
import java.util.Scanner;
public class kabisat {
    public static void main (String [] Args){
        Scanner input = new Scanner ( System.in) ;
        System.out.println("=============");
        System.out.println("Tahun Kabisat");
        System.out.println("=============");
        System.out.println("Silahkan Masukkkan Tahun = ");
        int Thn = input.nextInt();
        if ((Thn % 4 == 0 && Thn % 100 !=0) || Thn % 400 == 0){
            System.out.println(" Adalah tahun KABISAT");
        }
        else 
            System.out.println( Thn + " Adalah bukan tahun KABISAT");
    }
}
