package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperDeletePage;
import pageHelper.HelperLoginPage;
import pageHelper.HelperQuitPage;


/**
 * Created by DELL on 2018/5/8.
 */
public class delete extends BasicTestCase{
    @Test
    public void delete_post() throws InterruptedException {
        HelperLoginPage.project(seleniumUtil,"admin","admin");
        HelperDeletePage.project(seleniumUtil,"admin","内容不符合规定","hello world");
        HelperQuitPage.project(seleniumUtil);
    }
}
