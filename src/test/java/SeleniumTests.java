import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTests {

    @Test
    public void seleniumtest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://news.google.com/topstories?hl=fr&gl=FR&ceid=FR:fr");
        driver.quit();
    }
}
