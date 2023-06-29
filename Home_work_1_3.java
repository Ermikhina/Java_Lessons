// Задание 3. Реализовать простой калькулятор
// Заготовка!
// Работает!

import java.util.Scanner;

public class Home_work_1_3 {
    public static void main(String[] args) {
        System.out.println("Input 1st operand: ");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextInt();
        System.out.println("Input 2nd operand: ");
        double num2 = scanner.nextInt();
        System.out.println("Choose operation: 1 - '+', 2 - '-', 3 - '*', 4 - '/' :");
        int oper = scanner.nextInt();
        if (oper == 1) System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            else if (oper == 2) System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            else if (oper == 3) System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            else if (oper == 4) System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        else System.out.println("Incorrect operation");
    }
}

