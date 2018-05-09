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

    public static void project(SeleniumUtil seleniumUtil,String username,String password,String title,String text) throws InterruptedException {
        HelperNewPostPage.loginLinkLogin(seleniumUtil);
        Thread.sleep(3000);
        HelperNewPostPage.switchToAlert(seleniumUtil,username,password);
        HelperNewPostPage.clickLogin(seleniumUtil);
        HelperNewPostPage.pageRefresh(seleniumUtil);
        Thread.sleep(3000);
        HelperNewPostPage.clickPlate(seleniumUtil);
        Thread.sleep(3000);
        HelperNewPostPage.clicklinkPost(seleniumUtil);
        HelperNewPostPage.sendTitle(seleniumUtil,title);
        HelperNewPostPage.sendText(seleniumUtil,text);
        HelperNewPostPage.clickTopicSubmit(seleniumUtil);
        Thread.sleep(3000);
        HelperNewPostPage.clickSingOut(seleniumUtil);


    }
}
