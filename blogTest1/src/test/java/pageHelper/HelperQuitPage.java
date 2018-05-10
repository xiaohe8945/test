package pageHelper;


import org.apache.log4j.Logger;
import page.pageQuit;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/8.
 */
public class HelperQuitPage {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);
    //退出登录
    public static void clickSingOut(SeleniumUtil seleniumUtil) {
        seleniumUtil.newClick(seleniumUtil.getElement(pageQuit.LOGIN_LINK_SIGNOUT));
    }
    public static void project(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(pageQuit.LOGIN_LINK_SIGNOUT,10);
        clickSingOut(seleniumUtil);
    }
}
