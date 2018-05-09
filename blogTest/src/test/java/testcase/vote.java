package testcase;

import org.testng.annotations.Test;
import pageHelper.HeloerVotePage;
import pageHelper.HelperLoginPage;
import pageHelper.HelperQuitPage;

/**
 * Created by DELL on 2018/5/9.
 */
public class vote extends BasicTestCase {
    @Test
    public void VoteTest(){
        HelperLoginPage.project(seleniumUtil,"admin","admin");
        HeloerVotePage.project(seleniumUtil,"成语接龙","心心相印","水滴石穿","成语接龙");
        HelperQuitPage.project(seleniumUtil);
    }
}
