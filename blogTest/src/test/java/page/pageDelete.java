package page;

import org.openqa.selenium.By;

/**
 * Created by DELL on 2018/5/8.
 */
public class pageDelete {
    //找到帖子选中框
    public static final By LOGIN_INPUT_CLICK =By.name("moderate[]");
    //找到删除元素
    public static final By LOGIN_LINK_DELETE =By.linkText("删除");
    //找到删除原因输入框
    public static final By DELETE_REASON_TEXTARER =By.id("reason");
    //找到确定按钮
    public static final By INPUT_DELETE_SUBMIT =By.name("modsubmit");
    //找到管理中心
    public static final By LOGIN_LINK_ADMIN =By.linkText("管理中心");
    //找到跳转页面密码输入框
    public static final By LOGIN_INPUT_NEWPASSWORD =By.name("admin_password");
    //找到提交按钮
    public static final By ADMIN_BUTTON_SUBMIT =By.name("submit");
    //找到板块
    public static final By ADMIN_BLACK_NAME =By.linkText("版块");
    //找到iframe标签
    public static final By ADMIN_BLACK_IFRAME=By.id("main");
    //找到板块
    public static final By ADMIN_NEWBLACK_NAME =By.linkText("添加新版块");
    //找到新版块命名输入框
    public static final By ADMIN_BLACK_INPUT =By.name("newforum[1][]");
    //找到提交按钮
    public static final By ADMIN_BUTTON_SESUBMIT =By.name("editsubmit");


}
