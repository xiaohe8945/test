package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperQuitPage;
import pageHelper.HelperRepliesPage;

/**
 * Created by DELL on 2018/5/7.
 */
public class Replies extends BasicTestCase {
    @Test
    public void Replies_post() throws InterruptedException {
        HelperLoginPage.project(seleniumUtil,"test","1234");
        HelperRepliesPage.project(seleniumUtil,"好一个成语接龙游戏");
        HelperQuitPage.project(seleniumUtil);
    }
}
