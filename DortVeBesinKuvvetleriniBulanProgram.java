import java.util.Scanner;

public class DortVeBesinKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4){
            System.out.println("4'ün " + count + ". kuvveti : " + i);
            count++;
        }

        count = 0;
        System.out.println();

        for (int i = 1; i <= n; i *= 5){
            System.out.println("5'in " + count + ". kuvveti : " + i);
            count++;
        }
    }
}
