package pageHelper;

import org.apache.log4j.Logger;
import page.pageAdmin;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/8.
 */
public class HelperDeletePage {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);
    //选中帖子
    public static void choisePage(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageAdmin.LOGIN_INPUT_CLICK));
    }
    //选中删除
    public static void choiseDelete(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageAdmin.LOGIN_LINK_DELETE));
    }
    //输入删除原因
     public static void choiseDeleteText(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageAdmin.DELETE_REASON_TEXTARER),text);
    }
    //提交
    public static void choiseAccept(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageAdmin.INPUT_DELETE_SUBMIT));
    }
    //点击管理中心
    public static void clickAdmin(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageAdmin.LOGIN_LINK_ADMIN));
    }
    //输入密码
    public static void sendpass(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageAdmin.LOGIN_INPUT_NEWPASSWORD),password);
    }
    //点击提交
    public static void clickSub(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageAdmin.ADMIN_BUTTON_SUBMIT));
    }
    //点击版块
    public static void clickBlack(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageAdmin.ADMIN_BLACK_NAME));
    }
    //点击添加新版块
    public static void clicknewBlack(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageAdmin.ADMIN_NEWBLACK_NAME));
    }
    //输入新版块名称
    public static void newBlack(SeleniumUtil seleniumUtil,String count){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageAdmin.ADMIN_BLACK_INPUT),count);
    }
    //提交
    public static void submit(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageAdmin.ADMIN_BUTTON_SESUBMIT));
    }

    public static void project(SeleniumUtil seleniumUtil,String password,String text,String count)  {
         seleniumUtil.waitForElementLoad(pageAdmin.LOGIN_INPUT_CLICK,10);
        HelperDeletePage.choisePage(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageAdmin.LOGIN_LINK_DELETE,10);
        HelperDeletePage.choiseDelete(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageAdmin.DELETE_REASON_TEXTARER,10);
        HelperDeletePage.choiseDeleteText(seleniumUtil, text);
         seleniumUtil.waitForElementLoad(pageAdmin.INPUT_DELETE_SUBMIT,10);
        HelperDeletePage.choiseAccept(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageAdmin.LOGIN_LINK_ADMIN,10);
        HelperDeletePage.clickAdmin(seleniumUtil);
        seleniumUtil.handles();
         seleniumUtil.waitForElementLoad(pageAdmin.LOGIN_INPUT_NEWPASSWORD,10);
        HelperDeletePage.sendpass(seleniumUtil, password);
        seleniumUtil.waitForElementLoad(pageAdmin.ADMIN_BUTTON_SUBMIT,10);
        HelperDeletePage.clickSub(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageAdmin.ADMIN_BLACK_NAME,10);
        HelperDeletePage.clickBlack(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageAdmin.ADMIN_BLACK_IFRAME,10);
        seleniumUtil.iframe(seleniumUtil.getElement(pageAdmin.ADMIN_BLACK_IFRAME));
        seleniumUtil.waitForElementLoad(pageAdmin.ADMIN_NEWBLACK_NAME,10);
        HelperDeletePage.clicknewBlack(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageAdmin.ADMIN_BLACK_INPUT,10);
        HelperDeletePage.newBlack(seleniumUtil,count);
        seleniumUtil.waitForElementLoad(pageAdmin.ADMIN_BUTTON_SESUBMIT,10);
        HelperDeletePage.submit(seleniumUtil);
        seleniumUtil.iframeTo();
    }


}
