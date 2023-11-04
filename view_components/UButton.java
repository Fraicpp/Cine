package view_components;

import control.ClickedListener;
import javax.swing.JButton;


public class UButton extends JButton implements Clickable
{
    public String destFrame;
    public String type;
    
    public UButton()
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
