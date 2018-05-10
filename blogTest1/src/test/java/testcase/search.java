package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperSearchPage;
import util.SeleniumUtil;

/**
 * Created by DELL on 2018/5/8.
 */
public class search extends BasicTestCase{

    @Test
     public void searchPost(){
        HelperSearchPage.project(seleniumUtil,"test","1234","haotest");
     }
}
