/**
 * @author Artur Gilyazov
 * MathBox
 * Написать класс MathBox, реализующий следующий функционал:
 * Входной массив любого размера
 * методы Summator, Splitter, Eraser
 */


import java.util.*;

public class MathBox<T extends Number> extends ObjectBox<T> {
    public static void main(String [] args) {
        /** объявление размера массива */

        MathBox<Integer> q = new MathBox<>();

        int z;
        System.out.print("Введите размер массива ");
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
            for (z = 0; z < capacity; z++) {
                System.out.print("Введите значение для элемента " + z + " - ");
                Scanner scanner = new Scanner(System.in);
                int element = scanner.nextInt();
                q.addObject(element);
            }

        /** запуск методов */
        System.out.println("Сумма всех элементов массива = " + q.summator());
        q.splitter();
        System.out.print("Введите значение для удаления - ");
        Scanner scann = new Scanner(System.in);
        int x = scann.nextInt();
        q.deleteObject(x);
        System.out.println(q);

    }

    /** Summator складывает все элементы массива */
    public double summator() {
        int i;
        double sum = 0;
        for (i = 0; i < objects.size(); i++) {
            sum += objects.get(i).doubleValue();
        }
        return sum;

    }
    /** Splitter делит каждый элемент массива на аргумент 2, заменяя значения и выводя на экран */
    public int splitter() {
        int j;
        double r;
        Double[] split = new Double[objects.size()];
        for (j = 0; j < objects.size(); j++) {
            r =  objects.get(j).doubleValue();
            split[j] = Double.valueOf(r/2); }

        System.out.println("Поделим каждый элемент массива на 2 и получим " + Arrays.toString(split));
        return 0;
    }

}



