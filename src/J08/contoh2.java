/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08;

/**
 *
 * @author ZEVA
 */
public class contoh2 {
    public static void main(String[] args) {
        // FOR
        int x;
        for(x = 1; x <= 10; x++)
        {
            System.out.print(x + " ");
        }
        
        // WHILE
        x = 1;
        while (x <= 10)
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
        while (x <= 10);
                
    }
    
}
