import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTEst {

    WebDriver driver;

    @Before
    public void startBrowser(){
    driver = new ChromeDriver();
    }
    @After
    public void stoptBrowser(){
        driver.quit();
    }


    @Test
    public void test(){

    driver.get("http://googlr.com");

    }



}
