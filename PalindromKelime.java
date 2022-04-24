import java.util.Scanner;

public class PalindromKelime {

    static void palindrom(String str) {
        String pl = " Palindromdur !";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                pl = " Palindrom Değildir !";
                break;
            }
        }
        System.out.print(str + pl);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kelime giriniz : ");
        String str = input.nextLine();

        palindrom(str);


    }
}
