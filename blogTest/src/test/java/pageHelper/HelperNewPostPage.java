package pageHelper;

import org.apache.log4j.Logger;
import page.pageNewPost;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/8.
 */
public class HelperNewPostPage {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);
    //点击登录
    public static void loginLinkLogin(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageNewPost.LOGIN_LINK_LOGIN));
    }
    //跳转弹窗
    public static void switchToAlert(SeleniumUtil seleniumUtil,String username,String password){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageNewPost.LOGIN_INPUT_USERNAME),username);
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageNewPost.LOGIN_INPUT_PASSWORD),password);
    }
    //点击登录
    public static void clickLogin(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageNewPost.LOGIN_BUTTON_SUBMIT));
    }
    //涮新页面
    public static void pageRefresh(SeleniumUtil seleniumUtil){
        seleniumUtil.refresh();
    }
    //点击新版块
    public static void clickPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageNewPost.LOGIN_LINK_PLATE));
    }
    //点击发帖
    public static void clicklinkPost(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageNewPost.LOGIN_LINK_POST));
    }
    //输入标题
    public static void sendTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageNewPost.LOGIN_INPUT_SUBJECT),title);
    }
    //输入内容
    public static void sendText(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageNewPost.LOGIN_TEXTARER_MESSAGE),text);
    }
    //点击发布
    public static void clickTopicSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageNewPost.LOGIN_BUTTON_POST));
    }
    //退出登录
    public static void clickSingOut(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageNewPost.LOGIN_LINK_SIGNOUT));
    }

    public static void project(SeleniumUtil seleniumUtil,String username,String password,String title,String text) {
        loginLinkLogin(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageNewPost.LOGIN_INPUT_USERNAME,10);
        seleniumUtil.waitForElementLoad(pageNewPost.LOGIN_INPUT_PASSWORD,10);
        switchToAlert(seleniumUtil,username,password);
        seleniumUtil.waitForElementLoad(pageNewPost.LOGIN_BUTTON_SUBMIT,10);
        clickLogin(seleniumUtil);
        pageRefresh(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageNewPost.LOGIN_LINK_PLATE,10);
        clickPlate(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageNewPost.LOGIN_LINK_POST,10);
        clicklinkPost(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageNewPost.LOGIN_INPUT_SUBJECT,10);
        sendTitle(seleniumUtil,title);
        seleniumUtil.waitForElementLoad(pageNewPost.LOGIN_TEXTARER_MESSAGE,10);
        sendText(seleniumUtil,text);
        seleniumUtil.waitForElementLoad(pageNewPost.LOGIN_BUTTON_POST,10);
        clickTopicSubmit(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageNewPost.LOGIN_LINK_SIGNOUT,10);
        clickSingOut(seleniumUtil);


    }
}
