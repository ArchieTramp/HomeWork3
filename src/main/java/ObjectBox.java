import java.util.*;

public class ObjectBox {

    public static void main(String[] args) {
        Object[] arr = new String[10];
        ArrayList object = new ArrayList<Object>(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));


    }

    private static String[] objects;

    public ObjectBox(ArrayList<String> object) {
        this.objects = object.toArray(new String[0]);
    }

        public List<String> addObject() {
            List<String> objects = new ArrayList<>();
            System.out.print("Новый объект ");
            Scanner scan = new Scanner(System.in);
            String x = scan.nextLine();
            objects.add(x);
            System.out.println(objects);
            return objects;

        }


//    private void deleteObject() {
//
//    }



}