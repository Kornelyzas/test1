import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Selenium");
        System.setProperty("webdriver.chrome.driver",
                "webdriver/chromedriver88.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("Https://Bing.com/");
    }
}
