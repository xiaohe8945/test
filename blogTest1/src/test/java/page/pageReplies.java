package page;

import org.openqa.selenium.By;

/**
 * Created by DELL on 2018/5/8.
 */
public class pageReplies {

    //找到“这是一个成语接龙游戏”帖子
    public static final By LOGIN_LINK_POST =By.partialLinkText("这是一个");
    //找到回帖文本输入区域
    public static final By REPLIES_LINK_TEXRARER =By.id("fastpostmessage");
    //找到发表回复按钮
    public static final By REPLIES_BUTTON_POST =By.id("fastpostsubmit");


}
