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
public abstract class MediaItem extends Item {
    private int runtime;
    
    public MediaItem(){
        super();
        runtime = 0;
    }
    
    public MediaItem(int time, int id, int c, String t){
        super(id,c,t);
        runtime = time;
    }
    
    public void set(int time, int id, int c, String t){
        super.set(id,c,t);
        runtime = time;
    }
    
    public int getRuntime(){
        return runtime;
    }
    
    public boolean equals(Object o){
        if(o instanceof MediaItem){
            MediaItem m = (MediaItem) o;
            return super.equals(m);
        }
        else
            return false;
    }
    
    public String toString(){
        return String.format(super.toString() + "Run Time: %d\n", runtime);
    }
    
    public void print(){
        super.print();
        System.out.printf("Run Time: %d\n", runtime);
    }
    
    
}
