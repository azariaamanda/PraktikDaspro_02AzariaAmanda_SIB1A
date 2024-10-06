import java.util.Scanner;
/**
 * PemilihanHariDenganIf02
 */
public class PemilihanHariDenganIf02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber;
        String dayType;

        System.out.print("Input day number 1 to 7: ");
        dayNumber = sc.nextInt();

        if (dayNumber >=1 && dayNumber <=5) {
            dayType = "Weekday";
        } else if (dayNumber >=6 && dayNumber <=7){
            dayType = "Weekend";
        } else {
            dayType = "Invalid Number";
        }
        System.out.println("Day number " + dayNumber + " is a " + dayType);
    }
}