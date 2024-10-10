package august.augex_04082024.ex_11082024.realLifeExample;

public class Chrome extends BaseClass{

    @Override
    String openBrowser(String browser) {
        System.out.println("opening the chrome.... this code is related to chrome only");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("closing the chrome.... this code is related to chrome only");
        return "";
    }

    @Override
    void takeScreenshot() {
        System.out.println("Taking screenshot from chrome");
    }
}
