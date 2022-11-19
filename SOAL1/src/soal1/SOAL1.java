/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author yonathan
 */
public class SOAL1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[15];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        a[8] = 9;
        a[9] = 10;
        a[10] = 11;
        a[11] = 12;
        a[12] = 13;
        a[13] = 14;
        a[14] = 15;
        System.out.println("Bilangan genap :");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("Bilangan ganjil :");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i] + " ");
            }
        }
        System.out.println("");               
    }
    
}
