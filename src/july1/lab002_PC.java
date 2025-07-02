package july1;

public class lab002_PC {
    public static void main(String[] args) {
        car c1 = new car("lucky","23454323",2025);
        System.out.println(c1
                .name);
    }
}

 class car {
     String name;
     String aadhar_number;
     int number;

car(String name_user,String aadhar_number_user,int number_user){
         this.name = name_user;
         this.aadhar_number = aadhar_number_user;
         this.number = number_user;

     }



}