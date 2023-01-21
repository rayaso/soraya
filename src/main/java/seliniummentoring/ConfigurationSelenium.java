package seliniummentoring;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationSelenium {

    public static Properties prop;

    String path=System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"
            +File.separator+"resources"+File.separator+"prop.Properties";

public ConfigurationSelenium(){
    prop=new Properties();
    try {
        FileInputStream url=new FileInputStream(path);
        prop.load(url);
    }catch (IOException e){
        e.printStackTrace();
    }

}

public static String getUrl(){
    String url=prop.getProperty("url");
    if(url!=null){
        return url;
    }else {
        throw new RuntimeException("url does not has a value");
        }
    }
}



