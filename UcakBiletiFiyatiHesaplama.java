import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        double distance, total, discount, discTotal, lastTotal;
        int age, trip;

        Scanner input = new Scanner(System.in);

        System.out.print("Yolculuk mesafesi (km) giriniz : ");
        distance = input.nextDouble();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş) : ");
        trip = input.nextInt();

        if (distance > 0 && age > 0 && (trip == 1 || trip == 2)){
            total = distance * 0.1;
            if (age < 12) {
                discount = total * 0.5;
            }
            else if (12 <= age && age <= 24) {
                discount = total * 0.1;
            }
            else if (age >= 65) {
                discount = total * 0.3;
            }
            else {
                discount = 0;
            }
            discTotal = total - discount;
            if (trip == 2) {
                lastTotal = (discTotal - (discTotal * 0.2)) * 2;
            }
            else {
                lastTotal = discTotal;
            }
            System.out.println("Toplam Tutar : " + lastTotal + " TL");
        }
        else  {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
