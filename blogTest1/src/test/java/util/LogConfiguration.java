package util;
import org.apache.log4j.PropertyConfigurator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by DELL on 2018/5/7.
 */
public class LogConfiguration {
    public static void initLog() {
        //实例化并设置时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String data = simpleDateFormat.format(new Date());
        //设置日志导出地址和名称
        final String logFile = "./Log/" + data + ".log";
        //实例化一个属性集
        Properties propertie = new Properties();
        propertie.setProperty("log4j.rootLogger","info,toConsole,toFile");
        propertie.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        propertie.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        propertie.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        propertie.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        propertie.setProperty("log4j.appender.toFile.file",logFile);
        propertie.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        propertie.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        PropertyConfigurator.configure(propertie);

    }
}
