package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * Created by DELL on 2018/5/7.
 */
public class SeleniumUtil {
    private static Logger logger=Logger.getLogger(SeleniumUtil.class);
    public WebDriver driver;
    public static String driverType;
    public static Actions action;
    //启动浏览器
    public WebDriver getDriver(String browserName) throws IOException {
        Properties type = new Properties();
        InputStream team=new FileInputStream("./switchDriver");
        type.load(team);
        driverType=type.getProperty(browserName);
        team.close();
        if(driverType.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
            driver=new ChromeDriver();
            logger.info("启动谷歌浏览器");
        }else if(driverType.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "E:\\driver\\geckodriver.exe");
            driver=new FirefoxDriver();
            logger.info("启动火狐浏览器");
        }else{
            logger.error("无法识别该浏览器");
        }
        return driver;
    }

    //寻找页面元素
    public WebElement getElement(By by) {
        WebElement element;
        try {
            element = driver.findElement(by);
            logger.info("找到对应页面元素"+getLocatorByElement(element,">"));
            return element;
        }catch (NoSuchElementException e) {
             e.printStackTrace();
            logger.error("页面元素未找到");
            return null;
        }
    }
   //寻找元素集合
    public List<WebElement> getElements(By by){
          List<WebElement> elements;
        try{
            elements=driver.findElements(by);
            logger.info("找到页面元素集合");
            return elements;
        }catch (NoSuchElementException e){
             e.printStackTrace();
            logger.error("未识别到元素集合");
            return null;
        }
    }
   //清除文本框内容
    public void newClear(WebElement element){
        element.clear();
        logger.info("内容已清除");
    }
    //输入文本内容
    public void sendKeys(WebElement element,String content){
        element.clear();
        element.sendKeys(content);
        logger.info("输入内容为："+content);

    }
    //点击操作
    public void newClick(WebElement element){
        element.click();
        logger.info("点击"+getLocatorByElement(element,">"));
    }
    //打开网页
    public void url(String url){
        driver.get(url);
        driver.manage().window().maximize();
        logger.info("打开"+url+"网页");
    }
    //刷新页面
    public void refresh(){
        driver.navigate().refresh();
        logger.info("页面已刷新");
    }

    public String getLocatorByElement(WebElement element,String exceptText){
        String text=element.toString();
        String except=null;
        try{
            except=text.substring(text.indexOf(exceptText)+1,text.length()-1);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("未找到==》"+exceptText);
        }
        return except;
    }

    public String getText(WebElement element){
        if (element.getText()!=null){
            System.out.println(element.getText());
            logger.info("内容为"+element.getText());
        }else{
            logger.error("内容为空");
        }
        return element.getText();
    }

   public boolean isExist(By by){
       try {
           driver.findElement(by);
           logger.info("该元素存在");
           return true;
       }catch (NoSuchElementException e){
           e.printStackTrace();
           logger.error("该元素不存在");
           return false;
       }
   }

    public void assertPage(String expect){
        String actual=driver.getTitle();
        try {
            Assert.assertEquals(actual,expect);
        }catch (AssertionError e){
            e.printStackTrace();
            logger.error("期望的文字是:"  + expect +  "但是找到了"  + actual );
            Assert.fail("期望的文字是:"  + expect +  "但是找到了"  + actual);
        }
        logger.info("找到了对应title，当前页面正确:"+actual);
    }

    public void assertForText(String actual, String expected){
        try{
            Assert.assertEquals(actual, expected);
        } catch (AssertionError e){
            logger.error("期望的文字是:"  + expected + " 但是找到了" + actual );
            Assert.fail("期望的文字是:"  + expected + " 但是找到了" + actual);
        }
        logger.info("找到了期望的文字:" + expected );
    }

    public void alert(WebElement element,String content){
        driver.switchTo().alert();
        logger.info("跳转至弹窗页面");
        element.sendKeys(content);
    }
    public void handles(){
        Set<String> hands = driver.getWindowHandles();
        for(String hand:hands) {
            driver.switchTo().window(hand);
        }
    }
    public void iframe(WebElement element){
        driver.switchTo().frame(element);
        logger.info("跳转至名为："+element+"的框架");
    }
    public void iframeTo(){
        driver.switchTo().defaultContent();
        logger.info("从iframe跳出");
    }

    public void waitForElementLoad(final By by,int timeOut){
        logger.info("开始查找元素"+by);
        try{
            WebDriverWait wait=new WebDriverWait(driver,timeOut,1000);
            wait.until(new ExpectedCondition<Boolean>(){
                public Boolean apply(WebDriver driver){
                    WebElement element=driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        }catch (TimeoutException e){
            logger.error("超时！！"+timeOut+"秒之后还没找到元素["+ by +"]");
            Assert.fail("超时！！"+timeOut+"秒之后还没找到元素["+ by +"]");
        }
        logger.info("找到了元素 ["+ by +"]");
    }

    public void mouse(WebElement element){
         action=new Actions(driver);
        action.moveToElement(element).perform();
    }
    public void mouseClick(WebElement element){
        action=new Actions(driver);
        action.moveToElement(element).click().perform();
    }
}
