/**
 * @author Artur Gilyazov
 * ObjectBox
 * Написать класс ObjectBox, реализующий следующий функционал:
 * добавление элемента в коллекцию
 * удаление элемента из коллекции
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ObjectBox<T> {


    private Object newobj;

    public static void main(String[] args) {
        /** создание пустой коллекции */
        ArrayList<Object> objects = new ArrayList<>(Collections.emptyList());
        /** выполнение методов */
        System.out.print("Новый объект ");
        Scanner scan = new Scanner(System.in);
        String newobj = scan.nextLine();
        System.out.print("Проверить объект ");
        Scanner scann = new Scanner(System.in);
        String controlobj = scann.nextLine();
        ObjectBox a = new ObjectBox();


        a.addObject(newobj);
        System.out.println(objects);
        a.deleteObject(controlobj);
        System.out.println(objects);

    }


    /**
     * addObject добавляет элемент в коллекцию
     * @param newobj
     */

    public void addObject(T String newobj) {
            objects.add();
//            System.out.print("Новый объект ");
//            Scanner scan = new Scanner(System.in);
//            String x = scan.nextLine();
    }

    /**
     * deleteObject удаляет элемент из коллекции
     */
    public void deleteObject(T controlobj) {
        objects.remove(controlobj);
//            System.out.print("Проверить объект ");
//            Scanner scan = new Scanner(System.in);
//            String y = scan.nextLine();
    }



}