package july_11_linked_list;
import java.util.ArrayList;
import java.util.List;
public class lab001_array_list {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        arraylist.add("Sanu Sachan");
        arraylist.add(13);
        arraylist.add(98.3);
        arraylist.add("true");
        System.out.println(arraylist);
        System.out.println(arraylist.size());
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.set(2,14));
        System.out.println(arraylist.contains("sanu"));
        System.out.println(arraylist.isEmpty());
        System.out.println(arraylist.indexOf(14));
        System.out.println(arraylist.add(15));
        System.out.println(arraylist);
        System.out.println(arraylist.remove(0));
        System.out.println(arraylist);
    }
}
