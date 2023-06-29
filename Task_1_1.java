// В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// 📌 "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// 📌 "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// 📌 "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// 📌 "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
// Работает???

import java.util.Calendar;
import java.util.Scanner;

public class Task_1_1{
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();  // текущая дата
        int hour = now.get(Calendar.HOUR_OF_DAY); // час
        // Scanner scanner = new Scanner(System.in,"Cp866");
        System.out.println("Input name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
    if (hour < 5)
        System.out.println("Good night, " + name +"!");
    else
     if (hour < 12)
        System.out.println("Good morning, " + name +"!");
    else
     if (hour < 18)
        System.out.println("Good day, " + name +"!");
    else
     if (hour < 23)
    System.out.println("Good evening, " + name +"!");
    else
    System.out.println("Good evening, " + name +"!");
    scanner.close();
    }
}
