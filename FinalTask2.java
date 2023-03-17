    /*
    Напишите программу, которая позволит решить простое уравнение относительно x.
    Программа принимает на вход строку длиной 5 символов.
    Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
    Первым, третьим и пятым символом являются две цифры (от 0 до 9) и
    буква ‘x’ (обозначает неизвестное) в любом порядке.
    Нужно найти неизвестное.
    Пример для теста работы программы:
        - Ввод: x+5=7
        - Вывод: 2
        - Ввод: 3-x=9
        - Вывод: -6
        - Ввод: 3-3=x
        - Вывод: 0
    */
import java.util.Scanner;
public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Напишите линейное уравнение. Например: x+5=7");
        System.out.println("Внимание: допускаются только цифры от 0 до 9, операции сложения и вычитания.");

        String equation = scan.nextLine();
        char[] symbol = equation.toCharArray();
        int result = 0;

        if (symbol[0] == 'x' && symbol[3] == '=') {
            switch (symbol[1]) {
                case '+':
                    result = Character.getNumericValue(symbol[4]) - Character.getNumericValue(symbol[2]);
                    System.out.println("Ответ: x = " + result);
                    break;
                case '-':
                    result = Character.getNumericValue(symbol[4]) + Character.getNumericValue(symbol[2]);
                    System.out.println("Ответ: x = " + result);
                    break;
                default:
                    errorMessage();
                    break;
            }
        }
        else if (symbol[2] == 'x' && symbol[3] == '=') {
            switch (symbol[1]) {
                case '+':
                    result = Character.getNumericValue(symbol[4]) - Character.getNumericValue(symbol[0]);
                    System.out.println("Ответ: x = " + result);
                    break;
                case '-':
                    result = Character.getNumericValue(symbol[0]) - Character.getNumericValue(symbol[4]);
                    System.out.println("Ответ: x = " + result);
                    break;
                default:
                    errorMessage();
                    break;
            }
        }
        else if (symbol[4] == 'x' && symbol[3] == '=') {
            switch (symbol[1]) {
                case '+':
                    result = Character.getNumericValue(symbol[0]) + Character.getNumericValue(symbol[2]);
                    System.out.println("Ответ: x = " + result);
                    break;
                case '-':
                    result = Character.getNumericValue(symbol[0]) - Character.getNumericValue(symbol[2]);
                    System.out.println("Ответ: x = " + result);
                    break;
                default:
                    errorMessage();
                    break;
            }
        }
        else {
            errorMessage();
        }
    }
    public static void errorMessage() {
        System.out.println("Что-то пошло не так. Проверьте, исполнены ли условия, и попробуйте ещё раз.");
    }
}