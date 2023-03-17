    /*
    Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
    Среди данных строк найти строку с максимальным количеством различных символов.
    Если таких строк будет много, то вывести первую.
    Пример для теста работы программы:
        Количество строк: 3
        Строка 1: привет
        Строка 2: анализ
        Строка 3: 111111111111
        Ответ: привет
    */
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Укажите количество строк: ");
        int a = scan.nextInt();

        String[] array = new String[a];
        int[] sum = new int[a];
        int max = 0;
        String answer = "";

        System.out.println("Напишите что-нибудь в каждой из строк");
        for(int i = 0; i < a; i++) {
            System.out.printf("Строка %d: ", i + 1);
            array[i] = scan.next();
        }

        for (int i = 0; i < a; i++) {
            sum[i] = countUniqueCharacters(array[i]);
        }

        for (int i = 0; i < a; i++) {
            if (sum[i] >= max) {
                max = sum[i];
                answer = array[i];
            }
        }
        System.out.println("Строка с максимальным количеством уникальных символов: " + answer);
    }

    public static int countUniqueCharacters(String str) {
        boolean[] isThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < str.length(); i++) {
            isThere[str.charAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < isThere.length; i++) {
            if (isThere[i] == true){
                count++;
            }
        }
        return count;
    }
}