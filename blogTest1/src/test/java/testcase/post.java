package testcase;
import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPostPage;
import pageHelper.HelperQuitPage;
/**
 * Created by DELL on 2018/5/7.
 */
public class post extends BasicTestCase {
    @Test
    public void postTest() throws InterruptedException {
        HelperLoginPage.project(seleniumUtil,"test","1234");
        HelperPostPage.project(seleniumUtil," haotest","为所欲为，为所欲为.......");
        HelperQuitPage.project(seleniumUtil);
    }

}
