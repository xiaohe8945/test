package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperNewPostPage;


/**
 * Created by DELL on 2018/5/8.
 */
public class NewPost extends BasicTestCase {
    @Test
    public void login_Newpost() throws InterruptedException {
        HelperNewPostPage.project(seleniumUtil,"test","1234","这是一个成语接龙游戏","为所欲为，为所欲为.......");
    }
}
