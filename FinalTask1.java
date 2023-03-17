    /*
    Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
    Пользователь вводит текущий курс и количество рублей.
    Итоговое значение должно быть округлено до двух знаков после запятой.
    Пример для теста работы программы:
        - Курс доллара: 67,55
        - Количество рублей: 1000
        - Итого: 14,80 долларов
    */
import java.util.Scanner;
public class FinalTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double usd = scan.nextDouble();

        System.out.print("Количество рублей: ");
        double rub = scan.nextDouble();

        double res = rub / usd;
        System.out.printf("Итого: %.2f долларов", res);
    }
}
