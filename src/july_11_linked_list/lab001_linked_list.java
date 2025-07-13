package july_11_linked_list;
import java.util.List;
import java.util.LinkedList;
public class lab001_linked_list {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(3);
        list.add("Ayansh");
        list.add("Ashish");
        list.addLast("Ayansh");
        list.addFirst("Ashish");
        System.out.println(list);
        System.out.println(list.getLast());
    }
}
