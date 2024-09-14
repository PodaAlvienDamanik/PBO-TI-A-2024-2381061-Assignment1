package Assignment1;

public class Tugas2 {
    public static void main(String[] args) {
    int n=4;

    for (int i = 1; i <= n; i++){ //jumlah baris nya i=n
        for (int j= n-i; j>0; j--){ //tugasnya untuk mengatur spasi tiap baris dimana j-- akan mengurangi dari banyak n
            System.out.print(" "); //setelah 3 jam mencari mana yang salah,ternyata print dgn println beda hadeh:)
        }
        for (int k = 1; k<=i; k++){ //mencetak # dimana akan bertambah dengan jumlah i
            System.out.print("#");
        }
        System.out.println();//untuk membuat baris baru
    }
    }
}
