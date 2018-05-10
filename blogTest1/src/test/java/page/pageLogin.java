package page;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/8.
 */
public class pageLogin {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);
    //找到顶部登录按钮
    public static final By LOGIN_LINK_LOGIN = By.linkText("登录");
    //找到用户名输入框
    public static final By LOGIN_INPUT_USERNAME = By.name("username");
    //找到密码输入框
    public static final By LOGIN_INPUT_PASSWORD =By.name("password");
    //提交按钮
    public static final By LOGIN_BUTTON_SUBMIT =By.className("submit");
    //找到默认板块元素
    public static final By LOGIN_LINK_PLATE =By.linkText("默认版块");
}
