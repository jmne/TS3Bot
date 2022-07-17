package net.server.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    private Properties prop;

    public ReadProperties() {
        try {
            prop = new Properties();
            prop.load(new FileInputStream("app.default.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String propertyKey) {
        return prop.getProperty(propertyKey);
    }
}
