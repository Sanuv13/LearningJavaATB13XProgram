package July_08_Enum_data;

public class lab001_enum_data_type {
    public static void main(String[] args) {
        days today=days.Monday;
        System.out.println(today);
    }
}


enum days{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}