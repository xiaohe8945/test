package pageHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import page.pageVote;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/8.
 */
public class HeloerVotePage {
    public static Logger logger=Logger.getLogger(SeleniumUtil.class);
    public static void publishVoit(SeleniumUtil seleniumUtil){
        seleniumUtil.mouse(seleniumUtil.getElement(pageVote.PUBLISH_FVOTE));
    }
    public static void publishVoit1(SeleniumUtil seleniumUtil){
        seleniumUtil.mouseClick(seleniumUtil.getElement(pageVote.PUBLISH_VOTE));
    }
    public static void title(SeleniumUtil seleniumUtil, String text){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageVote.INPUT_TITLE),text);
    }
    public static void voteChiose(SeleniumUtil seleniumUtil,String count){
         int i=1;
        for(WebElement vote:seleniumUtil.getElements(pageVote.INPUT_VOTE)){
           if(i<=5) {
               vote.sendKeys(count + i);
               i++;
           }else{
               break;
           }
        }
    }
    public static void postText(SeleniumUtil seleniumUtil,String article){
        seleniumUtil.sendKeys(seleniumUtil.getElement(pageVote.INPUT_TEXTARER),article);
    }
    public static void postSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageVote.POST_SUBMIT));
    }
    public static void postRedio(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageVote.BUTTON_REDIO));
    }
    public static void pollSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.newClick(seleniumUtil.getElement(pageVote.POLL_SUBMIT));
    }
    public static void getOpptionvalue(SeleniumUtil seleniumUtil){
        seleniumUtil.getText(seleniumUtil.getElement(pageVote.POLL_OPPTION_VOTE));
    }
    public static void getTitlevalue(SeleniumUtil seleniumUtil,String value){
        seleniumUtil.assertForText(seleniumUtil.getText(seleniumUtil.getElement(pageVote.TITLE_NAME)),value);
    }
    public static void project(SeleniumUtil seleniumUtil,String text,String count,String article,String value){
        seleniumUtil.waitForElementLoad(pageVote.PUBLISH_FVOTE,10);
        publishVoit(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageVote.PUBLISH_VOTE,10);
        publishVoit1(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageVote.INPUT_TITLE,10);
        title(seleniumUtil,text);
        seleniumUtil.waitForElementLoad(pageVote.INPUT_VOTE,10);
        voteChiose(seleniumUtil,count);
        seleniumUtil.waitForElementLoad(pageVote.INPUT_TEXTARER,10);
        postText(seleniumUtil,article);
        seleniumUtil.waitForElementLoad(pageVote.POST_SUBMIT,10);
        postSubmit(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageVote.BUTTON_REDIO,10);
        postRedio(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageVote.POLL_SUBMIT,10);
        pollSubmit(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageVote.POLL_OPPTION_VOTE,10);
        getOpptionvalue(seleniumUtil);
        seleniumUtil.waitForElementLoad(pageVote.TITLE_NAME,10);
        getTitlevalue(seleniumUtil,value);

    }


}
