/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08;
import java.util.Scanner;
/**
 *
 * @author ZEVA
 */
public class contoh2 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        // FOR
         System.out.print("Masukkan nilai akhir: ");
        int x;
        int n;
        n = baca.nextInt();
        
        for(x = 1; x <= n; x++)
        {
            System.out.print(x + " ");
        }
        
        // WHILE
        x = 1;
        while (x <= n)
        {
            System.out.println(x + " ");
            x++;
        }
        
        // DO WHILE
        x = 1;
        do 
        {
            System.out.println(x + " ");
            x++;
        }
        while (x <= n);
                
    }
    
}
