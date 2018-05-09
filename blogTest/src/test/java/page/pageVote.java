package page;

import org.openqa.selenium.By;

/**
 * Created by DELL on 2018/5/8.
 */
public class pageVote {
    //找到发帖元素
    public static final By PUBLISH_FVOTE = By.linkText("发帖");
    public static final By PUBLISH_VOTE = By.linkText("发布投票");
    //找到title输入框元素
    public static final By INPUT_TITLE = By.name("subject");
    //找到选项元素
    public static final By INPUT_VOTE = By.name("polloption[]");
    //找到帖子内容输入框
    public static final By INPUT_TEXTARER = By.name("message");
    //找到发表按钮
    public static final By POST_SUBMIT = By.id("postsubmit");
    //选中第二个选项
    public static final By BUTTON_REDIO= By.id("option_2");
    //找到提交元素
    public static final By POLL_SUBMIT= By.id("pollsubmit");
    //找到选项全部元素
    public static final By POLL_OPPTION_VOTE= By.xpath("/html/body/div[7]/div[2]/div/table/tbody/tr[1]/td[2]/div[3]/div[4]/form/div[2]/table/tbody");
    //找到title标签
    public static final By TITLE_NAME= By.tagName("h1");




}
