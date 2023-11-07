package Cine.view_components;

import Cine.control.ClickedListener;
import javax.swing.JLabel;


public class UMovieLabel extends ULabel
{
    private String movieTitle;
    
    public UMovieLabel()
    {
        super();
        movieTitle = "";
    }

    public void setMovieTitle(String movieTitle)
    {
        this.movieTitle = movieTitle;
    }

    
    public String getMovieTitle()
    {
        return movieTitle;
    }
    
    
}
