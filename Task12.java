    /*
    Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
    1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
    2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
    3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
    4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
    5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
    */
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку \"I like Java!!!\"");
        String str = scan.nextLine();

        boolean result1, result2, result3;
        result1 = str.contains("Java");
        result2 = str.startsWith("I like");
        result3 = str.endsWith("!!!");

        if(result1 && result2 && result3) {
            System.out.println(str.toUpperCase());
        }

        String strNew;
        strNew = str.replace('a', 'o');
        System.out.println(strNew.substring(7, 11));
    }
}
