package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {

    public static String getPropertiesLimit(String property) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/application.properties"));
        return properties.getProperty(property);
    }
}
