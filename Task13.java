    /*
    Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
    Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
    1. Выведите слова, состоящие только из латиницы.
    2. Выведите количество этих слов.
    */
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку из слов, разделённых пробелами. Можно ввести кириллицу, латиницу, цифры");

        String value = scan.nextLine();
        String[] result = value.split(" ");

        int sum = 0;

        System.out.println("Слова, состоящие только из латиницы:");
        for(int i = 0; i < result.length; i++) {
            boolean onlyLatin = result[i].matches("[a-zA-Z]+");
            if (onlyLatin) {
                System.out.println(result[i]);
                ++sum;
            }
        }
        System.out.println("Итого: " + sum);
    }
}
