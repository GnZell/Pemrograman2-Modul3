/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;
import java.util.Scanner;
import java.util.LinkedList;
/**
 *
 * @author asus
 */
public class Main2 {
     public static void main(String[] args) {
        String namaNegara = "", jenisKepemimpinan = "", namaPresiden = "";
        int tanggalKemerdekaan = 0, bulanKemerdekaan = 0, tahunKemerdekaan = 0;
        Scanner input = new Scanner(System.in);
        
        LinkedList<Negara> ObjNegara = new LinkedList<Negara>();
        
        int inputUser = input.nextInt();
        for (int i = 0; i < inputUser; i++){
            Negara tampungNegara = new Negara(namaNegara, jenisKepemimpinan,namaPresiden, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            tampungNegara.getData();
            ObjNegara.add(tampungNegara);
        }
        for (int i = 0; i < ObjNegara.size(); i++){
            Negara Cetak = ObjNegara.get(i);
            Cetak.tampilkan();
    }
    }

}
