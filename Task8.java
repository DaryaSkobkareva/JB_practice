    /*
    Напишите программу, где пользователь вводит любое целое положительное число n.
    А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
    */
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int n = scan.nextInt();

        int sum = 0;
        for(int i = 1; i < n; i +=2) {
            sum += i;
        }
        System.out.printf("Сумма нечётных чисел до %d: ", n);
        System.out.print(sum);
    }
}
