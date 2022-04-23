import java.util.Arrays;
import java.util.Scanner;
public class KucukYakinBuyukYakinSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.print("Girilen Sayı : ");
        int val = input.nextInt();

        Arrays.sort(list);
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < val) {
                min = i;
            }
            if (i > val){
                max = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

    }
}
