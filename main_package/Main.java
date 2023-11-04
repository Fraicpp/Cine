package Cine.main_package;

import Cine.control.ControlData;
import javax.swing.*;

public class Main 
{
    public static void main(String args[])
    {
         ControlData ctrlData = ControlData.getInstance();
         
         JFrame mainFrame= ctrlData.getFrameByName(ctrlData.getCurrFrame());
         mainFrame.setVisible(true);
    }
}
