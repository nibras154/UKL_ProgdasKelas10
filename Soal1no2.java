import java.util.Scanner;

public class Soal1no2{
    public static void main(String[] args) {
        Scanner ibra = new Scanner(System.in);

        System.out.println("Masukan bilangan anda: ");
        double bilangan = ibra.nextDouble();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " Adalah Bilangan Genap ");
        } else {
            System.out.println(bilangan + " Adalah Bilangan Ganjil ");
        }

        ibra.close();
    }
}
