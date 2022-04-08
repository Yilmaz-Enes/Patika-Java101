import java.util.Scanner;

public class AsalSayiBulanProgram {

    static boolean asalSayi(int n, int i) {
        if (n == 2) {
            return true;
        }
        else if (n % i == 0 || n < 2) {
            return false;
        }
        else if (n % i != 0) {
            return true;
        }
        return asalSayi(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = input.nextInt();
        System.out.println(asalSayi(num, 2));

    }
}
