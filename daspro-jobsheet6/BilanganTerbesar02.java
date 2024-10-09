import java.util.Scanner;
/**
 * BilanganTerbesar02
 */
public class BilanganTerbesar02 {

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        int bil1 = 28, bil2 = 54, bil3 = 15, bilTerbesar;

        System.out.println("Bilangan 1 = " + bil1);
        System.out.println("Bilangan 2 = " + bil2);
        System.out.println("Bilangan 3 = " + bil3);

        if (bil1 > bil2) {
            bilTerbesar = bil1;
        } else {
            bilTerbesar = bil2;
        }
        if (bilTerbesar > bil3) {
            bilTerbesar = bilTerbesar;
        } else {
            bilTerbesar = bil3;
        }

        System.out.println("Bilangan Terbesar adalah bilangan : " + bilTerbesar);
    }
}
