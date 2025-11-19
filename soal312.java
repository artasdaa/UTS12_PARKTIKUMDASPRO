import java.util.Scanner;
public class soal312 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Array 2D kursi 5x6 (semua 'O' = kosong)
        char[][] kursi = new char[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                kursi[i][j] = 'O';
            }
        }

        int pilihan;
        int baris, kolom;

        //Menu berulang (do-while)
        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Tampilkan denah kursi");
            System.out.println("2. Pesan kursi");
            System.out.println("3. Batalkan pemesanan kursi");
            System.out.println("4. Hitung jumlah kursi kosong dan terisi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            System.out.println("--------------------");

            switch (pilihan) {

                //Tampilan denah
                case 1:
                    System.out.println("Denah Kursi (O = kosong, X = terisi)");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(kursi[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                //Pesan kursi
                case 2:
                    System.out.print("Masukkan Baris (1-5): ");
                    baris = input.nextInt();
                    System.out.print("Masukkan Kolom (1-6): ");
                    kolom = input.nextInt();

                    if (baris < 1 || baris > 5 || kolom < 1 || kolom > 6) {
                        System.out.println("Input salah! Baris 1-5, Kolom 1-6.");
                    } else {
                        if (kursi[baris - 1][kolom - 1] == 'O') {
                            kursi[baris - 1][kolom - 1] = 'X';
                            System.out.println("Kursi berhasil dipesan!");
                        } else {
                            System.out.println("Kursi sudah terisi!");
                        }
                    }
                    break;

                //Batalkan pemesanan
                case 3:
                    System.out.print("Masukkan Baris (1-5): ");
                    baris = input.nextInt();
                    System.out.print("Masukkan Kolom (1-6): ");
                    kolom = input.nextInt();

                    if (baris < 1 || baris > 5 || kolom < 1 || kolom > 6) {
                        System.out.println("Input salah! Baris 1-5, Kolom 1-6.");
                    } else {
                        if (kursi[baris - 1][kolom - 1] == 'X') {
                            kursi[baris - 1][kolom - 1] = 'O';
                            System.out.println("Pemesanan dibatalkan.");
                        } else {
                            System.out.println("Kursi memang kosong, tidak bisa dibatalkan.");
                        }
                    }
                    break;

                //Hitung jumlah kursi kosong & terisi
                case 4:
                    int kosong = 0, terisi = 0;

                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (kursi[i][j] == 'O') kosong++;
                            else terisi++;
                        }
                    }

                    System.out.println("Kursi kosong : " + kosong);
                    System.out.println("Kursi terisi : " + terisi);
                    break;

                // 5. Keluar
                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}
