import java.util.Scanner;

public class CombinasyonBulanProgram {
    public static void main(String[] args) {
        int n, r, nFac = 1, rFac = 1, nrFac = 1;
        double comb;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("n : ");
            n = input.nextInt();
            if (n < 1) {
                System.out.println("n değeri 1'den küçük olamaz");
            }
        }
        while (n < 0);

        do {
            System.out.print("r : ");
            r = input.nextInt();
            if (n < r) {
                System.out.println("r değeri n'den büyük olamaz");
            }
        } while (n < r);

        for (int i = 1; i <= n; i++) {
            nFac *= i;
        }
        for (int i = 1; i <= r; i++) {
            rFac *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            nrFac *= i;
        }

        comb = nFac / (rFac * nrFac);
        System.out.println("Kombinasyon sonucu : " + comb);



    }
}
