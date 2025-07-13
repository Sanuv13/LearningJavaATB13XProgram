package july_11_tasks;
import java.util.LinkedList;
import java.util.ArrayList;
public class lab005_performance {
    public static void main(String[] args) {
        ArrayList arraylist =new ArrayList();
        LinkedList linkedlist =new LinkedList();
        {
            long start_time = System.currentTimeMillis();
            for (long i = 0; i <= 99999; i++) {

                arraylist.add(i);
            }
            long end_time = System.currentTimeMillis();

            long total_time = end_time-start_time;
            System.out.println("arraylist  time is " + total_time +"ms");

        }
        {
            long start =System.currentTimeMillis();
            for (long j=0;j<=99999;j++){
                linkedlist.add(j);
            }
            long end = System.currentTimeMillis();
            long total=end-start;
            System.out.println("linkedlist time is "+total+"ms");

        }

            }

        }





