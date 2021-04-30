import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;

public class Storage{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.maxlifeinsurance.com/term-insurance-plans/premium-calculator");
        WebStorage webStorage = (WebStorage) new Augmenter().augment(driver);


        LocalStorage localStorage = webStorage.getLocalStorage();
        localStorage.setItem("mobile", "8748378347");
        System.out.println(localStorage.getItem("mobile"));
        System.out.println(localStorage.getItem("leadData"));

        SessionStorage sessionStorage = webStorage.getSessionStorage();
        sessionStorage.setItem("mobile", "8748378347");
        System.out.println(sessionStorage.getItem("mobile"));
        System.out.println(sessionStorage.getItem("lastRoute"));

    }
}