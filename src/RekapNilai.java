import java.util.Scanner;

public class RekapNilai {
    static final int SELESAI = -1;

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

            if (nilai == SELESAI) {
                continue;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println(" ditolak karena nilai harus 0-100");
                continue;
            }

            char grade;

            if (nilai>=90){
                grade = 'A';
            } else if (nilai>=80) {
                grade = 'B';
            } else if (nilai>=70) {
                grade = 'C';
            } else if (nilai>=60) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            /*Penjelasan mengapa nilai >=60 tidak di taruh paling atas, dikarenakan saat memasukkan nilai 85,
            * nilai tersebut akan langsung di tangkap oleh kondisi tersebut,
            * dan akan langsung menghasilkan grade D. Hal tersebut dikarenakan if-else
            * akan berhenti di kondisi true pertama.*/

            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default -> "Tidak Lulus";
            };
            System.out.println("  Grade " + grade + " _ " + keterangan);
            count++;
            total += nilai;
        } while(nilai != SELESAI);

        System.out.println();

        System.out.println("Nilai Sah   : " + count);
        if(count > 0){
            double rata = total / count;
            System.out.println("Rata-Rata   : " + String.format("%.2f", rata));

            String status = rata >= 60 ? "LULUS" : "TIDAK LULUS";
            System.out.println("Status      : " + status);
        } else {
            System.out.println("Rata-Rata   : 0,00");
            System.out.println("Status      : TIDAK ADA DATA");
        }

        input.close();
    }
}