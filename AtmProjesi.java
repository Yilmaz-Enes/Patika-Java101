import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("admin") && password.equals("123")){
                System.out.println("Bankamıza Hoşgeldiniz !");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1 :
                            System.out.print("Yatırılacak Para Miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println();
                            break;
                        case 2 :
                            System.out.print("Çeekmek İstediğiniz Tutar : ");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Yetersiz Bakiye");
                            } else {
                                balance -= price2;
                            }
                            System.out.println();
                            break;
                        case 3 :
                            System.out.println("Bakiyeniz : " + balance);
                            System.out.println();
                            break;
                        case 4 :
                            System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz, Tekrar Görüşmek Üzere.");
                            break;
                        default :
                            System.out.println("Hatalı tuşlama yaptınız !");
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre. Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız BLOKE Olmuştur Lütfen Banka İle İletişime Geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }
        }

    }
}
