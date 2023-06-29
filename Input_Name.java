// Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”
// Работает, на латыни

import java.util.Scanner;

public class Input_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scanner scanner = new Scanner(System.in,"Cp866");
    System.out.println("Input name: ");
    String name = scanner.nextLine();
    
    // int num = scanner.nextInt(); Ввод с клавиатуры целого числа
    
    System.out.println("Hello, " + name +"!");
    scanner.close();
    }
}
