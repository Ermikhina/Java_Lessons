// Формирование массива 3 х 5
// Работает

public class prog_test {

 public static void main(String[] args) {
 int[][] arr = new int[3][5];
 
 for (int i = 0; i < arr.length; i++) {
 for (int j = 0; j < arr[i].length; j++) {
 System.out.printf("%d ", arr[i][j]);
 }
 System.out.println();
 }
 }
}