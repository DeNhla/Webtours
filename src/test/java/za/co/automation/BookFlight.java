package za.co.automation;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookFlight extends TestBase {

    @Override
    @BeforeClass
    public void before() throws Exception {
        super.before();
        //this.getWebDriver().get("http://localhost:1080/WebTours/");
        this.getWebDriver().get(getSiteURL());
        Thread.sleep((1000L));
    }

    @Test
    public void bookFlight() throws InterruptedException {

        driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
        Thread.sleep( 3000L);
        driver.findElement(By.xpath("//*[contains(text(),'REGI')]")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nhlanhla");
        driver.findElement(By.xpath("//input[@name='lastName' and @maxlength='60']")).sendKeys("Mabena");
        driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("0723019172");
        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Test@gmail.com");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("4th place fnb");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Tester");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("123");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")).sendKeys("123");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a")).click();






        Thread.sleep((5000L));


        ///html/body/form/table/tbody/tr[6]/td[2]/input

    }

    @AfterClass
    public void after(){
        super.after();
    }

}