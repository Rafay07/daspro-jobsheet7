import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.println("1. mobil");
            System.out.println("2. motor");
            System.out.println("0. exit");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid!");
            }
        } while (jenis != 0);

        System.out.println("Total biaya parkir: Rp " + total);
        sc.close();
    }
}