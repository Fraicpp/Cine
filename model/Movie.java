package Cine.model;

import java.util.ArrayList;

public class Movie {
 private String heirarchy;
    private String title;
    private String description;
    private String rating;
    private String parentalGuidance;
    private String genre;
    private String schedule;
    
    //constructor
    public Movie(ArrayList<String> infos){
        this.heirarchy = infos.get(0);
        this.title = infos.get(1);
        this.description = infos.get(2);
        this.rating = infos.get(3);
        this.parentalGuidance = infos.get(4);
        this.genre = infos.get(5);
        this.schedule = infos.get(6);
    }
   
    public String getHeirarchy(){
        return heirarchy;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getRating(){
        return rating;
    }
    public String getParentalGuidance(){
        return parentalGuidance;
    }
    public String getGenre(){
        return genre;
    }
    public String getSchedule(){
        return schedule;
    }    
    @Override
    public String toString() {
        return "Heirarchy: " + heirarchy + 
               "\nTitle: " + title + 
               "\nDescription: " + description + 
               "\nRating: " + rating + 
               "\nParental Guidance: " + parentalGuidance + 
               "\nGenre: " + genre + 
               "\nSchedule: " + schedule + "\n";
    }    
}
