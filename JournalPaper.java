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
public class JournalPaper extends WrittenItem {
    private int yearPublished;
    
    public JournalPaper(){
        super();
        yearPublished = 0;
    }
    
    public JournalPaper(int id, int c, String t, String a, int yr){
        super(id,c,t,a);
        yearPublished = yr;
    }
    
    public boolean equals(Object o){
        if(o instanceof JournalPaper){
            JournalPaper p = (JournalPaper) o;
            return super.equals(p) && yearPublished == p.yearPublished;
        }
        else
            return false;
    }
    
    public String toString(){
        return String.format(super.toString() + "Year Published: %s\n",yearPublished);
    }
    
    public void print(){
        super.print();
        System.out.printf("Year Published: %s\n",yearPublished);
    }
    
    public int getYrPublished(){
        return yearPublished;
    }
    
    public void set(int id, int c, String t, String a, int yr){
        super.set(a,id,c,t);
        yearPublished = yr;
    }
}
