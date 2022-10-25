/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;
import java.util.LinkedList;
/**
 *
 * @author asus
 */
public class Dadu {
    private int inputUser;
    int total;

    void setinput( int input ) {
        this.inputUser = input;
    }
    LinkedList<Integer> Objdadu = new LinkedList<Integer>();
    
    void acaknilai() {
        for( int i = 1; i <= this.inputUser; i++ ) {
             int nilaiAcak = 1 + (int)(Math.random() * 6);
            Objdadu.add(nilaiAcak);
            this.total = this.total + nilaiAcak;
        }
    }
    void cetakdadu() {
        for( int i = 1; i <= this.inputUser; i++ ) {
            System.out.println("Dadu ke-" + i + " bernilai " + Objdadu.get(i-1));
        }
        System.out.println("Total nilai dadu keseluruhan " + this.total);
    }
}
