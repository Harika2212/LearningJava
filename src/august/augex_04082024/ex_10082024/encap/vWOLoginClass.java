package august.augex_04082024.ex_10082024.encap;

public class vWOLoginClass {
    private String username;
    private String password;
    private String signInButton;

    public vWOLoginClass(String username, String password, String signInButton) {
        this.username = username;
        this.password = password;
        this.signInButton = signInButton;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSignInButton() {
        return signInButton;
    }

    public void setUsername(String username, boolean isAdmin) {
        if (isAdmin) {
            this.username = username;
            System.out.println("Allowed");

        } else {
            System.out.println("not allowed");
        }
    }
}
