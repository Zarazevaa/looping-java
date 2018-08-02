/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07;
import java.util.Scanner;
/**
 *
 * @author ZEVA
 */
public class contoh2 {
     public static void main(String[] args) { 
    
        Scanner baca = new Scanner(System.in);
        
        int umur;
        
        System.out.print("Masukkan umur: ");
        umur = baca.nextInt();
        
        if(umur >= 17)
        {
            System.out.println("wajib mengurus ktp");
        }
        else
        {
            System.out.println("belum wajib mengurus ktp");
        }

     }
}
      
