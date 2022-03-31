import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Basamak sayısını giriniz : ");
        num = input.nextInt();
        int num2 = num*2;

        for (int i = 1; i <= num; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < num2; j++) {
                System.out.print("*");
            }
            num2--;
            System.out.println();

        }
    }
}
