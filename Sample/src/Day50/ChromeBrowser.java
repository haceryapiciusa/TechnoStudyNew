package Day50;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.techno.study/" );
        driver.quit();
    }
}