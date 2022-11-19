/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts4;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author yonathan
 */
public class UTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LinkedList<Mahasiswa> mahasiswaList = new LinkedList<>();
        mahasiswaList.add(new Mahasiswa(2255201, "Didhan Aditya Huda", "TIFRM22A", 181122));
        mahasiswaList.add(new Mahasiswa(2255202, "Tio Romadon", "TIFRM22B", 181122));
        mahasiswaList.add(new Mahasiswa(2255203, "Rizki Rizaldi", "TIFK22A", 181122));
        mahasiswaList.add(new Mahasiswa(2255204, "Umar Said", "TIFK22B", 181122));
        mahasiswaList.add(new Mahasiswa(2255205, "Yanuar Saputra", "TIFRM22C", 181122));

        Scanner valueId = new Scanner(System.in);
        Scanner valueName = new Scanner(System.in);
        Scanner valueKelas = new Scanner(System.in);
        Scanner valueTanggal = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        System.out.println("Masukan Data Mahasiswa Untuk Ditambahkan");
        System.out.print("Masukan Id Mahasiswa : ");
        int id = valueId.nextInt();
        System.out.print("Masukan Nama Mahasiswa : ");
        String name = valueName.nextLine();
        System.out.print("Masukan Kelas Mahasiswa : ");
        String kelas = valueKelas.nextLine();
        System.out.print("Masukan Tanggal : ");
        int tanggal = valueTanggal.nextInt();

        mahasiswaList.add(new Mahasiswa(id, name, kelas, tanggal));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

        System.out.println("Masukan Data Mahasiswa Untuk Dihapus");
        System.out.print("Masukan Nama Mahasiswa : ");
        String nameRemove = value.nextLine();
        mahasiswaList.removeIf(mahasiswa -> mahasiswa.getName().contains(nameRemove));
        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));  // TODO code application logic here
    }
    
}
