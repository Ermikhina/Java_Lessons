// Задание 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
// Заготовка!!!
// Работает

public class Home_work_1_1 {
    public static void main(String[] args) {
    int n = 11;
    int comp = 1;
    int sum = 0;
    // for (int i = 1; i <= n; i++) {
    //     sum = sum + i;
    //     comp = comp * i;
    //     }
    // System.out.println("Sum = " + sum + "," + "Comp = " + comp);

    if (n % 2 == 0)  sum = (n + 1)*(n/2);
    else sum = (n + 1)*(n/2)+ n/2+1;
    System.out.println("Sum = " + sum + "," + "Comp = " + comp);
    }
}