package pageHelper;
import org.apache.log4j.Logger;
import page.pagePost;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/7.
 */
public class HelperPostPage {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);
    //点击发帖
     public static void clicklinkPost(SeleniumUtil seleniumUtil){
       seleniumUtil.newClick(seleniumUtil.getElement(pagePost.LOGIN_LINK_POST));
    }
    //输入标题
    public static void sendTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pagePost.LOGIN_INPUT_SUBJECT),title);
    }
    //输入内容
    public static void sendText(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pagePost.LOGIN_TEXTARER_MESSAGE),text);
    }
    //点击发布
    public static void clickTopicSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pagePost.LOGIN_BUTTON_POST));
    }

    public static void project(SeleniumUtil seleniumUtil,String title,String text){
        seleniumUtil.waitForElementLoad(pagePost.LOGIN_LINK_POST,10);
        clicklinkPost(seleniumUtil);
        seleniumUtil.waitForElementLoad(pagePost.LOGIN_INPUT_SUBJECT,10);
        sendTitle(seleniumUtil,title);
        seleniumUtil.waitForElementLoad(pagePost.LOGIN_TEXTARER_MESSAGE,10);
        sendText(seleniumUtil,text);
        seleniumUtil.waitForElementLoad(pagePost.LOGIN_BUTTON_POST,10);
        clickTopicSubmit(seleniumUtil);



    }

}
