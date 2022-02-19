import com.google.common.io.ByteSink;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class MobileTest {

    @Test
   public void checkMobilePayment(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://next.privat24.ua/mobile");

        // Номер телефона
        By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
        driver.findElement(phoneNumber).sendKeys("63 447 78 37");

        //Сумма
        By amountPay = By.xpath("//input[@data-qa-node=\"amount\"]");
        driver.findElement(amountPay).sendKeys("79");

        //Номер карты
        By numberCard = By.xpath("//input[@data-qa-node=\"numberdebitSource\"]");
        driver.findElement(numberCard).sendKeys("4093206288191961");

        //Срок действия карты
        By expireDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
        driver.findElement(expireDate).sendKeys("06/22");

        //СВ-код
        By cvvCode = By.xpath("//input[@data-qa-node=\"cvvdebitSource\"]");
        driver.findElement(cvvCode).sendKeys("494");

        //Имя
        By firstName = By.xpath("//input[@data-qa-node=\"firstNamedebitSource\"]");
        driver.findElement(firstName).sendKeys("Donald");

        //Фамилия
        By lastName = By.xpath("//input[@data-qa-node=\"lastNamedebitSource\"]");
        driver.findElement(lastName).sendKeys("Duck");

        //Кнопка "Добавить в корзину"
        driver.findElement(By.xpath("//button[@data-qa-node=\"submit\"]")).click();

        //Кнопка "Пополнить"
         driver.findElement(By.xpath(".//button[contains(text(),'Сплатити')]")).click();



    }



}



