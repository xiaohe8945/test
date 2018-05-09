package pageHelper;

import org.apache.log4j.Logger;
import page.pageLogin;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/9.
 */
public class HelperLoginPage {
    public static Logger logger= Logger.getLogger(SeleniumUtil.class);
    //点击登录
    public static void loginLinkLogin(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageLogin.LOGIN_LINK_LOGIN));
    }
    //跳转弹窗
    public static void switchToAlert(SeleniumUtil seleniumUtil,String username,String password){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageLogin.LOGIN_INPUT_USERNAME),username);
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageLogin.LOGIN_INPUT_PASSWORD),password);
    }
    //点击登录
    public static void clickLogin(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageLogin.LOGIN_BUTTON_SUBMIT));
    }
    //涮新页面
    public static void pageRefresh(SeleniumUtil seleniumUtil){
        seleniumUtil.refresh();
    }
    //点击默认板块
    public static void clickPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageLogin.LOGIN_LINK_PLATE));
    }


    public static void project(SeleniumUtil seleniumUtil, String username, String password) {
        seleniumUtil.waitForElementLoad(pageLogin.LOGIN_LINK_LOGIN, 10);
        HelperLoginPage.loginLinkLogin(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageLogin.LOGIN_INPUT_USERNAME, 10);
        seleniumUtil.waitForElementLoad(pageLogin.LOGIN_INPUT_PASSWORD, 10);
        seleniumUtil.waitForElementLoad(pageLogin.LOGIN_BUTTON_SUBMIT, 10);
        HelperLoginPage.switchToAlert(seleniumUtil, username, password);
        HelperLoginPage.clickLogin(seleniumUtil);
        HelperLoginPage.pageRefresh(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageLogin.LOGIN_LINK_PLATE, 10);
        HelperLoginPage.clickPlate(seleniumUtil);
    }
}