    /*
    Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
    Ответ: “Заархивированный вирус”.
        1. У пользователя есть 3 попытки, чтобы отгадать загадку.
        2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
        3. Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и
            еще раз запросить ответ у пользователя.
        4. Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
        5. Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
            Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести
            “Подсказка уже недоступна”.
        6. Если пользователь, использовавший подсказку, ошибется,
            вывести “Обидно, приходи в другой раз” и завершить работу.
    */
import java.util.Scanner;
public class FinalTask4 {
    public static void main(String[] args){

        String answer;
        boolean result;

        System.out.println("Отгадай загадку:\nСидит дед, во сто шуб одет, кто его раздевает, тот слёзы проливает");
        System.out.println("Введи ответ (ты можешь взять подсказку):");
        Scanner scan = new Scanner(System.in);

        result = false;
        for(int i = 1; i <= 3; i++) {
            if(result == true) {
                break;
            }
            answer = scan.nextLine();
            String answerLow = answer.toLowerCase();
            switch(answerLow) {
                case("заархивированный вирус"):
                    ok();
                    result = true;
                    break;
                case("подсказка"):
                    if(i==1) {
                        System.out.println("Это связано с вирусами и архивами");
                        String answer2 = scan.nextLine();
                        String answer2Low = answer2.toLowerCase();
                        switch (answer2Low) {
                            case ("заархивированный вирус"):
                                ok();
                                result = true;
                                break;
                            case ("подсказка"):
                                noHint();
                                break;
                            default:
                                errorMessage();
                                result = true;
                                break;
                        }
                    }
                    else {
                        noHint();
                        break;
                    }
                default:
                    if (i < 3 && result == false) {
                        System.out.println("Подумай ещё!");
                    } else if (i == 3 && result == false) {
                        errorMessage();
                    }
            }
        }
    }
    public static void ok() {
        System.out.println("Правильно!");
    }
    public static void noHint() {
        System.out.println("Подсказка уже недоступна");
    }
    public static void errorMessage() {
        System.out.println("Обидно, приходи в другой раз!");
    }
}
