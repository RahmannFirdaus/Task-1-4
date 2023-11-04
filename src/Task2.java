import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;

        while (true) {
            System.out.print("Masukkan sebuah angka (0 untuk berhenti) : ");
            i = scanner.nextInt();

            if (i == 0) {
                System.out.println("Perulangan telah dihentikan.");
                break;
            } else if (i % 2 == 0) {
                System.out.println("Angka yang dimasukkan adalah genap.");
            } else {
                System.out.println("Angka yang dimasukkan adalah ganjil.");
            }
        }

        scanner.close();
    }
}