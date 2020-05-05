/**
 * @author Artur Gilyazov
 * ObjectBox
 * Написать класс ObjectBox, реализующий следующий функционал:
 * добавление элемента в коллекцию
 * удаление элемента из коллекции
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectBox {

    public static void main(String[] args) {
        /** создание пустой коллекции */
        ArrayList<Object> objects = new ArrayList<>(Collections.emptyList());
        /** выполнение методов */
        objects.add(addObject());
        System.out.println(objects);
        objects.remove(deleteObject());
        System.out.println(objects);
    }
        /** addObject добавляет элемент в коллекцию */
        public static Object addObject() {

            System.out.print("Новый объект ");
            Scanner scan = new Scanner(System.in);
            String x = scan.nextLine();
            return x;
        }
        /** deleteObject удаляет элемент из коллекции */
        public static Object deleteObject() {
            System.out.print("Проверить объект ");
            Scanner scan = new Scanner(System.in);
            String y = scan.nextLine();
            return y;
        }
}