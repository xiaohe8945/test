package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.InitConfigData;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/7.
 */
public class BasicTestCase {
    public WebDriver driver=null;
    SeleniumUtil seleniumUtil=null;
    @BeforeMethod
    public void setUp(){
        LogConfiguration.initLog();
        seleniumUtil=new SeleniumUtil();
        driver = seleniumUtil.getDriver(InitConfigData.browserName);
        seleniumUtil.url("http:\\127.0.0.1:8086\\boke");
    }

    @AfterMethod
    public void clearDown(){

        driver.quit();
    }


}
