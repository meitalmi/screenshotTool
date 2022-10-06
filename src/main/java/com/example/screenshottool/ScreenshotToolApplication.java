package com.example.screenshottool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenshotToolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScreenshotToolApplication.class, args);

        ITool tool = new ScreenshotTool();
        tool.run();
    }
}
