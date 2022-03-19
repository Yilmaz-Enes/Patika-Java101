import java.util.Scanner;

public class UcVeDordeBolunenSayilarinOrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, sayac = 0, toplam = 0;
        double ort;

        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();

        System.out.println("3'e ve 4'e bölünen sayılar : ");
        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayac++;
                toplam += i;
                System.out.println(i);
            }
        }
        ort = toplam / sayac;
        System.out.print("Ortalamaları : " + ort);
    }
}
