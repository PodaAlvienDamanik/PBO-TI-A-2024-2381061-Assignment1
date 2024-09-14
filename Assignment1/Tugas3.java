package Assignment1;

public class Tugas3 {
    public static void main(String[] args) {
        String camelCaseString = "saveChangesInTheEditor";

        int wordCount = hitungkatacamelCase(camelCaseString);

        System.out.print(" Jumlah kata: " + wordCount);
    }

    public static int hitungkatacamelCase(String str) {
        if (str == null || str.isEmpty()) { //jika tidak ada string maka akan mengembalikan nilai 0
            return 0;
        }

        int count = 1; //dimulai dari 1 karena kata camelCase diawali dengan huruf kecil

        for (char c : str.toCharArray()) { //akan mengecek setiap kata yanng ada string dalam bentuk array
            if (Character.isUpperCase(c)) { //jika ada kata yang diawali dengan huruf kapital maka akan dihitunh sebagai kata baru
                count++;
            }
        }

        return count;//mengembalikan count ke main untuk diproses di int wordcount dan ditampilkan di sout jumlah kata
    }
}
