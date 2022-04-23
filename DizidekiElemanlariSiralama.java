import java.util.Scanner;

public class DizidekiElemanlariSiralama {

    static void sirala(int[] arr){
        int list[] = new int[arr.length];
        int x;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] >= arr[j]) {
                    x = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = x;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        int list[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". Elemanı : ");
            list[i] = input.nextInt();
        }

        sirala(list);

    }

}
