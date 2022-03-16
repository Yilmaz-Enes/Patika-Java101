import java.util.Scanner;

public class SinifiGecmeDurumuHesaplayanProgram {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, total = 0, avarage;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextDouble();
        if (0 <= mat && mat <= 100){
            total += mat;
            count++;
        }
        System.out.print("Turkce notunuz : ");
        turkce = input.nextDouble();
        if (0 <= turkce && turkce <= 100){
            total += turkce;
            count++;
        }
        System.out.print("Fizik notunuz : ");
        fizik = input.nextDouble();
        if (0 <= fizik && fizik <= 100){
            total += fizik;
            count++;
        }
        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if (0 <= kimya && kimya <= 100){
            total += kimya;
            count++;
        }
        System.out.print("Müzik notunuz : ");
        muzik = input.nextDouble();
        if (0 <= muzik && muzik <= 100){
            total += muzik;
            count++;
        }

        avarage = total / count;
        if (avarage <=55) {
            System.out.println("Sınıfta Kaldınız !");
        }else {
            System.out.println("Tebrikler Sınıfı Geçtiniz !");
        }
        System.out.println("Ortalamanız : " + avarage);


    }
}
