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
public class praktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Anda: ");
        String nama = input.nextLine();
        System.out.println("NIS anda: ");
        String NIS = input.nextLine();
        System.out.println("Nilai tugas1 anda: ");
        int nilai1 = input.nextInt();
        System.out.println("Nilai tugas2 anda: ");
        int nilai2 = input.nextInt();
        System.out.println("Nilai tugas3 anda: ");
        int nilai3 = input.nextInt();
        System.out.println("Nilai UTS anda: ");
        int UTS = input.nextInt();
        System.out.println("Nilai praktikum anda: ");
        int praktikum = input.nextInt();
        System.out.println("Nilai UAS anda: ");
        int UAS = input.nextInt();
        int rata2;
        rata2 = (nilai1 + nilai2 + nilai3)/3;
        double nilaiakhir;
        nilaiakhir = (0.15 * UAS) + (0.45 * UTS) + (0.20 * rata2) + (0.20 * praktikum);
        char nilaimutu;
        if (nilaiakhir > 80) {
        nilaimutu = 'A';}
        else if (nilaiakhir > 70 && nilaiakhir <= 80) {
        nilaimutu = 'B';}
        else if (nilaiakhir > 60 && nilaiakhir <= 70) {
        nilaimutu = 'C';}
        else if (nilaiakhir> 50 && nilaiakhir <= 60) {
        nilaimutu = 'D';}
        else {nilaimutu = 'E';}
        
        System.out.println("==NILAI FINAL==");
        System.out.println("NIS: " + NIS);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai rata-rata tugas " + rata2 );
        System.out.println("Nilai UTS: " + UTS);
        System.out.println("Nilai praktikum: " + praktikum);
        System.out.println("Nilai UAS: " + UAS);
        System.out.println("Nilai Akhir: " + nilaimutu);
        }
        
                
        
            
        
        
       
   
        
    }

