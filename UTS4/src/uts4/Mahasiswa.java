/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts4;

/**
 *
 * @author yonathan
 */
public class Mahasiswa {
    
    int id;
    String name;
    String kelas;
    int tglMasuk;

    public Mahasiswa(int id, String name, String kelas, int tglMasuk) {
        this.id = id;
        this.name = name;
        this.kelas = kelas;
        this.tglMasuk = tglMasuk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(int tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", name=" + name + ", kelas=" + kelas + ", tglMasuk=" + tglMasuk + '}';
}}
