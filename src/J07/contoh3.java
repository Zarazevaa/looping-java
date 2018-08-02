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
public class contoh3 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan angka: ");
        angka = baca.nextInt();
        
        if (angka == 0)
        {
            System.out.print("Bilangan nol");
        }
        else if (angka > 0)
        {
            System.out.print("Bilangan positif");
        }
        else
        {
            System.out.print("Bilangan negatif");
        }
        
        
    }
    
}
