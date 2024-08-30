package com.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfig {

    private Properties properties;
    private static PropertiesConfig instance;

    PropertiesConfig() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config/test-config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropertiesConfig getInstance() {
        if (instance == null) {
            instance = new PropertiesConfig();
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
