/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/**
 *
 * @author rupam
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\RUPAM\\chromedriver.exe");
         WebDriver wdChrome = new ChromeDriver();
         wdChrome.get("http://automationpractice.com");
         wdChrome.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")).click();
         Thread.sleep(2000);
         wdChrome.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
         Thread.sleep(1000);
         wdChrome.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]/span")).click();
         Thread.sleep(1000);
         wdChrome.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).clear();
         wdChrome.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).sendKeys("3");
         Thread.sleep(1000);
         wdChrome.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
         Thread.sleep(2000);
         wdChrome.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
         Thread.sleep(1000);
         wdChrome.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
         Thread.sleep(1000);
         Select sort=new Select(wdChrome.findElement(By.xpath("//*[@id=\"selectProductSort\"]")));
         sort.selectByIndex(1);
         Thread.sleep(1000);
         wdChrome.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
         Thread.sleep(1000);
         wdChrome.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[5]/input[2]")).clear();
         wdChrome.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[5]/input[2]")).sendKeys("5");
         Thread.sleep(1000);
         wdChrome.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
         
         
         
    }
    
}
