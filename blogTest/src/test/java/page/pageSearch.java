package page;

import org.openqa.selenium.By;

/**
 * Created by DELL on 2018/5/8.
 */
public class pageSearch {
    //找到顶部登录按钮
    public static final By LOGIN_LINK_LOGIN = By.linkText("登录");
    //找到用户名输入框
    public static final By LOGIN_INPUT_USERNAME = By.name("username");
    //找到密码输入框
    public static final By LOGIN_INPUT_PASSWORD =By.name("password");
    //提交按钮
    public static final By LOGIN_BUTTON_SUBMIT =By.className("submit");
    //找到搜索元素
    public static final By ELEMENT_SEARCH =By.linkText("搜索");
    //找到搜索输入框
    public static final By INPUT_SEARCH =By.name("srchtxt");
    //找到搜索按钮
    public static final By INPUT_SUBMIT_SEARCH =By.name("searchsubmit");
    //找到帖子
    public static final By FIND_POST =By.linkText("haotest");
    //找到标题
    public static final By FIND_POST_TITLE =By.tagName("h1");
    //找到顶部退出按钮
    public static final By LOGIN_LINK_SIGNOUT = By.linkText("退出");
    //
}
