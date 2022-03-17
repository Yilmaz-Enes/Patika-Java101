import java.util.Scanner;

public class CinZodyagiHesaplayanProgram {
    public static void main(String[] args) {
        int date, calc;
        String horoscope = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Tarihinizi Giriniz : ");
        date = input.nextInt();
        calc = date % 12;

        switch (calc){
            case 0 :
                horoscope = "Maymun";
                break;
            case 1 :
                horoscope = "Horoz";
                break;
            case 2 :
                horoscope = "Köpek";
                break;
            case 3 :
                horoscope = "Domuz";
                break;
            case 4 :
                horoscope = "Fare";
                break;
            case 5 :
                horoscope = "Öküz";
                break;
            case 6 :
                horoscope = "Kaplan";
                break;
            case 7 :
                horoscope = "Tavşan";
                break;
            case 8 :
                horoscope = "Ejderha";
                break;
            case 9 :
                horoscope = "Yılan";
                break;
            case 10 :
                horoscope = "At";
                break;
            case 11 :
                horoscope = "Koyun";
                break;
            default :
                System.out.println("Hatalı Değer Girdiniz !");
        }
        System.out.println("Çin Zodyağı Burcunuz : " + horoscope);
    }
}
