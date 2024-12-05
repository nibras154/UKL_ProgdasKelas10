import java.util.Random;
import java.util.Scanner;

public class Soal2no3 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Random random = new Random();
        boolean terus = true;

        while (terus) {
            double bilanganPertama = random.nextInt(10);
            double bilanganKedua = random.nextInt(10); 
            String operator;
            double jawabanBenar = 0;

            int jenisOperator = random.nextInt(3); 
            switch (jenisOperator) {
                case 0: 
                    operator = "*";
                    jawabanBenar = bilanganPertama * bilanganKedua;
                    break;
                case 1: 
                    operator = "/";
                    jawabanBenar = bilanganPertama / bilanganKedua;
                    break;
                case 2: 
                    operator = "%";
                    jawabanBenar = bilanganPertama % bilanganKedua;
                    break;
                default:
                    operator = "";
                    break;
            }

            System.out.print(bilanganPertama+ " "+operator+" "+bilanganKedua +" = ");
            double jawabanUser  = i.nextInt();

            if (jawabanUser  == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.print("Apakah anda ingin melanjutkan kuis ? (ya/tidak): ");
            String pilihan = i.next();
            if (pilihan.equalsIgnoreCase("tidak")) {
                 terus= false;
            }
        }

        i.close();
        System.out.println("Terima kasih mengikuti kuis!");
    }
}