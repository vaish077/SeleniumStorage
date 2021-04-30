import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Storagejs{
    public static WebDriver driver;
    public static JavascriptExecutor js;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        js = ((JavascriptExecutor)driver);
        driver.get("https://www.maxlifeinsurance.com/term-insurance-plans/premium-calculator");

        String sItem = getItemFromLocalStorage("eligibilityData");
        System.out.println(sItem);

        String Item = getItemFromSessionStorage("lead");
        System.out.println(Item);
    }

    public static String getItemFromLocalStorage(String key)
    {
        return (String) js.executeScript(String.format(
                "return window.localStorage.getItem('%s');", key));
    }

    public static String getItemFromSessionStorage(String key) {
        return (String) js.executeScript(String.format(
                "return window.sessionStorage.getItem('%s');", key));
    }
}
