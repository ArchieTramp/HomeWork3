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
//        try {
        MathBox<Integer> q = new MathBox<>();
        q.addObject(3);
        q.addObject(2);
        System.out.println(q.summator());
//        int z;
//        System.out.print("Введите размер массива ");
//        Scanner scan = new Scanner(System.in);
//        int capacity = scan.nextInt();
//        Integer[] numarray = new Integer[capacity];
//        Scanner scanarr = new Scanner(System.in);
//            /** ввод элементов массива*/
//            for (z = 0; z < capacity; z++) {
//            System.out.print("Введите значение для элемента " + z + " - ");
//            numarray[z] = scanarr.nextInt();
//            }
//            /** сортировка исключительно для красоты отображения, которая все равно не будет влиять на Set */
//        Arrays.sort(numarray);
//        /** массив в сет только ради удаления повторов, ибо быстро */
//        Set<Integer> numset = new HashSet<>(Arrays.asList(numarray));
//        /** сет в лист, а потом в массив для удобства работы, вероятно можно было обойтись, но пока не уверен */
//        List<Integer> numlist = new ArrayList<>(numset);
//        ArrayList<Integer> numbers = new ArrayList<>(numlist);
//
//        System.out.println("Отсортировано " + Arrays.toString(numarray));
//        System.out.println("Удаляем повторы " + numset);
//        /** запуск методов */
//        new MathBox(numbers).summator();
//        new MathBox(numbers).splitter();
//        new MathBox(numbers).eraser();
//        /** не уверен нужно ли оно тут, но запуск родительских методов в наследнике */
////        new MathBox(numbers).addObject();
////        new MathBox(numbers).deleteObject();} catch (Exception e) {
//            System.out.println(e + " вводить необходимо целочисленные значения");
//        }


    }
//    private final Integer[] numbers;

//    public MathBox(ArrayList<Integer> numbers) {
////        super(objects);
//        this.numbers = numbers.toArray(new Integer[0]);
//    }
//
    /** Summator складывает все элементы массива */
    public double summator() {
        int i;
        double sum = 0;
        for (i = 0; i < objects.size(); i++) {
            sum += objects.get(i).doubleValue();
        }
//        System.out.println("Сумма всех элементов массива = " + sum);
        return sum;

    }
//    /** Splitter делит каждый элемент массива на аргумент 2, заменяя значения и выводя на экран */
//    public int splitter() {
//        int j;
//        String[] split = new String[numbers.length];
//
//        for (j = 0; j < numbers.length; j++) {
//           split[j] = String.valueOf(numbers[j]/2); }
//
//        System.out.println("Поделим каждый элемент массива на 2 и получим " + Arrays.toString(split));
//        return j;
//    }
//    /** Eraser удаляет элемент из сканера, если такой есть в массиве */
//    public int eraser() {
//
//        System.out.print("Введите значение для удаления - ");
//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
//        List<Integer> eraserlist = new ArrayList<>(Arrays.asList(numbers));
//        int y;
//        for (y = 0; y < numbers.length; y++) {
//
//            if (x == numbers[y]) {
//                eraserlist.remove(y);
//            }
//        }
//        System.out.println("после удаления получаем " + eraserlist);
//        return x;
//    }
}



