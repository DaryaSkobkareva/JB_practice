    /*
    Напишите программу конвертер физических величин:
    1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
        > Выберите что переводить: 1 - масса, 2 - расстояние
        > 2
    2. Пользователю предлагается выбрать единицу измерения. Пример:
        > Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
        > 1
    3. Пользователю предлагается ввести количество выбранных единиц:
        > Введите число
        > 10
        > Результат:
        > Метры: 10
        > Мили: 0.006
        > Ярды: 10.94
        > Футы: 32.81
     */
    import java.util.Scanner;

    public class Task6 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Выберите, что переводить:\n1 - масса\n2 - расстояние");
            int physicalQuantity = scan.nextInt();

            double g, kg, lb, ou, m, ml, yd, ft;

            switch(physicalQuantity) {
                case 1:
                    System.out.println("Выберите единицу измерения:\n1 - грамм\n2 - килограмм\n3 - фунт\n4 - унция");
                    int mass = scan.nextInt();

                    System.out.print("Введите число: ");
                    double num1 = scan.nextDouble();

                    switch(mass) {
                        case 1:
                            g = num1;
                            kg = num1 * 0.001;
                            lb = num1 * 0.002205;
                            ou = num1 * 0.03527;
                            System.out.printf("Результат:\nГраммы: %f\nКилограммы: %f\nФунты: %f\nУнции: %f", g, kg, lb, ou);
                            break;
                        case 2:
                            g = num1 * 1000;
                            kg = num1;
                            lb = num1 * 2.205;
                            ou = num1 * 35.27;
                            System.out.printf("Результат:\nГраммы: %f\nКилограммы: %f\nФунты: %f\nУнции: %f", g, kg, lb, ou);
                            break;
                        case 3:
                            g = num1 * 453.5924;
                            kg = num1 * 0.4535924;
                            lb = num1;
                            ou = num1 * 16;
                            System.out.printf("Результат:\nГраммы: %f\nКилограммы: %f\nФунты: %f\nУнции: %f", g, kg, lb, ou);
                            break;
                        case 4:
                            g = num1 * 28.3495;
                            kg = num1 * 0.0283495;
                            lb = num1 * 0.0625;
                            ou = num1;
                            System.out.printf("Результат:\nГраммы: %f\nКилограммы: %f\nФунты: %f\nУнции: %f", g, kg, lb, ou);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Выберите единицу измерения:\n1 - метр\n2 - миля\n3 - ярд\n4 - фут");
                    int distance = scan.nextInt();

                    System.out.print("Введите число: ");
                    double num2 = scan.nextDouble();

                    switch(distance) {
                        case 1:
                            m = num2;
                            ml = num2 * 0.0006214;
                            yd = num2 * 1.0936;
                            ft = num2 * 3.2808;
                            System.out.printf("Результат:\nМетры: %f\nМили: %f\nЯрды: %f\nФуты: %f", m, ml, yd, ft);
                            break;
                        case 2:
                            m = num2 * 1609.344;
                            ml = num2;
                            yd = num2 * 1760;
                            ft = num2 * 5280;
                            System.out.printf("Результат:\nМетры: %f\nМили: %f\nЯрды: %f\nФуты: %f", m, ml, yd, ft);
                            break;
                        case 3:
                            m = num2 * 0.9144;
                            ml = num2 * 0.0005682;
                            yd = num2;
                            ft = num2 * 3;
                            System.out.printf("Результат:\nМетры: %f\nМили: %f\nЯрды: %f\nФуты: %f", m, ml, yd, ft);
                            break;
                        case 4:
                            m = num2 * 0.3048;
                            ml = num2 * 0.0001894;
                            yd = num2 * 0.3333;
                            ft = num2;
                            System.out.printf("Результат:\nМетры: %f\nМили: %f\nЯрды: %f\nФуты: %f", m, ml, yd, ft);
                            break;
                    }
                    break;
            }
        }
    }
