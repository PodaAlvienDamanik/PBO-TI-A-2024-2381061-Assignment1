package Assignment1;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata dalam bentuk camelCase:");
        String kata = input.nextLine();//nginput string kata

        int JumlahKata = 1;//dimulai 1 karena awalan dari camelCase huruf kecil

        for (int i= 0; i<kata.length(); i++) {
            if (Character.isUpperCase(kata.charAt(i))){//ngecek kalau ada kata yang berawalan huruf kapital maka akan dihitung sebagai kata baru
                JumlahKata++;
            }
        }
        System.out.println("jumlah kata dalam camelCase: "+ JumlahKata);//diubah bang salah logika rupanya wkwkwk
        input.close();
    }
}
