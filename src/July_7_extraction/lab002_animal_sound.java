package July_7_extraction;

public class lab002_animal_sound {
    public static void main(String[] args) {
        cat c=new cat();
        dog d=new dog();
        d.makesound();
            c.makesound();


    }
}
abstract class animal{
    abstract void  makesound();

}
class dog extends animal{
    void makesound(){
        System.out.println("dog barks");
    }
}
class cat extends animal{
    void makesound(){
        System.out.println("cat meows");
    }
}