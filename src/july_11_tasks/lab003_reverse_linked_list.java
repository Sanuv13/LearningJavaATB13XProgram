package july_11_tasks;
import java.util.LinkedList;
public class lab003_reverse_linked_list {
    public static void main(String args[]) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        System.out.println(linkedlist);
        System.out.println(linkedlist.reversed());
    }
}
