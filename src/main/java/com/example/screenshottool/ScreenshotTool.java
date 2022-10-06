package com.example.screenshottool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.awt.*;
import java.awt.image.BufferedImage;


public class ScreenshotTool implements ITool {

    @Override
    public synchronized void run() {
        try {
            saveImage(getScreenShot());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getScreenShot() throws Exception {
        BufferedImage shot = null;
        System.out.println(ApplicationProperties.getInstance().getProperty("mytool.name"));
//        try {
//            shot = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//        } catch (HeadlessException e1) {
//            e1.printStackTrace();
//        } catch (AWTException e1) {
//            e1.printStackTrace();
//        }
        return shot;
    }

    public void saveImage(BufferedImage image) {
    }
}