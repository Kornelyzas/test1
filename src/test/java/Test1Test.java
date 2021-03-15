import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Test1Test {
    @Before
    public void setup(){
        Test1.setup();
    }
    @Test
    @Order(1)
    public void searchByWord(){
        Test1.searchByWord("Antanas Baranauskas");
        compareResultsTest();
    }
    public void compareResultsTest(){
        int results = Test1.compareResults();
        Assert.assertEquals(32700, results);
    }
    @After
    public void close(){
        Test1.close();
    }
}
