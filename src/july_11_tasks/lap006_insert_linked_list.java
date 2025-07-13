package july_11_tasks;
import java.util.LinkedList;
public class lap006_insert_linked_list {
    public static void main(String[] args) {
        LinkedList linkedlist =new LinkedList();
        linkedlist.add("apple");
        linkedlist.add("Orange");
        linkedlist.add("Banana");
        System.out.println(linkedlist);
        linkedlist.add(1,"Mango");
        System.out.println(linkedlist);
    }
}
