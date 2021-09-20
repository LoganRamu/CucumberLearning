package Step_Def;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLaunch_Step_Def {
    WebDriver driver = new ChromeDriver();

    @Given("User launches google url")
    public void user_launches_google_url() {

        driver.get("https://www.google.com/");
       // System.out.println("Google launched");
        //Assert.fail();
        System.out.println("1Google Launched");
    }
}
