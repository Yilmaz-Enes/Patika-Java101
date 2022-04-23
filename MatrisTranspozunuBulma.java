import java.util.Arrays;

public class MatrisTranspozunuBulma {

    static void printMatris(int[][] arr){
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matris = {{1, 2, 3},{4, 5, 6}};
        int[][] transpoze = new int[matris[0].length][matris.length];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }
        System.out.println("Matris : ");
        printMatris(matris);
        System.out.println("Transpoze : ");
        printMatris(transpoze);


    }
}
