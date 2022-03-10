import java.util.Scanner;

public class NotOrtHesaplayanProgram {
    public static void main(String[] args) {
        // Degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sinifimizi tanimladik
        Scanner input = new Scanner(System.in);

        // Kullanicidan degerleri al
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz: " + sonuc);

        // Odev Kismi
        boolean gectikaldi = sonuc >= 60;
        String str = gectikaldi ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println("Durumu: " + str);

    }
}
