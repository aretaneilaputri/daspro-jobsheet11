import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[10][6];

        System.out.println("=== INPUT NILAI SURVEI ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Nilai Pertanyaan " + (j + 1) + " : ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== RATA-RATA SETIAP RESPONDEN ===");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += array[i][j];
            }
            double rata = total / 6.0;
            System.out.println("Responden " + (i + 1) + " : " + rata);
        }

        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += array[i][j];
            }
            double rata = total / 10.0;
            System.out.println("Pertanyaan " + (j + 1) + " : " + rata);
        }

        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        int totalAll = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalAll += array[i][j];
            }
        }

        double rataAll = totalAll / (10.0 * 6);
        System.out.println("Rata-rata keseluruhan: " + rataAll);

        sc.close();
    }
}
