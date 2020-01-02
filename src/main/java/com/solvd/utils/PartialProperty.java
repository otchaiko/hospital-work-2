package com.solvd.utils;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PartialProperty {

    private static final Logger LOGGER = Logger.getLogger(PartialProperty.class);

    public static String readProperty(String key) {
        String result = null;
        FileInputStream fis;
        Properties property = new Properties();
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
            result = property.getProperty(key);
        } catch (IOException e) {
            LOGGER.error("Error, File is not exist!");
        }
        return result;
    }
}
