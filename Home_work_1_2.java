// Задание 2. Вывести все простые числа от 1 до 1000.
// Заготовка!

public class Home_work_1_2 {
    public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {
        int count = 0;
        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) count++;
        }
        if (count == 0) System.out.println(i);   
    }
    }
}
