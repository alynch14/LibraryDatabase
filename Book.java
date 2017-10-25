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
public class Book extends WrittenItem {
    public Book(){
        super();
    }
    
    public Book(int id, int c, String t, String a){
        super(id, c, a, t);
    }
    

}
