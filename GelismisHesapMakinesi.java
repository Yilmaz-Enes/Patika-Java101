import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int plus(int a, int b) {
        System.out.println("Toplam = " + (a + b));
        return 1;
    }
    static int minus(int a, int b) {
        System.out.println("Fark = " + (a - b));
        return 1;
    }
    static int times(int a, int b) {
        System.out.println("Çarpım = " + (a * b));
        return 1;
    }
    static int divided(double a, double b) {
        if (b == 0.0) {
            System.out.println("ikinci sayı '0' olamaz !!!");
        }
        else {
            System.out.println("Bölüm = " + (a / b));
        }
        return 1;
    }
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <=b; i++) {
            result *= a;
        }
        System.out.println(a + " üzeri " + b + " = " + result );
        return 1;
    }
    static int mod(int a, int b) {
        System.out.println(a + " mod " + b + " = " + (a % b));
        return 1;
    }
    static int calc(int a, int b) {
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + (a * b));
        return 1;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi Seçiniz : ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("İlk sayı : ");
            int a = input.nextInt();
            System.out.print("İkinci sayı : ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    plus(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Hatalı işlem seçtiniz !");
            }

        }
        System.out.println("Güle Güle !");
    }
}
