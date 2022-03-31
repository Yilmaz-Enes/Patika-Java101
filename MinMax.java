import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, max, count, num;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        count = input.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        num = input.nextInt();
        min = num;
        max = num;
        for (int i = 2; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            num = input.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);

    }
}
