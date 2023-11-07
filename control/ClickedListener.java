package Cine.control;
        
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Cine.view_components.Clickable;

public class ClickedListener extends MouseAdapter
{

    @Override
    public void mouseClicked(MouseEvent e)
    {
        Object source = e.getSource();
        
        if (source instanceof Clickable)
        {
            Clickable component = (Clickable) source;   //Component that triggered the event
            
            ControlData ctrlData = ControlData.getInstance();

            
            //Determine destFrame
            String destFrame = "";
            if (component.getComponentType().equals("next"))
            {
                destFrame = ctrlData.getNextFrame();
            }
            else if (component.getComponentType().equals("back"))
            {
                if (!ctrlData.getPrevFrame().isBlank())
                {
                    destFrame = ctrlData.getPrevFrame();
                }
            }
            else
            {
                 destFrame = component.getDestFrame();
            }
            
            ControlFrame.changeFrame(destFrame);
        }
        else
        {
            System.out.println("Mouse clicked is not a Clickable");
        }
        
    }
    
}