import javafx.scene.layout.Priority;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test1Test {

    @BeforeTest
    public void setup(){
        Test1.setup();
    }

    @Test(priority = 1, groups = "searchTests")
    public void searchByWord(){
        Test1.searchByWord("Antanas Baranauskas");
        compareResultsTest();
    }

    public void compareResultsTest(){
        int results = Test1.compareResults();
        Assert.assertEquals(32200, results);
    }

    @AfterTest
    public void close(){
        Test1.close();
    }
}
