public class DizidekiElemanlarinFrekansi {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static void repeatArray(int[] arr){
        int repeat = 0;
        int[] duplicate = new int[arr.length];
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeat++;
                }
            }
            if (!isFind(duplicate, arr[i])){
                duplicate[startIndex++] = arr[i];
                System.out.println(arr[i] + " sayısı " + repeat + " kere tekrar edildi.");
            }
            repeat = 0;
        }
    }
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        repeatArray(list);

    }
}
