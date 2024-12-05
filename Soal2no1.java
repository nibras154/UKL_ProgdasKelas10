import java.util.Scanner;

public class Soal2no1 {
     public static void main(String[] args) {
        Scanner ibra = new Scanner(System.in);
        int n =1;
        System.out.println("Masukkan Bilangan Bulat: ");
        int nilai = ibra.nextInt();
        if (nilai <=0) {
            System.out.println("tidak dapat di akses");
        } else {
            for (int i = 1; i <=nilai; i++) {
                n *=i;
            }
            System.out.println("Hasil Faktorial Dari: " + nilai + " Adalah: "+n);
        }
            ibra.close();
 }
}

