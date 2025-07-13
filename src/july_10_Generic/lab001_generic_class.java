package july_10_Generic;

public class lab001_generic_class {
    public static void main(String[] args) {
        addition<Integer> I = new addition<>();
        I.setValue(10);
        System.out.println(I.getValue());
        addition<String> S=new addition<>();
        S.setValue("SANU");
        System.out.println(S.getValue());
    }

}




class addition<T>{
    T value;


    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}