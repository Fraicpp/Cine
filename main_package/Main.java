package main_package;

import control.ControlData;
import view.HomeFrame;
import javax.swing.*;
import java.awt.*;

public class Main 
{
    public static void main(String args[])
    {
         ControlData ctrlData = ControlData.getInstance();
         
         JFrame mainFrame= ctrlData.getFrameByName(ctrlData.getCurrFrame());
         mainFrame.setVisible(true);
    }
}
