package pageHelper;

import org.apache.log4j.Logger;
import page.pageReplies;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/8.
 */
public class HelperRepliesPage {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);

    //点击“这是一个成语接龙游戏”发帖
    public static void clicklinkPost(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageReplies.LOGIN_LINK_POST));
    }

    //输入内容
    public static void sendText(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageReplies.REPLIES_LINK_TEXRARER),text);
    }
    //点击发布
    public static void clickTopicSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageReplies.REPLIES_BUTTON_POST));
    }


    public static void project(SeleniumUtil seleniumUtil,String text) {
        seleniumUtil.waitForElementLoad(pageReplies.LOGIN_LINK_POST,10);
        clicklinkPost(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageReplies.REPLIES_LINK_TEXRARER,10);
        sendText(seleniumUtil,text);
        seleniumUtil.waitForElementLoad(pageReplies.REPLIES_BUTTON_POST,10);
        clickTopicSubmit(seleniumUtil);






    }


}
