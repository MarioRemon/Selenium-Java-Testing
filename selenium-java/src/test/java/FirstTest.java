import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FirstTest
{
    @Test
    public void testaya()
    {
        System.setProperty("webdriver.chrome.driver","resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.quit();
    }
    @Test
    public void testaya2()
    {
        System.setProperty("webdriver.chrome.driver","resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        assertEquals("FORMY",driver.findElement(By.cssSelector("#logo")).getText());
        assertEquals("Form",driver.findElement(By.cssSelector("#navbarNavDropdown > ul > li:nth-child(1) > a")).getText());
        assertEquals("Components",driver.findElement(By.cssSelector("#navbarDropdownMenuLink")).getText());
        assertEquals("Complete Web Form",driver.findElement(By.cssSelector("body > div > h1")).getText());
        assertEquals("First name",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(1) > strong > label")).getText());
        assertEquals("Last name",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(3) > strong > label")).getText());
        assertEquals("Job title",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(5) > strong > label")).getText());
        assertEquals("Highest level of education",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(7) > div:nth-child(1) > strong > label")).getText());
        assertEquals("High School",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(7) > div:nth-child(2)")).getText());
        assertEquals("College",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(7) > div:nth-child(3)")).getText());
        assertEquals("Grad School",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(7) > div:nth-child(4)")).getText());
        assertEquals("Sex",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(9) > div:nth-child(1) > strong > label")).getText());
        assertEquals("Male",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(9) > div:nth-child(2)")).getText());
        assertEquals("Female",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(9) > div:nth-child(3)")).getText());
        assertEquals("Prefer not to say",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(9) > div:nth-child(4)")).getText());
        assertEquals("Years of experience:",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(11) > strong > label")).getText());
        assertEquals("Date",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(13) > strong > label")).getText());
        assertEquals("Submit",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(15) > a")).getText());
        driver.quit();
    }
    @Test
    public void testaya3() {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        //wait = WebDriverWait(driver, 10);
        driver.findElement(By.cssSelector("#first-name")).sendKeys("Mario");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Remon");
        driver.findElement(By.cssSelector("#job-title")).sendKeys("Engineer");
        driver.findElement(By.cssSelector("#radio-button-1")).click();
        driver.findElement(By.cssSelector("#checkbox-1")).click();
        driver.findElement(By.cssSelector("#select-menu > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(15) > a")).click();
        driver.quit();
    }
    @Test
    public void testaya4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        WebElement E1 = driver.findElement(By.cssSelector("#first-name"));
        WebElement E2 = driver.findElement(By.cssSelector("#last-name"));
        WebElement E3 = driver.findElement(By.cssSelector("#job-title"));
        WebElement E4 = driver.findElement(By.cssSelector("#radio-button-2"));

        E1.sendKeys("Mario");
        E2.sendKeys("Remon");
        E3.sendKeys("Student");
        E4.click();

        assertEquals(E1.getAttribute("value"),"Mario");
        assertEquals(E2.getAttribute("value"),"Remon");
        assertEquals(E3.getAttribute("value"),"Student");
        assertTrue(E4.isSelected());
        driver.findElement(By.cssSelector("#checkbox-1")).click();
        driver.findElement(By.cssSelector("#select-menu > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(15) > a")).click();
        driver.quit();
    }
}
