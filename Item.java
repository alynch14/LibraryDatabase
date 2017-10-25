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
public abstract class Item {
    private int idNumber;
    private String title;
    private int copies;
    
    public Item(){
        idNumber = 0;
        title = null;
        copies = 0;
    }
    
    public Item(int id, int c, String t){
        idNumber = id;
        copies = c;
        title = t;
    } 
    
    public void set(int id, int c, String t){
        idNumber = id;
        copies = c;
        title = t;
    }
    
    public int getIDNumber(){
        return idNumber;
    }
    
    public int getCopies(){
        return copies;
    }
    
    public String getTitle(){
        return title;
    }
            
    public boolean equals(Object o){
        if(o instanceof Item){
            Item b = (Item) o;
            return b.copies == copies && b.idNumber == idNumber && b.title.equals(title);
        }
        else
            return false;
    }
    
    public String toString(){
       return String.format("Title: %s\nID Number: %d\nNumber of copies: %d\n", title, idNumber, copies); 
    }
            
    public void print(){
        System.out.printf("Display info about a book\nID: %d\nTitle: %s\nNumber of Copies: %d\n", idNumber, title, copies);
    }
    
    public void checkOut(){
        if(copies == 0)
            System.out.println("Sorry, there are no more copies of that book left to check out.");
        else
            copies--;
    }
    
    public void checkIn(){
        copies++;
    }
    
    public void addItem(int id){
        if(id == idNumber)
            copies++;
        else
            System.out.println("Error, cannot find match!");
    }
    
}
