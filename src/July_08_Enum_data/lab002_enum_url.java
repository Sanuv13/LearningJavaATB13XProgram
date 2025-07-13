package July_08_Enum_data;

public class lab002_enum_url {
    public static void main(String[] args) {
        //url access = url.google.getData();
       // System.out.println(access);

    }
}

enum url{
    google("https://google.com"),
    katalon("https://katalon.com");

    private String data;
    url(String data){
        this.data=data;
    }
    public String getData() {
        return data;
    }
}