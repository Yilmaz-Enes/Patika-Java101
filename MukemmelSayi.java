import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, total = 0;

        System.out.print("Bir sayı giriniz : ");
        num = input.nextInt();

        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                total += i;
            }
        }

        if (total == num) {
            System.out.println(num + " Mükemmel sayıdır.");
        } else {
            System.out.println(num + " Mükemmel sayı değildir.");
        }
    }
}
