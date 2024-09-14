package Assignment1;

public class Tugas1 {
    public static void main(String[] args) {
        int[] array={1,2,3};

        int jumlah = 0;
        for (int bilangan : array){
            jumlah += bilangan;
        }
        System.out.println(jumlah);
    }
}
