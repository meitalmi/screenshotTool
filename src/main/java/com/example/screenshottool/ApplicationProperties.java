package com.example.screenshottool;

import java.io.FileInputStream;
import java.util.Properties;

public class ApplicationProperties {
    private static Properties instance;

    private ApplicationProperties() throws Exception {
        instance = new Properties();
        instance.load(new FileInputStream("application.properties"));
    }

    public static Properties getInstance() throws Exception {
        if (instance == null) new ApplicationProperties();
        return instance;
    }
}
