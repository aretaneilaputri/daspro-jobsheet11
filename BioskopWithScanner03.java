import java.util.Scanner;

public class BioskopWithScanner03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        int menu;

        String[][] penonton = new String[4][2];

        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();

                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine(); // buang enter

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(penonton[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (menu != 3);
    }
}
