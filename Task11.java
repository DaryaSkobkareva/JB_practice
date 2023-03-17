    /*
    Напишите программу:
    1. Ввести первое число с клавиатуры и записать его в строковую переменную.
    2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
    3. Сравнить 2 числа и вывести большее на экран
    4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
    */
import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String num1 = scan.next();

        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        Integer a = Integer.valueOf(num1);

        int resMax = Math.max(a, num2);
        System.out.println("Большее число: " + resMax);

        Integer resMin = Math.min(a, num2);
        double min = resMin.doubleValue();
        System.out.println("Меньшее число: " + min);
    }
}
