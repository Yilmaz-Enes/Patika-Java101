import java.util.Scanner;

public class EbobEkokBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();

        int kucukDeger;

        if (n1 < n2){
            kucukDeger = n1;
        }
        else {
            kucukDeger = n2;
        }
        int i = kucukDeger;
        int ebob = 1;
        while (i >= 1){
            if (n1 % i == 0 && n2 % i ==0) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("EBOB : " + ebob);

        i = 1;
        int ekok = n1*n2;
        while (i <= (n1*n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("EKOK : " + ekok);
    }
}
