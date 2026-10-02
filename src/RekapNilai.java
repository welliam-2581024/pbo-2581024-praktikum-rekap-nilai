import java.util.Scanner;

public class RekapNilai {
    static final int selesai = -1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double total = 0.0;
        int nilai;

        System.out.println("===== Rekap Nilai =====");
        System.out.println("ketik -1 kalo sudah selesai");

        do {
            System.out.print("Nilai ke-" + (count + 1) + " : ");
            nilai = input.nextInt();

            if (nilai == selesai) {
                continue;
            }
        } while(nilai != selesai);
    }
}