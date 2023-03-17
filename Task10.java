    /*
    Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
    а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
    Размерность матрицы задается пользователем.
    */
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Задайте размерность матрицы\nВведите количество строк: ");
        int a = scan.nextInt();

        System.out.print("Введите количество столбцов: ");
        int b = scan.nextInt();

        int[][] array = new int[a][b];
        System.out.println("Запоните матрицу числами:");

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        System.out.print("Значения первой строки, умноженные на 3: ");
        for(int i = 0; i < 1; i++) {
            for(int j = 0; j < array[0].length; j++) {
                int result = array[i][j] * 3;
                System.out.print(result + " ");
            }
        }
    }
}
