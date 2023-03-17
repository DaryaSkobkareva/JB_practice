    /*
    Напишите программу:
    1. Пользователь вводит размер массива и данные с клавиатуры в массив
    2. Сравнить элементы массива с заранее заданными константами x, y, z.
    3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
    */
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int X, Y, Z;
        X = 5;
        Y = 0;
        Z = 107;

        System.out.print("Введите размер массива: ");
        int len = scan.nextInt();

        int[] array = new int[len];

        for(int i = 0; i < array.length; i++) {
            System.out.print("Введите число: ");
            int num = scan.nextInt();
            array[i] = num;
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] == X || array[i] == Y || array[i] == Z) {
                System.out.println("Данное значение имеется в константах: " + array[i]);
            }
        }
    }
}
