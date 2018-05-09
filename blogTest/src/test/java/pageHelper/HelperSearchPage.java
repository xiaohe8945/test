package pageHelper;

import org.apache.log4j.Logger;
import page.pageSearch;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/8.
 */
public class HelperSearchPage {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);
    //点击登录
    public static void loginLinkLogin(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageSearch.LOGIN_LINK_LOGIN));
    }
    //跳转弹窗
    public static void switchToAlert(SeleniumUtil seleniumUtil,String username,String password){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageSearch.LOGIN_INPUT_USERNAME),username);
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageSearch.LOGIN_INPUT_PASSWORD),password);
    }
    //点击登录
    public static void clickLogin(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageSearch.LOGIN_BUTTON_SUBMIT));
    }
    //涮新页面
    public static void pageRefresh(SeleniumUtil seleniumUtil){
        seleniumUtil.refresh();
    }

    //点击搜索
    public static void search(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageSearch.ELEMENT_SEARCH));
    }
    //输入搜索内容
    public static void searchText(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageSearch.INPUT_SEARCH),text);
    }
   //点击搜索
    public static void searchOperations(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageSearch.INPUT_SUBMIT_SEARCH));
    }
   //点击搜索出来的帖子
   public static void searchPost(SeleniumUtil seleniumUtil){
       seleniumUtil.newClick(seleniumUtil.getElement(pageSearch.FIND_POST));
   }
   //获取标题内容
   public static void getTitleText(SeleniumUtil seleniumUtil,String test){
       seleniumUtil.assertForText(seleniumUtil.getText(seleniumUtil.getElement(pageSearch.FIND_POST_TITLE)),test);
   }
    //退出登录
    public static void clickSingOut(SeleniumUtil seleniumUtil) {
        seleniumUtil.newClick(seleniumUtil.getElement(pageSearch.LOGIN_LINK_SIGNOUT));
    }

    public static void project(SeleniumUtil seleniumUtil,String username,String password,String text){
        seleniumUtil.waitForElementLoad(pageSearch.LOGIN_LINK_LOGIN,10);
        HelperSearchPage.loginLinkLogin(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageSearch.LOGIN_INPUT_USERNAME,10);
        seleniumUtil.waitForElementLoad(pageSearch.LOGIN_INPUT_PASSWORD,10);
        seleniumUtil.waitForElementLoad(pageSearch.LOGIN_BUTTON_SUBMIT,10);
        HelperSearchPage.switchToAlert(seleniumUtil,username,password);
        HelperSearchPage.clickLogin(seleniumUtil);
        HelperSearchPage.pageRefresh(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageSearch.ELEMENT_SEARCH,10);
        HelperSearchPage.search(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageSearch.INPUT_SEARCH,10);
        seleniumUtil.waitForElementLoad(pageSearch.INPUT_SUBMIT_SEARCH,10);
        HelperSearchPage.searchText(seleniumUtil,text);
        HelperSearchPage.searchOperations(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageSearch.FIND_POST,10);
        HelperSearchPage.searchPost(seleniumUtil);
        seleniumUtil.handles();
        seleniumUtil.waitForElementLoad(pageSearch.FIND_POST_TITLE,10);
        HelperSearchPage.getTitleText(seleniumUtil,text);
        seleniumUtil.waitForElementLoad(pageSearch.LOGIN_LINK_SIGNOUT,10);
        HelperSearchPage.clickSingOut(seleniumUtil);
    }

}
