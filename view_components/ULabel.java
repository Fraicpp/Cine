package Cine.view_components;

import Cine.control.ClickedListener;
import javax.swing.JLabel;


public class ULabel extends JLabel implements Clickable
{
    public String destFrame;
    public String type;
    
    public ULabel()
    {
        this.addMouseListener(new ClickedListener());
        destFrame = null;
        type = null;
    }

    public void setDestFrame(String destFrame)
    {
        this.destFrame = destFrame;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
    @Override
    public String getDestFrame()
    {
        return destFrame;
    }

    @Override
    public String getComponentType()
    {
        return type;
    }
    
    
}
