import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelTest {

    public static void main(String[] args) throws InterruptedException {
        // 创建WebDriver对象，指明使用chrome浏览器驱动
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\软件测试\\chromedriver-win64 (120.0.6099\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 调用WebDriver对象的get方法 可以让浏览器打开指定网址
        driver.get("http://8.134.198.4:1080/webtours/");

        //——————————————————————————————————————————————
        // 要执行的操作（待补充）
        driver.switchTo().frame("body");
        driver.switchTo().frame("navbar");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/input")).sendKeys("ly");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[9]/td[2]/input")).click();

        //搜票
        driver.switchTo().defaultContent();
        driver.switchTo().frame("body");
        driver.switchTo().frame("navbar");
        driver.findElement(By.xpath("/html/body/center/center/a[1]/img")).click();
        Thread.sleep(2000);

        //选票
        driver.switchTo().defaultContent();
        driver.switchTo().frame("body");
        driver.switchTo().frame("info");
        new Select(driver.findElement(By.xpath("/html/body/blockquote/form/table/tbody/tr[1]/td[2]/select"))).selectByVisibleText("London");
        new Select(driver.findElement(By.xpath("/html/body/blockquote/form/table/tbody/tr[2]/td[2]/select"))).selectByVisibleText("Seattle");
        driver.findElement(By.xpath("/html/body/blockquote/form/table/tbody/tr[7]/td/input")).click();
        Thread.sleep(2000);

        //选班次
        driver.findElement(By.xpath("/html/body/blockquote/form/center/table/tbody/tr[4]/td[1]/input")).click();
        driver.findElement(By.xpath("/html/body/blockquote/form/center/center/table/tbody/tr/td[1]/input")).click();
        Thread.sleep(2000);

        //确认个人信息
        driver.findElement(By.xpath("/html/body/blockquote/form/center/table/tbody/tr/td[1]/input")).click();
        Thread.sleep(2000);

        //注销
        driver.switchTo().defaultContent();
        driver.switchTo().frame("body");
        driver.switchTo().frame("navbar");
        driver.findElement(By.xpath("/html/body/center/center/a[4]/img")).click();




        // ——————————————————————————————————————————————

        // 设置等待时间，等待4s
        Thread.sleep(4000);
// 关闭页面并结束相关进程
        driver.quit();
    }
}
