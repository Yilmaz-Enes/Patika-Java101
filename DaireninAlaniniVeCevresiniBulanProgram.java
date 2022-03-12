import java.util.Scanner;

public class DaireninAlaniniVeCevresiniBulanProgram {
    public static void main(String[] args) {
        double r, alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yaricapini giriniz: ");
        r = input.nextDouble();

        alan = Math.PI * r * r;
        cevre = 2 * Math.PI * r;

        System.out.println("Dairenin alani: \t" + alan);
        System.out.println("Dairenin cevresi: \t" + cevre);

    }
}
