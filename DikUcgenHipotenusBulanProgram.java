import java.util.Scanner;

public class DikUcgenHipotenusBulanProgram {
    public static void main(String[] args) {
        int a, b, hipo;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.print("a kenarini giriniz: ");
        a = input.nextInt();
        System.out.print("b kenarini giriniz: ");
        b = input.nextInt();

        hipo = (a*a) + (b*b);
        c = Math.sqrt(hipo);

        System.out.println("c kenari: " + c);

        // Odev kismi

        int k1, k2, k3, u;
        double alan;

        System.out.print("1.kenari giriniz: ");
        k1 = input.nextInt();
        System.out.print("2.kenari giriniz: ");
        k2 = input.nextInt();
        System.out.print("3.kenari giriniz: ");
        k3 = input.nextInt();

        u = (k1+k2+k3) / 2;
        alan = Math.sqrt(u * (u-k1) * (u-k2) * (u-k3));

        System.out.println("Ucgenin alani : " + alan);
    }
}
