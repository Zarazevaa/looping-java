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
public class contoh1 {
    public static void main(String[] args) {
    
        Scanner baca = new Scanner(System.in);
        
        int x;
        
        System.out.print("Masukkan bilangan sembarang: ");
        x = baca.nextInt();
        
        if(x % 2 == 0)
        {
            System.out.println("bilangan genap");
        }
        else
        {
            System.out.println("bilangan ganjil");
        }
}
}
