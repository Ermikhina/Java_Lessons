// Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает 
// boolean значение).


public class Task_2_3 {
    
}


public class task23 {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(IsitPalindrom(str));
    }

    public static boolean IsitPalindrom(String input) {
        input = input.toUpperCase();
        int len =input.length(); 
        for (int i = 0; i < len/2; i++) {
            if (input.charAt(i)!=input.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}


public class task23 {
    public static void main(String[] args) {
        String str = "abcscb";
        System.out.println(isitPalindrom(str));
    }

    public static boolean isitPalindrom(String input) {
        input = input.toUpperCase();
        int len =input.length(); 
        for (int i = 0; i < len/2; i++) {
            if (input.charAt(i)!=input.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}