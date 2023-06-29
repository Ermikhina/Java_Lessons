// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, которая 
// состоит из чередующихся символов c1 и c2, начиная с c1

import java.lang.module.ModuleDescriptor.Builder;

public class Task_2_1 {
    public static void main(String[] args) {
        int n = 8;
        char c1 = 'A';
        char c2 = 'B';
        String result = alternatingChars(n, c1, c2);
        System.out.println(result);

}  
public static String alternatingCharsStr(int n, char c1, char c2) {
    string str = ' ';
}
StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n / 2; i++) {
        sb.append(c1);
        sb.append(c2);
    }
    return sb.toString();
    }



}


// Тимур Фатхулин
// public class Task5 {
//     public static void main(String[] args) {
//         int n = 7;
//         char c1 = 'A';
//         char c2 = 'B';
//         String result = alternatingChars(n, c1, c2);
//         System.out.println(result);
//     }
//     public static String alternatingChars (int n,char c1,char c2 ){
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n/2; i++) {
//             sb.append(c1);
//             sb.append(c2);
//         }
//         return sb.toString();
//     }

// }