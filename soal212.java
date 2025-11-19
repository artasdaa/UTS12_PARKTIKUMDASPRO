import java.util.Scanner;
public class soal212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input jumlah kota dan hari
        System.out.print("Masukkan jumlah kota (k): ");
        int k = sc.nextInt();

        System.out.print("Masukkan jumlah hari (h): ");
        int h = sc.nextInt();

        //Deklarasi array suhu
        double[][] suhu = new double[k][h];

        //Input data suhu
        System.out.println("\n=== INPUT DATA SUHU ===");
        for (int i = 0; i < k; i++) {
            System.out.println("Kota " + (i + 1) + ":");
            for (int j = 0; j < h; j++) {
                System.out.print("  Hari " + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
        }

        //Variabel untuk mencari kota dengan rata-rata tertinggi & terendah
        double maxRata = -9999;
        double minRata = 9999;
        int kotaMax = -1;
        int kotaMin = -1;

        System.out.println("\n=== HASIL PER KOTA ===");

        //Hitung max, min, dan rata-rata tiap kota
        for (int i = 0; i < k; i++) {
            double max = suhu[i][0];
            double min = suhu[i][0];
            double total = 0;

            for (int j = 0; j < h; j++) {
                double s = suhu[i][j];
                total += s;

                if (s > max) max = s;
                if (s < min) min = s;
            }

            double rata = total / h;

            System.out.println("\nKota " + (i + 1));
            System.out.println("  Suhu maksimum : " + max);
            System.out.println("  Suhu minimum  : " + min);
            System.out.println("  Rata-rata     : " + rata);

            //Menentukan rata-rata tertinggi & terendah
            if (rata > maxRata) {
                maxRata = rata;
                kotaMax = i + 1;
            }

            if (rata < minRata) {
                minRata = rata;
                kotaMin = i + 1;
            }
        }

        //Tampilkan kota dengan rata-rata ekstrem
        System.out.println("\n=== ANALISIS RATA-RATA ===");
        System.out.println("Kota dengan rata-rata tertinggi : Kota " + kotaMax + " (" + maxRata + ")");
        System.out.println("Kota dengan rata-rata terendah  : Kota " + kotaMin + " (" + minRata + ")");
    }
}