import model.pom.pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class rawSelenium {

    public static void main(String args[]) {
        ArrayList<model.Product> products = new ArrayList<model.Product>();
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver","C:\\Workspaces\\Selenium\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.lowes.com");
        driver.manage().deleteAllCookies();
        driver.findElement(By.id("search-query")).sendKeys("Refrigerator");
        driver.findElement(By.id("search-query")).sendKeys(Keys.ENTER);
        List<WebElement> el =driver.findElements(By.cssSelector("#listItems [data-selector=\"prd-description-zone\"]"));
        System.out.println("count: " + el.size());
        for (WebElement e : el) {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            System.out.println("Mapping: " + e.getText());
            ProductPage p = new ProductPage(driver);
            products.add(p.getProduct(e));
        }
        for(model.Product p:products) {
            System.out.println(p.toString());
        }
        driver.quit();
    }
}
