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
public class CD extends MediaItem {
    private String artist;
    private String genre;
    
    public CD(){
        super();
        artist = null;
        genre = null;
    }
    
    public CD(String a, String g, String t, int time, int id, int c){
        super(time, id, c, t);
        artist = a;
        genre = g;
    }
    
    public void set(String a, String g, String t, int time, int id, int c){
        super.set(time, id, c, t);
        artist = a;
        genre = g;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public boolean equals(Object o){
        if(o instanceof CD){
            CD c = (CD) o;
            return super.equals(c) && artist.equals(c.artist) && genre.equals(c.genre);
        }
        else
            return false;
    }
    
    public String toString(){
        return String.format(super.toString() + "Artist: %s\nGenre: %s\n", artist, genre);
    }
    
    public void print(){
        super.print();
        System.out.printf("Artist: %s\nGenre: %s\n", artist, genre);
    }
}
