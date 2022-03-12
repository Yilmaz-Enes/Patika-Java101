import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        double kilo, boy, vki;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz: " + vki);
    }
}
