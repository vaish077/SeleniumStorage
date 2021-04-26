import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class Console{
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishali Kaushik\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.voot.com/");
        driver.manage().window().maximize();
        LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> logs= entry.getAll();

        for(LogEntry e: logs)
        {
            System.out.println(e);
        }

        for(LogEntry e: logs)
        {
            System.out.println("Message is: " +e.getMessage());
            System.out.println("Level is: " +e.getLevel());
        }
    }
}
