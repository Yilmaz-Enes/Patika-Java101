import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double tutar, kdvOrani = 0.18, kdvTutari, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutari Giriniz: ");
        tutar = input.nextDouble();

        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV'siz Tutar = " + tutar);
        System.out.println("KDV Orani = " + (int)(kdvOrani*100) + "%");
        System.out.println("KDV tutari = " + kdvTutari);
        System.out.println("KDV'li Tutar = " + kdvliTutar);
    }
}
