package Assignment1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");//meminta user memasukkan banyak array yang ingin dibuat
        int n = scanner.nextInt();

        int[] array = new int[n];//mengubah int

        System.out.println("Masukkan " + n + " angkanya:");
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        System.out.println("Jumlah elemen-nya adalah: " + sum);

        scanner.close();
    }
}
