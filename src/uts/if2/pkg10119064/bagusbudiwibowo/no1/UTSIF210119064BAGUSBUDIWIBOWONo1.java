/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119064.bagusbudiwibowo.no1;

import java.util.Calendar;
import java.util.Scanner;
import model.Age;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi program yang berfungsi untuk menampilkan
 * usia sekarang dan menampilkan sifat seseorang pada usia saat ini
 */
public class UTSIF210119064BAGUSBUDIWIBOWONo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);
        
        Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        System.out.print("Masukan Tahun Lahir Anda : ");
        age.setYearBirth(keyboard.nextInt());
        
        System.out.println();
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu : " + age.tandanyaKamu(age.hitungUmur()));
        
    }
    
}
