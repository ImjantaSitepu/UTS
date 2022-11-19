/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yonathan
 */
public class SOAL2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] angka = new int[10];
        Scanner valueArray = new Scanner(System.in);

        System.out.println("Masukan Isi Dari Array");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukan Index ke-" + (i + 1) + " : ");
            angka[i] = valueArray.nextInt();
        }
        sort(angka);
        System.out.println("Isi Arraay : " + Arrays.toString(angka));
    }
    
    static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
}
