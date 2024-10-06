package aug_04082024.SingleInheritance.Real;

public class TestCase2 extends BaseTest{
    void TestCase2(){
        startBrowser();
        getDataFromSQL();
        System.out.println(gold);
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().TestCase2();
    }
}
