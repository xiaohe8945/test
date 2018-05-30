package pageHelper;

import org.apache.log4j.Logger;
import page.pageDelete;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/8.
 */
public class HelperDeletePage {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);
    //选中帖子
    public static void choisePage(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageDelete.LOGIN_INPUT_CLICK));
    }
    //选中删除
    public static void choiseDelete(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageDelete.LOGIN_LINK_DELETE));
    }
    //输入删除原因
     public static void choiseDeleteText(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageDelete.DELETE_REASON_TEXTARER), text);
    }
    //提交
    public static void choiseAccept(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageDelete.INPUT_DELETE_SUBMIT));
    }
    //点击管理中心
    public static void clickAdmin(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageDelete.LOGIN_LINK_ADMIN));
    }
    //输入密码
    public static void sendpass(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageDelete.LOGIN_INPUT_NEWPASSWORD),password);
    }
    //点击提交
    public static void clickSub(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageDelete.ADMIN_BUTTON_SUBMIT));
    }
    //点击版块
    public static void clickBlack(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageDelete.ADMIN_BLACK_NAME));
    }
    //点击添加新版块
    public static void clicknewBlack(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageDelete.ADMIN_NEWBLACK_NAME));
    }
    //输入新版块名称
    public static void newBlack(SeleniumUtil seleniumUtil,String count){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageDelete.ADMIN_BLACK_INPUT),count);
    }
    //提交
    public static void submit(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageDelete.ADMIN_BUTTON_SESUBMIT));
    }

    public static void project(SeleniumUtil seleniumUtil,String password,String text,String count)  {
         seleniumUtil.waitForElementLoad(pageDelete.LOGIN_INPUT_CLICK,10);
        choisePage(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageDelete.LOGIN_LINK_DELETE,10);
        choiseDelete(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageDelete.DELETE_REASON_TEXTARER,10);
        choiseDeleteText(seleniumUtil, text);
         seleniumUtil.waitForElementLoad(pageDelete.INPUT_DELETE_SUBMIT,10);
        choiseAccept(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageDelete.LOGIN_LINK_ADMIN,10);
        clickAdmin(seleniumUtil);
        seleniumUtil.handles();
         seleniumUtil.waitForElementLoad(pageDelete.LOGIN_INPUT_NEWPASSWORD,10);
        sendpass(seleniumUtil, password);
        seleniumUtil.waitForElementLoad(pageDelete.ADMIN_BUTTON_SUBMIT,10);
        clickSub(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageDelete.ADMIN_BLACK_NAME,10);
        clickBlack(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageDelete.ADMIN_BLACK_IFRAME,10);
        seleniumUtil.iframe(seleniumUtil.getElement(pageDelete.ADMIN_BLACK_IFRAME));
        seleniumUtil.waitForElementLoad(pageDelete.ADMIN_NEWBLACK_NAME,10);
        clicknewBlack(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageDelete.ADMIN_BLACK_INPUT,10);
        newBlack(seleniumUtil,count);
        seleniumUtil.waitForElementLoad(pageDelete.ADMIN_BUTTON_SESUBMIT,10);
        submit(seleniumUtil);
        seleniumUtil.iframeTo();
    }


}
