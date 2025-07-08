package July_4_Encapsulation;

public class lab001_browser {
    public static void main(String[] args) {
        web_Browser wb=new web_Browser();
            wb.setUsername("sanu");
        System.out.println(wb.getUsername());


        }
    }

class web_Browser{
    private  String username="data";
    private String URL;
    private int pass;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getPass() {
        return pass;
    }


    }

