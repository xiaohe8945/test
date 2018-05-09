package page;

import org.openqa.selenium.By;

/**
 * Created by DELL on 2018/5/8.
 */
public class pageNewPost {
    //找到顶部登录按钮
    public static final By LOGIN_LINK_LOGIN = By.linkText("登录");
    //找到用户名输入框
    public static final By LOGIN_INPUT_USERNAME = By.name("username");
    //找到密码输入框
    public static final By LOGIN_INPUT_PASSWORD =By.name("password");
    //提交按钮
    public static final By LOGIN_BUTTON_SUBMIT =By.className("submit");
    //找到新的块元素
    public static final By LOGIN_LINK_PLATE =By.linkText("hello world");
    //发帖按钮
    public static final By LOGIN_LINK_POST =By.linkText("发帖");
    //标题框
    public static final By LOGIN_INPUT_SUBJECT = By.name("subject");
    //帖子内容输入框
    public static final By LOGIN_TEXTARER_MESSAGE = By.name("message");
    //发布帖子按钮
    public static final By LOGIN_BUTTON_POST = By.name("topicsubmit");
    //找到顶部退出按钮
    public static final By LOGIN_LINK_SIGNOUT = By.linkText("退出");
}
