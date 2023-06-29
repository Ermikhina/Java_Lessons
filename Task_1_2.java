// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.
// Работает

public class Task_1_2 {
    public static void main(String[] args) {
    int [] num = new int[] {1,1,1,1,1,1,0,0,1,1,1,1,1};
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
    System.out.println(max_count);
 }
}




// public class Task_02 {
//     public static void main(String[] args) {
//         int[] array = new int[] { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 };
//         System.out.println(getMax(array));
//         System.out.println(getMax2(array));
//     }

//     static int getMax(int[] array) {
//         int cont = 0;
//         int maxCount = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == 1) {
//                 cont++;
//             } else {
//                 if (maxCount < cont)
//                     maxCount = cont;
//                 cont = 0;
//             }
//         }
//         if (maxCount < cont)
//             maxCount = cont;
//         return maxCount;
//     }

//     static int getMax2(int[] array) {
//         int cont = 0;
//         int maxCount = 0;
//         for (int i : array) {
//             if (i == 1) {
//                 cont++;
//             } else {
//                 if (maxCount < cont)
//                     maxCount = cont;
//                 cont = 0;
//             }
//         }
//         if (maxCount < cont)
//             maxCount = cont;
//         return maxCount;
//     }

// }

// 11:37
