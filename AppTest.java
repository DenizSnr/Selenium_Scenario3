package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

import static java.lang.Thread.*;

public class AppTest
{
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://training.qastorming.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Test() throws InterruptedException {
        WebElement shopButton = driver.findElement(By.cssSelector("li#menu-item-834"));
        shopButton.click();
        Thread.sleep(3000);
        WebElement dropdownButton = driver.findElement(By.cssSelector("select.orderby"));
        dropdownButton.click();
        Thread.sleep(3000);
        WebElement optionButton = driver.findElement(By.cssSelector("select.orderby option[value='date']"));
        optionButton.click();
        Thread.sleep(5000);
        WebElement addToCartButton1 = driver.findElement(By.cssSelector("a[data-product_id='214']"));
        addToCartButton1.click();
        Thread.sleep(5000);
        WebElement addToCartButton2 = driver.findElement(By.cssSelector("a[data-product_id='213']"));
        addToCartButton2.click();
        Thread.sleep(5000);
        WebElement addToCartButton3 = driver.findElement(By.cssSelector("a[data-product_id='212']"));
        addToCartButton3.click();
        Thread.sleep(5000);
        WebElement viewCartButton = driver.findElement(By.cssSelector("a[data-product_id='212'] + a.added_to_cart"));
        viewCartButton.click();
        Thread.sleep(5000);
        WebElement quantityInput1 = driver.findElement(By.cssSelector("input[name='cart[ca46c1b9512a7a8315fa3c5a946e8265][qty]']"));
        quantityInput1.click();
        quantityInput1.clear();
        quantityInput1.sendKeys("4");
        Thread.sleep(3000);
        WebElement quantityInput2 = driver.findElement(By.cssSelector("input[name='cart[1534b76d325a8f591b52d302e7181331][qty]']"));
        quantityInput2.click();
        quantityInput2.clear();
        quantityInput2.sendKeys("2");
        Thread.sleep(3000);
        WebElement updateCartButton = driver.findElement(By.cssSelector("button[name='update_cart']"));
        updateCartButton.click();
        Thread.sleep(5000);
        WebElement proceedToCheckoutButton = driver.findElement(By.cssSelector("a.checkout-button"));
        proceedToCheckoutButton.click();
        Thread.sleep(5000);
        WebElement FirstName = driver.findElement(By.cssSelector("input#billing_first_name"));
        FirstName.click();
        FirstName.sendKeys("Deniz");
        Thread.sleep(2000);
        WebElement LastName = driver.findElement(By.cssSelector("input#billing_last_name"));
        LastName.click();
        LastName.sendKeys("Sener");
        Thread.sleep(2000);
        WebElement companyName = driver.findElement(By.cssSelector("input#billing_company"));
        companyName.click();
        companyName.sendKeys("Getir");
        Thread.sleep(2000);
        WebElement street = driver.findElement(By.cssSelector("input#billing_address_1"));
        street.click();
        street.sendKeys("Kazimdirik street");
        Thread.sleep(2000);
        WebElement apartment = driver.findElement(By.cssSelector("input#billing_address_2"));
        apartment.click();
        apartment.sendKeys("Coordinat");
        Thread.sleep(2000);
        WebElement zipCode = driver.findElement(By.cssSelector("input#billing_postcode"));
        zipCode.click();
        zipCode.sendKeys("123456");
        Thread.sleep(2000);
        WebElement city = driver.findElement(By.cssSelector("input#billing_city"));
        city.click();
        city.sendKeys("Bornova");
        Thread.sleep(2000);
        WebElement phone = driver.findElement(By.cssSelector("input#billing_phone"));
        phone.click();
        phone.sendKeys("5316925098");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.cssSelector("input#billing_email"));
        email.click();
        email.sendKeys("deniz.sener@getir.com");
        Thread.sleep(2000);
        WebElement comments = driver.findElement(By.cssSelector("textarea#order_comments"));
        comments.click();
        comments.sendKeys("sdjkfsd");
        Thread.sleep(2000);
        WebElement checkbox = driver.findElement(By.cssSelector("input#ce4wp_checkout_consent_checkbox"));
        checkbox.click();
        Thread.sleep(2000);
        WebElement cartButton = driver.findElement(By.cssSelector("ul#primary-menu a.cart-page-link"));
        cartButton.click();
        Thread.sleep(5000);
        WebElement removeButton1 = driver.findElement(By.cssSelector("a.remove[data-product_id='214']"));
        removeButton1.click();
        Thread.sleep(5000);
        WebElement removeButton2 = driver.findElement(By.cssSelector("a.remove[data-product_id='213']"));
        removeButton2.click();
        Thread.sleep(5000);
        WebElement removeButton3 = driver.findElement(By.cssSelector("a.remove[data-product_id='212']"));
        removeButton3.click();
        Thread.sleep(5000);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
