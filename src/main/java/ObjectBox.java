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

public class ObjectBox<T> {

   public ArrayList<T> objects = new ArrayList<>();

    public static void main(String[] args) {


        /** выполнение методов */
        System.out.print("Новый объект ");
        Scanner scan = new Scanner(System.in);
        String newobj = scan.nextLine();
        System.out.print("Проверить объект ");
        Scanner scann = new Scanner(System.in);
        String controlobj = scann.nextLine();
        ObjectBox<String> a = new ObjectBox<>();

        a.addObject(newobj);
        System.out.println(a);
        a.deleteObject(controlobj);
        System.out.println(a);

    }


    /**
     * addObject добавляет элемент в коллекцию
     */

    public void addObject(T newobj) {
            objects.add(newobj);

    }

    /**
     * deleteObject удаляет элемент из коллекции
     */
    public void deleteObject(T controlobj) {
        objects.remove(controlobj);

    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "objects=" + objects +
                '}';
    }
}