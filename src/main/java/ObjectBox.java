import java.util.*;
import java.util.function.Predicate;

public class ObjectBox {

    public static void main(String[] args) {
//        Object[] arr = /* {"qwe", "wer", "ert", "tyu"};*/ new String[10];
        ArrayList<Object> objects = new ArrayList<>(Collections.emptyList());
//        System.out.println("исходный массив " + Arrays.toString());

        objects.add(addObject());
        System.out.println(objects);
        objects.remove(deleteObject());
        System.out.println(objects);

    }

//    private static String objects;
//
//    public ObjectBox(Object objects) {
//        this.objects = objects.toString();
//    }

        public static Object addObject() {

            System.out.print("Новый объект ");
            Scanner scan = new Scanner(System.in);
            String x = scan.nextLine();
            return x;

        }

        public static Object deleteObject() {
            System.out.print("Проверить объект ");
            Scanner scan = new Scanner(System.in);
            String y = scan.nextLine();
            return y;



        }


//    private void deleteObject() {
//
//    }



}