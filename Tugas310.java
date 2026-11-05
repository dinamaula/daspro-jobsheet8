import java.util.Scanner;

public class Tugas310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
        } while (jumlahToko < 1);
        int totalPelanggan = 0;
        int totalBarang = 0;
        int barangTerbanyak = 0;
        int tokoTerbanyak = 0;

        for (int i =1; i <= jumlahToko; i++) {
            int jumlahPelangganToko;
            do {
                System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
                jumlahPelangganToko = sc.nextInt();
            } while (jumlahPelangganToko < 0);
            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelangganToko; j++) {
                int barang;
                do {
                    System.out.print("Barang yang dibeli pelanggan " + j + ": ");
                    barang = sc.nextInt();
                } while (barang < 0);
                totalBarangToko += barang;
            }
            totalPelanggan += jumlahPelangganToko;
            totalBarang += totalBarangToko;
            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelangganToko + ", total barang: " + totalBarangToko);
            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("Total pelanggan seluruh toko: " + totalPelanggan);
        System.out.println("Total barang seluruh toko: " + totalBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}