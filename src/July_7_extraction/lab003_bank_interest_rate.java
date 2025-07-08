package July_7_extraction;

public class lab003_bank_interest_rate {
    public static void main(String[] args) {

        SBI rate=new SBI();
        rate.getIntrestRate();
        HDFC Rate=new HDFC();
        Rate.getIntrestRate();
    }
}
abstract class bank{
    abstract void getIntrestRate();

}
class SBI extends bank{
    void getIntrestRate(){
        System.out.println("SBI intrest rate is 6.5%");
    }

}
class HDFC extends bank{
    void getIntrestRate(){
        System.out.println("HDFC intrest rate is 7%");
    }
}
