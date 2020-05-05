import java.util.*;

public class MathBox extends ObjectBox {
    public static void main(String [] args) {
        try {
        int z;
        System.out.print("Введите размер массива ");
        Scanner scan = new Scanner(System.in);
        int capacity = scan.nextInt();
        Integer[] numarray = new Integer[capacity]; //новый массив
        Scanner scanarr = new Scanner(System.in);
            for (z = 0; z < capacity; z++) {
            System.out.print("Введите значение для элемента " + z + " - ");
            numarray[z] = scanarr.nextInt();
            }
        Arrays.sort(numarray); //сортировка для красоты
        Set<Integer> numset = new HashSet<>(Arrays.asList(numarray)); //массив в сет, убирает повторы
        List<Integer> numlist = new ArrayList<>(numset); //сет в лист для удобства работы
        ArrayList<Integer> numbers = new ArrayList<>(numlist); //возврат в массив

        System.out.println("Отсортировано " + Arrays.toString(numarray));
        System.out.println("Удаляем повторы " + numset);

        new MathBox(numbers).summator();
        new MathBox(numbers).splitter();
        new MathBox(numbers).eraser();
        new MathBox(numbers).addObject();
        new MathBox(numbers).deleteObject();} catch (Exception e) {
            System.out.println(e + " вводить необходимо целочисленные значения");
        }


    }
    private final Integer[] numbers;

    public MathBox(ArrayList<Integer> numbers) {
            this.numbers = numbers.toArray(new Integer[0]);
    }


    public int summator() {
        int i;
        int sum = 0;
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма всех элементов массива = " + sum);
        return sum;

    }

    public int splitter() {
        int j;
        String[] split = new String[numbers.length];

        for (j = 0; j < numbers.length; j++) {
           split[j] = String.valueOf(numbers[j]/2); }

        System.out.println("Поделим каждый элемент массива на 2 и получим " + Arrays.toString(split));
        return j;
    }

    public int eraser() {

        System.out.print("Введите значение для удаления - ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        List<Integer> eraserlist = new ArrayList<>(Arrays.asList(numbers));
        int y;
        for (y = 0; y < numbers.length; y++) {

            if (x == numbers[y]) {
                eraserlist.remove(y);
            }
        }
        System.out.println("после удаления получаем " + eraserlist);
        return x;
    }
}



