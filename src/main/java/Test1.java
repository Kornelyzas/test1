import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

    public static final String SEARCH_BUTTON_BY_XPATH = "//*[@id=\"sb_form_q\"]";


    public static void main(String[] args) {
        System.out.println("Selenium");

        System.setProperty("webdriver.chrome.driver",
                "webdriver/chromedriver89.exe");

        WebDriver browser = new ChromeDriver();
        browser.get("Https://Bing.com/");

        WebElement searchInput = browser.findElement(By.id("sb_form_q"));
        searchInput.sendKeys("Ponas Baranauskas");
//        searchInput.sendKeys(Keys.ENTER);
        WebElement formGo = browser.findElement(By.id("sb_form_go"));
//        formGo.click();

        // 1 veikiantis budas naudojant JS (paspaudimas mygtuku)
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("arguments[0].click();", formGo);

        // 2 neveikiantis budas webuose su js
//        WebDriverWait webDriverWait = new WebDriverWait(browser, 2);
//        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SEARCH_BUTTON_BY_XPATH)));
//        formGo.click();

        // 3 budas neveikiantis webuose su js
//        WebDriverWait webDriverWait = new WebDriverWait(browser, 2);
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(SEARCH_BUTTON_BY_XPATH)));
//        formGo.click();

        WebElement sbCount = browser.findElement(By.xpath("//*[@id=\"b_tween\"]/span"));
        String searchResults = sbCount.getText().replaceAll("[a-zA-Z]", "").replaceAll("[, ]", "");
        int searchRes = Integer.parseInt(searchResults);
        System.out.println(searchRes);

        if (searchRes < 50000) {
            System.out.println("Ponas Baranauskas nera toks populiarus");
        } else {
            System.out.println("Ponas yra populiarus");
        }
    }

}
