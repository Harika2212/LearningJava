package august.augex_04082024.ex_10082024;

public class RealTimeInheritance {
    public static void main(String[] args) {
        baseClass bc = new baseClass();//Dynamic dispatch //Runime
        //bc.setBrowser("Safari",true);
        bc.openBrowser();
        bc.closeBrowser();

    }

}
class TestCase1 extends baseClass{
    TestCase1(){
        super();
        this.setBrowser("Safari",true);
    }
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
class baseClass{
    baseClass(){
        System.out.println("DC");
    }
    baseClass(String b){
        System.out.println("PC");
    }

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        } else {
            System.out.println("Not allowed to change");
        }
    }
    void openBrowser(){
        System.out.println("Chrome Browser");
    }
    void openBrowser(String browswerName){
        System.out.println("Open Browser -->" + browswerName);
    }
    void closeBrowser(){
        System.out.println("Close Browser");
    }
}
