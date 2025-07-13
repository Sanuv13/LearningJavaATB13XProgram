package july_10_object_class;

public class lab001_super_class {
    public static void main(String[] args) {
        student data =new student("Ram",12);{
            System.out.println(data);
        }

    }
}

class student{
    String name;
    int rollno;
    public student(String name ,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public String toString() {
        return "student{name='" + name + "', rollno=" + rollno + "}";
    }
}