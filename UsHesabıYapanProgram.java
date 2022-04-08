import java.util.Scanner;

public class UsHesabıYapanProgram {

    static int usAlma(int a, int b) {
        if (b <= 0) {
            return 1;
        }
        return a * usAlma(a, b-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı girin : ");
        int a = input.nextInt();
        System.out.print("Kuvvetini girin : ");
        int b = input.nextInt();

        System.out.println(usAlma(a, b));
    }
}
