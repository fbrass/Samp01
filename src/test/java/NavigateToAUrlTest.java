import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToAUrlTest {

    public NavigateToAUrlTest(){

    }

    @Test
    public void main() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }
}