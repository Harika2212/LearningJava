package august.augex_04082024.ex_10082024.encap;

public class Lab179 {
    public static void main(String[] args) {
        ICICI akhil = new ICICI("Harika", 10000);
        akhil.setBal(200000,false);
        System.out.println(akhil.getBal());
        System.out.println(akhil.getBal());
        ICICI admin = new ICICI("admin",12000);
        admin.setBal(130090,true);
        System.out.println(admin.getBal());
        System.out.println(admin.getBal());

    }
}
