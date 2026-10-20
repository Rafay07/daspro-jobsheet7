import java.util.Scanner;

public class KafeDoWhileNoAbsen02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int kopi=0,teh=0,roti=0,totalHarga=0;
        String namaPelanggan;
        int hargaKopi=12000,hargaTeh=7000,hargaRoti=20000;
        do {
            System.out.println("Masukkan nama pelanggan(ketik 'batal' untuk keluar): ");
            namaPelanggan=sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
              System.out.println("Transaksi Dibatalkan."); 
            break;
            }   
            System.out.print("Jumlah Kopi : ");
            kopi=sc.nextInt();
            System.out.print("Jumlah Teh : ");
            teh=sc.nextInt();
            System.out.print("Jumlah Roti : ");
            roti=sc.nextInt();
            totalHarga=(kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Total Harga yang harus dibayarkan adalah "+ totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi telah selesai");
sc.close();
    
    }
     
}
