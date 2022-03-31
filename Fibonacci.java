import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci eleman sayısını giriniz : ");
        int num = input.nextInt();
        int f1 = 0, f2 = 1;
        for (int i = 1; i < num; i++) {
            System.out.println(f1 + " + " + f2 + " = " + (f1+f2));
            int temp = f2;
            f2 += f1;
            f1 = temp;
        }
    }
}
