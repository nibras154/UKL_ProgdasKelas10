import java.util.Scanner;

public class Soal3no3{
    public static void main(String[] args) {
        Scanner ibra = new Scanner(System.in);
        System.out.println("Masukkan jumlah : ");
        int n = ibra.nextInt();
        int [] array = new int[n];
        System.out.println("Masukkan elemen : ");
        for (int i = 0; i < n; i++) {
            array[i] = ibra.nextInt();
        }
        System.out.println("Angka yang sama dalam elemen: ");
        for (int i = 0; i <n; i++) {
            int faiz = 1;
            for (int j = i+1; j <n; j++) {
                if (array[i] == array[j]) {
                    faiz++;
                }
            }
            if (i == 0 || array[i] != array[i - 1]){
                System.out.println(array[i] + " muncul " + faiz+ " kali ");
            }
        }
        ibra.close();
    }
}