package Step_Def;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Launch_Step_Def
{
    //WebDriver driver=new ChromeDriver();
    @Given("User launches gmail url")
    public void user_launches_gmail_url() {

       // driver.get(string);
        System.out.println("2Gmail launched");

    }
}
