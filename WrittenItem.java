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
public abstract class WrittenItem extends Item {
    private String author;
    
    public WrittenItem(){
        super();
        author = null;
    }
    
    public WrittenItem(int id, int c, String a, String t){
        super(id,c,t);
        author = a;
    }
    
    public void set(String a, int id, int c, String t){
        super.set(id, c, t);
        author = a;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public boolean equals(Object o){
        
        if(o instanceof WrittenItem){
            WrittenItem b = (WrittenItem) o;
            return b.author.equals(author) && super.equals(b);
        }
        else
            return false;
    }
    
    public void print(){
        super.print();
        System.out.printf("Author: %s\n",author);
    }
    
    public String toString(){
        return String.format(super.toString() + "Author: %s\n",author);
    }
    
}
