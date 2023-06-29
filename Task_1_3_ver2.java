// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// 📌 Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
// Не работает!


public class Task_1_3_ver2 {
    public static void main(String[] args) {
        int [] mass = new int[] {3,2,2,3};
        int search_num = 3;
        int last_item = mass.length - 1;
        for (int i = 0; i < last_item; i++) {
            if (mass[i] == search_num) {
                if (mass[last_item] == search_num) {
                    last_item --;
                    i--;
                }
                else {
                    mass[last_item] = search_num;
                    last_item --;
                }
                 
            }
        }
        for (int item : mass) {
        System.out.print(item + " ");
        }
    }
}
