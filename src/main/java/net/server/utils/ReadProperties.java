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
            File appFile = new File(System.getProperty("user.dir") + "/TS3Bot/app.properties");
            File appDefFile = new File(System.getProperty("user.dir") + "/TS3Bot/app.default.properties");
            if (appFile.exists()) {
                prop.load(new FileInputStream(System.getProperty("user.dir") + "/TS3Bot/app.properties"));
            } else if (appDefFile.exists()) {
                prop.load(new FileInputStream(System.getProperty("user.dir") + "/TS3Bot/app.default.properties"));
            } else {
                System.out.println("No properties file found!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String propertyKey) {
        return prop.getProperty(propertyKey);
    }
}
