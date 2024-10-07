package august.augex_04082024.ex_10082024.encap;
//Encapsulation

public class Lab178 {
    public static void main(String[] args) {
        VWOLogin VWL = new VWOLogin("admin","Password123");
        System.out.println("VWL.password");
        VWL.setPassword("pass");
        System.out.println("VWL.password");
    }

}

class VWOLogin{
    public String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public VWOLogin(String username, String password){
        this.username = username;
        this.password = password;

    }
}
