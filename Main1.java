/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main1 {
         public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        Dadu dadu = new Dadu();
 
        int inputUser = input.nextInt();
        
        dadu.setinput(inputUser);
        dadu.acaknilai();
        dadu.cetakdadu();
    }
}
