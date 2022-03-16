import java.util.Scanner;
import java.util.SortedMap;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, select, uN = "admin", pW = "java123";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals(uN) && password.equals(pW)){
            System.out.println("Giriş Yaptınız !");
            select = "exit";
        }
        else if (!userName.equals(uN) && password.equals(pW)){
            System.out.println("Kullanıcı adınız yanlış");
            select = "exit";
        }
        else if (userName.equals(uN) && !password.equals(pW)){
            System.out.println("Şifreniz Yanlış !");
            System.out.print("Şifrenizi Sıfırlamak İster misiniz Y/N ? : ");
            select = input.nextLine();
        }
        else {
            System.out.println("Kullanıcı adı ve şifreniz yanlış");
            select = "exit";
        }

        switch (select){
            case "Y" :
                System.out.print("Yeni şifre giriniz : ");
                password = input.nextLine();
                if (password.equals(pW)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu");
                    System.out.println("Yeni şifreniz : " + password);
                }
                break;
            case "N" :
                System.out.println("Şifre sıfırlama işlemi seçilmedi");
                break;
            case "exit" :
                break;
            default:
                System.out.println("Yanlış seçim yaptınız !");
        }

    }
}
