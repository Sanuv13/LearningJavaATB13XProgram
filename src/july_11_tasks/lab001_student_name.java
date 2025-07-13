package july_11_tasks;
import java.util.ArrayList;
public class lab001_student_name {
    public static void main(String args[]){
        ArrayList arraylist =new ArrayList();
        arraylist.add("Deepak");
        arraylist.add("Ravi");
        arraylist.add("Sneha");
        arraylist.add("Priya");
        arraylist.add("Anajali");
        for (int i=0;i<=arraylist.size()-1;i++){
            System.out.println(arraylist.get(i));

        }
    }
}
