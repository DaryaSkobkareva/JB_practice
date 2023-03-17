    /*
    Написать программу, которая будет выполнять следующие действия:
    1. Ввести три числа с клавиатуры x, y, z
    2. Найти и вывести в консоль среднее арифметическое этих чисел
    3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
    4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
    */
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число x: ");
        float x = scan.nextFloat();

        System.out.print("Введите число y: ");
        float y = scan.nextFloat();

        System.out.print("Введите число z: ");
        float z = scan.nextFloat();

        float arithmeticMean = (x + y + z) / 2;
        System.out.println("Среднее арифметическое: " + arithmeticMean);

        double result = Math.floor(arithmeticMean / 2);
        if(result > 3.0)
            System.out.println("Программа выполнена корректно");
    }
}
