    /*
    Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
    Далее:
    1. Выведите максимальный и минимальный элемент массива.
    2. Из максимального и минимального значения выведите наибольшее по модулю.
    */
import java.util.Random;
public class Task14 {
    public static void main(String[] args) {

        int[] array = new int[15];
        for(int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber(-20, 20);
            //System.out.println(array[i]);
        }

        int max = array[0];
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            max = Math.max(array[i], max);
            min = Math.min(array[i], min);
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] == max) {
                System.out.println("Номер элемента с максимальным значением: " + i);
            }
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] == min) {
                System.out.println("Номер элемента с минимальным значением: " + i);
            }
        }

        System.out.print("Наибольше по модулю значение: ");
        int a = Math.abs(max);
        int b = Math.abs(min);
        if(a > b) {
            System.out.println(a);
        }
        else if(b > a) {
            System.out.println(b);
        }
    }
    public static int getRandomNumber(int min, int max){
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }
}
