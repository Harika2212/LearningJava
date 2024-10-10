package august.augex_04082024.ex_11082024.realLifeExample;

public class Lab189 {
    public static void main(String[] args) {
        Chrome c1 = new Chrome();
        c1.openBrowser("Chrome");
        c1.closeBrowser("Chrome");

        Firefox f = new Firefox();
        f.openBrowser("Firefox");
        f.closeBrowser("Firefox");

    }
}
