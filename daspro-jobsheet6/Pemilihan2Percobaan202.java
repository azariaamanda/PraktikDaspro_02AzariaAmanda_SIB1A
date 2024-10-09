import java.util.Scanner;
/**
 * Pemilihan2Percobaan2
 */
public class Pemilihan2Percobaan202 {

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        String menu, member, qris;
        int pilihan_menu, jumlah_beli;
        double total_bayar, harga, diskon, potonganQris;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input02.nextInt();
        input02.nextLine();
        System.out.print("Apakah punya member (y/n)? = ");
        member = input02.nextLine();
        System.out.print("Apakah melakukan pembayaran melalui QRIS (y/n)? = ");
        qris = input02.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) { // Mengguanakan equalsIgnoreCase untuk membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2 ) {
                harga = 3000;
                System.out.println("Harga ice Tea = " + harga);

            } else if (pilihan_menu == 3 ) {
                harga = 15000;
                System.out.println("Harga bunding = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah

            } //Menghitung total bayar setelah diskon dan potongan QRIS
            if (qris.equalsIgnoreCase("y")) {
                potonganQris = 1000;
                System.out.println("besar potongan QRIS = 1000");
                total_bayar = harga - (harga * diskon) - potonganQris; 
                System.out.println("total bayar potongan QRIS dan diskon = " + total_bayar);
            } else {
                // Menghitung total bayar setelah diskon
                total_bayar = harga - (harga * diskon); // Menghitung total bayar setelah diskon
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            }

        }
        else if (member.equals("n")) { // Mengguanakan equalsIgnoreCase untuk membandingkan string
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2 ) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3 ) {
                harga = 15000;
                System.out.println("Harga bunding = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;

            }//Menghitung total bayar setelah diskon dan potongan QRIS
            if (qris.equals("y")) {
                potonganQris = 1000;
                System.out.println("besar potongan QRIS = 1000");
                total_bayar = harga - potonganQris; 
                System.out.println("total bayar potongan QRIS = " + total_bayar);
            } else {
                // Menghitung total bayar
                System.out.println("Total bayar = " + harga);
            }

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-------------------------------------");
    }
}
