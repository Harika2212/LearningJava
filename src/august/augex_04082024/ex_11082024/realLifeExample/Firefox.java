package august.augex_04082024.ex_11082024.realLifeExample;

public class Firefox extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("opening the Firefox.... this code is related to Firefox only");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("closing the Firefox.... this code is related to Firefox only");
        return "";
    }

    @Override
    void takeScreenshot() {
        System.out.println("Taking screenshot from Firefox");
    }
}
