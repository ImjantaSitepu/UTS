/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yonathan
 */
public class UTS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new mahasiswa(2255201, "Imjanta Sitepu", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255202, "Tio ", "TIFRM22B", 181122));
        mahasiswaList.add(new mahasiswa(2255203, "Rizki Rizaldi", "TIFK22A", 181122));
        mahasiswaList.add(new mahasiswa(2255204, "Umar Said", "TIFK22B", 181122));
        mahasiswaList.add(new mahasiswa(2255205, "Yanuar Saputra", "TIFRM22C", 181122));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        mahasiswaList.remove(0);

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size()); 
    }
    
}
