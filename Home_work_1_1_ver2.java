// Задание 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
// Заготовка!!!
// Работает

public class Home_work_1_1_ver2 {
    public static void main(String[] args) {
    int n = 10;
    System.out.println("Sum = " + summa_n(n) + "," + "Comp = " + comp_n(n));
    }
    static int summa_n(int n) {
        int sum = 0;
        if (n % 2 == 0)  sum = (n + 1)*(n/2);
        else sum = (n + 1)*(n/2)+ n/2+1;
    return sum;
    }

    static int comp_n(int n) {
        int comp = 1;
        for (int i = 1; i <= n; i++) {
             comp = comp * i;
        }
    return comp;
    }
}
