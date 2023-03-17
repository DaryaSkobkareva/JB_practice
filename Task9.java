    /*
    Напишите программу:
    1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
    2. Посчитайте среднее арифметическое элементов массива.
    3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
    */
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int len = scan.nextInt();

        double[] array = new double[len];

        System.out.println("Заполните массив числами:");
        for(int i = 0; i < array.length; i++) {
            double num = scan.nextDouble();
            array[i] = num;
        }

        double sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double res = sum / 2;

        System.out.println("Результат вычислений:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] * res);
        }
    }
}
