package net.server.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    private Properties prop;

    public ReadProperties() {
        try {
            prop = new Properties();
            FileInputStream app = new FileInputStream(System.getProperty("user.dir") + "/TS3Bot/app.properties");
            if (app.available() > 0) {
                prop.load(app);
            } else {
                FileInputStream appDefault = new FileInputStream(System.getProperty("user.dir") + "/TS3Bot/app.default.properties");
                if (appDefault.available() > 0) {
                    prop.load(appDefault);
                } else {
                    System.out.println("No properties file found!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String propertyKey) {
        return prop.getProperty(propertyKey);
    }
}
