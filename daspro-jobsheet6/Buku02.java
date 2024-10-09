import java.util.Scanner;
/**
 * Buku02
 */
public class Buku02 {

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = input02.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input02.nextInt();

        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            diskon = 10;
            if (jenisBuku.equalsIgnoreCase("Kamus") && jumlahBuku > 2){
                diskon = diskon + 2;
            }
        } 
        else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = 7;
            if (jenisBuku.equalsIgnoreCase("Novel") && jumlahBuku > 3) {
                diskon = diskon + 2;
            } else {
                diskon = diskon + 1;
            }
        }
        else {
            if (jumlahBuku > 3) {
                diskon = 5;
            } else {
                diskon = 0;
            }
        }
        System.out.println("Total diskon yang anda dapatkan sebesar: " + (diskon) + "%");
    }
}
