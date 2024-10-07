package august.augex_04082024.ex_10082024.encap;

public class ICICI {
    private String name;
    private long bal;

    public ICICI(String name, int balance) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {
        if (isAdmin) {
            this.bal = bal;
            System.out.println("Admin is allowed");
        } else {
            System.out.println("Not allowed");
        }
    }

    public void setName(String name, boolean isAdmin) {
        if (isAdmin) {
            this.name = name;
            System.out.println("Admin is allowed");
        } else {
            System.out.println("Not allowed");
        }
    }
}


