    /*
    Выполните следующие действия с массивом:
    1. Задайте массив из 5 любых целых чисел
    2. Поменяйте местами первый и последний элемент в массиве
    3. Вывести в консоль результат суммы первого и среднего элемента
    Примечание: Для получения последнего и среднего элементов в массиве используйте свойство length.
    */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[] {3, 18, 76, 192, 1004};

        int x = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = x;

        int result = array[0] + array[array.length / 2];
        System.out.print(result);
    }
}
