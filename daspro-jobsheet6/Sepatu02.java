import java.util.Scanner;
/**
 * Sepatu02
 */
public class Sepatu02 {

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        String merk, kategori;
        int ukuran, harga;

        System.out.print("Masukkan merk sepatu: " );
        merk = input02.nextLine();
        System.out.print("Masukkan kategori sepatu: ");
        kategori = input02.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input02.nextInt();

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")){
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 80000;
                    System.out.println("Harga sepatu anda: " + harga);
                } else {
                    System.out.println("Ukuran yang anda pilih tidak tersedia");
                }
            } 
            else if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1200000;
                    System.out.println("Harga sepatu anda: " + harga);
                } else {
                    System.out.println("Ukuran yang anda pilih tidak tersedia");
                }
            }
            else {
                System.out.println("Kategori yang anda pilih tidak tersedia");
            }
        }
        if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")){
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                    System.out.println("Harga sepatu anda: " + harga);
                } else {
                    System.out.println("Ukuran yang anda pilih tidak tersedia");
                }
            } 
            else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                    System.out.println("Harga sepatu anda: " + harga);
                } else {
                    System.out.println("Ukuran yang anda pilih tidak tersedia");
                }
            }
            else {
                System.out.println("Kategori yang anda pilih tidak tersedia");
            }
        }
        if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")){
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                    System.out.println("Harga sepatu anda: " + harga);
                } else {
                    System.out.println("Ukuran yang anda pilih tidak tersedia");
                }
            } 
            else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                    System.out.println("Harga sepatu anda: " + harga);
                } else {
                    System.out.println("Ukuran yang anda pilih tidak tersedia");
                }
            }
            else {
                System.out.println("Kategori yang anda pilih tidak tersedia");
            }
        } 
        else {
            System.out.println("Merk yang anda pilih tidak tersedia");
        }

    }
}
