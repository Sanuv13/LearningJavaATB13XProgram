package july_11_tasks;
import java.util.Scanner;
import java.util.ArrayList;
public class lab004_find_city_name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String>  arraylist =new ArrayList<>();
        System.out.println("Enter the count of city3");
        int count =Integer.parseInt(scan.nextLine());
        for(int i=0;i<=count;i++){
            System.out.println("city name is"+i);
            String name=scan.nextLine();
            arraylist.add(name);

        }
        if(arraylist.contains("Pune")){
            System.out.println("city found");
        }
        else{
            System.out.println("city not found");

        }



    }
}