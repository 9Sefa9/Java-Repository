
// Java program to demonstrate working of Robot 
// class. This program is for Windoes. It opens 
// notepad and types a message. 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.*;
import java.io.*;

public class robo {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        // String command = "notepad.exe";
        // Runtime run = Runtime.getRuntime();
        // run.exec(command);
        try {
            Robot bot = new Robot();
            Thread.sleep(10000);
            while (true) {
                Thread.sleep(1000);
                bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Create an instance of Robot class

        // robot.keyPress(KeyEvent.VK_H);
        // try {
        // Thread.sleep(500);
        // } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

    }
}