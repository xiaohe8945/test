package testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by DELL on 2018/5/9.
 */
public class InitConfigData {
    public static String browserName;
    public static String Url;

    public static void main()throws IOException {
        Properties type = new Properties();
        InputStream team=new FileInputStream("./switchDriver");
        type.load(team);
        browserName=type.getProperty("browserName");
        Url=type.getProperty("severUrl");
    }



}
