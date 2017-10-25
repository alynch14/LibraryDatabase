/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarydatabase;

/**
 *
 * @author user
 */
public class Video extends MediaItem {
    private int yrReleased;
    private String genre;
    private String director;
    
    public Video(){
        super();
        yrReleased = 0;
        genre = null;
        director = null;
    }
    
    public Video(String g, String d, String t, int time, int yr, int id, int c){
        super(time, id, c, t);
        yrReleased = yr;
        genre = g;
        director = d;
    }
    
    public void set(String g, String d, String t, int time, int yr, int id, int c){
        super.set(time, id, c, t);
        yrReleased = yr;
        genre = g;
        director = d;
    }
    
    public int getYrReleased(){
        return yrReleased;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public String getDirector(){
        return director;
    }
    
    public boolean equals(Object o){
        if(o instanceof Video){
            Video v = (Video) o;
            return super.equals(v) && yrReleased == v.yrReleased && genre.equals(v.genre) && director.equals(v.director);
        }
        else
            return false;
    }
    
    public String toString(){
        return String.format(super.toString() + "Year Released: %d\nGenre: %s\nDirector: %s\n",yrReleased,genre,director);
    }
    
    public void print(){
        super.print();
        System.out.printf("Year Released: %d\nGenre: %s\nDirector: %s\n",yrReleased,genre,director);
    }
    
}
