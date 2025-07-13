package july_11_tasks;
import java.util.ArrayList;
public class lab002_remove_name {
    public static void main(String args[]){
        ArrayList arraylist = new ArrayList();

        arraylist.add("Amit");
        arraylist.add("Neha");
        arraylist.add("Suresh");
        System.out.println(arraylist);
        arraylist.remove(1);
        System.out.println(arraylist);
    }
}
