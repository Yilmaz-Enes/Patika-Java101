import java.util.Scanner;

public class BasamakSayilariniToplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        int tempNumber = number;
        int total = 0;

        while (tempNumber != 0) {
            total += tempNumber %10;
            tempNumber /= 10;
        }
        System.out.println("Sonuç : " + total);


    }
}
