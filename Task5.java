    /*
    Напишите простой калькулятор:
    1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
    2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
    */
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        float num1 = scan.nextFloat();

        System.out.print("Введите второе число: ");
        float num2 = scan.nextFloat();

        System.out.print("Введите '+', '-', '*' или '/': ");
        String symbol = scan.next();

        float result;

        switch(symbol) {
            case "+":
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("На 0 делить нельзя");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
        }
    }
}
