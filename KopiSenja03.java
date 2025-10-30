import java.util.Scanner;

public class KopiSenja03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Cabang Cafe : ");
        int cabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Percabang ===");
        int totalPelangganSemua = 0;
        int totalItemSemua = 0;

        for (int i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + "---");
            System.out.print("Jumlah pelanggan : ");
            int pelanggan = sc.nextInt();

            int totalItemCabang = 0;

            //input total item dari setiap pelanggan 
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            //tampilkan ringkasan percabang
            System.out.println(" Cabang " + i + ":");
            System.out.println(" - Pelanggan " + pelanggan + " oran9g ");
            System.out.println(" - Item terjual: " + totalItemCabang);

            totalPelangganSemua += pelanggan;
            totalItemSemua += totalItemCabang;

        }

        // akumulasi total keseluruhan
        System.out.println(" \nTotal seluruh cabang");
        System.out.println(" Pelanggan " + totalPelangganSemua + " orang ");
        System.out.println(" Item terjual: " + totalItemSemua + "item");
    }
    
}
