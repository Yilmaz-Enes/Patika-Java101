import java.util.Scanner;

public class ArtikYilHesaplayanProgram {
    public static void main(String[] args) {
        int year;
        String artik = "Artık Yıl Değildir";

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if (year%100 == 0 && year%400 != 0) {
            artik = "Artık Yıl Değildir";
        }
        else {
            if (year%4 == 0) {
                artik = "Artık Yıldır";
            }
            else {
                artik = "Artık Yıl Değildir";
            }
        }
        System.out.println(year + " Yılı bir " + artik);
    }
}
