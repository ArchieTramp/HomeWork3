import java.util.*;
import java.util.function.Predicate;

public class ObjectBox {

    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>(Collections.emptyList());

        objects.add(addObject());
        System.out.println(objects);
        objects.remove(deleteObject());
        System.out.println(objects);
    }

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
}