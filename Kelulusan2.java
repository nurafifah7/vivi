/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelulusan2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Kelulusan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in); 
        
    String nama = "";
    String JK = "";
    int TB = 0; 
    
    System.out.println("Masukkan nama : ");
    
   nama = input.nextLine();
    
    System.out.println("Masukkan Jenis Kelamin (L / P)");
    JK = input.nextLine();
    switch(JK){
        case "L": 
        System.out.println("Laki Laki");
        System.out.println("Masukkan tinggi badan ");
        TB = input.nextInt();
        
        if(TB >= 0 && TB <= 170){
        System.out.println("Anda gagal");
        }
        else if(TB >= 171 && TB <= 230){
        System.out.println("Selamat anda lulus");
        }
        else{
        System.out.println("Data Tinggi tidak valid ");
        }
            break;
             case "l": 
        System.out.println("Laki Laki");
        System.out.println("Masukkan tinggi badan ");
        TB = input.nextInt();
        
        if(TB >= 0 && TB <= 170){
        System.out.println("Anda gagal");
        }
        else if(TB >= 171 && TB <= 230){
        System.out.println("Selamat anda lulus");
        }
        else{
        System.out.println("Data Tinggi tidak valid ");
        }
            break;
        case "P":
        System.out.println("Perempuan");
        System.out.println("Masukkan tinggi badan ");
        TB = input.nextInt();
         if(TB >= 0 && TB <= 160){
        System.out.println("Anda gagal");
        }
        else if(TB >= 161 && TB <= 210){
        System.out.println("Selamat anda lulus");
        }
          else{
        System.out.println("Data Tinggi tidak valid ");
        }
            break;
            case "p":
        System.out.println("Perempuan");
        System.out.println("Masukkan tinggi badan ");
        TB = input.nextInt();
         if(TB >= 0 && TB <= 160){
        System.out.println("Anda gagal");
        }
        else if(TB >= 161 && TB <= 210){
        System.out.println("Selamat anda lulus");
        }
          else{
        System.out.println("Data Tinggi tidak valid ");
        }
            break;
        default:
            System.out.println("Pilihan tidak ada");
            break;
    }
    }
    
}
