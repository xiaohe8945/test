package page;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/8.
 */
public class pageQuit {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);
    //找到顶部退出按钮
    public static final By LOGIN_LINK_SIGNOUT = By.linkText("退出");
}
