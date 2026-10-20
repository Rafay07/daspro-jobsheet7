import java.util.Scanner;

public class tiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000, jmlTiket;
        int totalTiket = 0, jmlPelanggan = 0;
        double diskon, bayar, totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (ketik '0' jika pembelian hari ini telah selesai): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Masukkan angka yang valid!");
                continue;
            }
            if (jmlTiket == 0) {
                System.out.println("Pembelian hari ini selesai");
                break;
            }

            if (jmlTiket > 10) {
                System.out.println("Selamat anda mendapatkan diskon 15%!");
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                System.out.println("Selamat anda mendapatkan diskon 10%!");
                diskon = 0.1;
            } else {
                System.out.println("Maaf, anda tidak mendapatkan diskon");
                diskon = 0;
            }

            bayar = jmlTiket * hargaTiket * (1 - diskon);
            System.out.println("Total bayar: Rp."+ bayar);

            totalTiket += jmlTiket;
            totalPenjualan += bayar;
            jmlPelanggan++;
        } while (jmlTiket != 0);

        System.out.println("Jumlah pelanggan: " + jmlPelanggan);
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp." + totalPenjualan);
    sc.close();
    }
    
}