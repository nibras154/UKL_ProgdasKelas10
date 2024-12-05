import java.util.Scanner;

public class Soal3no1 {
    public static void main(String[] args) {
        double nilai,nilaikeseluruhan=0;
        Scanner ibra = new Scanner(System.in);
        System.out.println("Jumlah siswa X RPL 7 :");
        int jumlah = ibra.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Siswa X RPL 7, "+i+": ");
            nilai = ibra.nextDouble();
            nilaikeseluruhan = nilaikeseluruhan+nilai;
            }
        
            System.out.println("Total semua nilai = "+nilaikeseluruhan);
            double rata=nilaikeseluruhan/jumlah;
            System.out.println("rata rata nilai "+rata);
        }
}
