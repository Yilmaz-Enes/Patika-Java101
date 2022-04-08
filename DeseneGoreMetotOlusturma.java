import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    static void desen(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        desen(n - 5);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int n = input.nextInt();
        desen(n);
    }
}
