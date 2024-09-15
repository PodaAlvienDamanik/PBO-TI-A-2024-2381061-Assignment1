package Assignment1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");//meminta user memasukkan banyak array yang ingin dibuat
        int n = scanner.nextInt();

        int[] array = new int[n];//mengubah angka input user ke dalam array

        System.out.println("Masukkan " + n + " elemen array:");//Memasukkan angka isi array tersebut
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();//isi angka array nya
        }

        int jumlah = 0;//dibuat 0 agar sama dengan jumlah array nya,sehingga ketika ditambah maka angka didalam array akan ditambah dengan indeks array tersebut
        for (int i = 0; i < n; i++) {
            jumlah += array[i];
        }

        System.out.println("Jumlah elemen array adalah: " + jumlah);

        scanner.close();
    }
}
