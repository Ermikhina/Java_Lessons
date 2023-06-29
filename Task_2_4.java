// Задание №4
// Напишите метод, который составит строку, состоящую из 100 
// повторений слова TEST и метод, который запишет эту строку в 
// простой текстовый файл, обработайте исключения


public class Task_2_4 {
    
}


try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(text);
  
        }
        catch (IOException e)
        {
            System.out.println("Error" + e.getMessage());
        }