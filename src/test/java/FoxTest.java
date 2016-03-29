import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FoxTest {
   
    @Test
    public void hello() {
        WebDriver driver = new FirefoxDriver(); 
        driver.get("https://www.google.com");
        assertFalse(driver.getPageSource().isEmpty());
    }
}
