// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.
// Работает

public class Task_1_2_ver2 {
    public static void main(String[] args) {
    int [] num = new int[] {1,1,1,1,1,1,0,0,1,1,1,1,1};
    System.out.println(getMax(num));
 }
    
static int getMax(int[] num) {   
    int max_count = 0;
    int count = 0;
    for (int index = 0; index < num.length; index++) {
        if (num[index] == 1) {
            count++;
        }
            else if (count > max_count) {   
                max_count = count;
                count = 0;
        }
    }
    if (count > max_count) max_count = count;
    return max_count;
}
}


