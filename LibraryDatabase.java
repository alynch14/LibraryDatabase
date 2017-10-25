/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarydatabase;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LibraryDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book(4536,10,"The Shining","Stephen King");
        Book b3 = new Book(8645,6,"Pet Cemetery","Stephen King");
        JournalPaper jp1 = new JournalPaper();
        JournalPaper jp2 = new JournalPaper(8521,5,"Carrie","Stephen King",1972);
        Video v1 = new Video();
        Video v2 = new Video("Cartoon","GameFreak","Pokemon: The Movie",126,1997,5641,9);
        CD c1 = new CD();
        CD c2 = new CD("Weezer","Alternative","Pinkerton",33,8745,4);
        int choice;
        int item;
        Scanner input = new Scanner(System.in);
        
        System.out.println("The current list of items registered in the library are: ");
        b2.print();
        b3.print();
        jp2.print();
        v2.print();
        c2.print();
        choice = getInt(input,"Your options for items in the library are:\n" +
                            "----------------------------------------\n" + 
                            "1) Set item information\n"+ 
                            "2) Print item info\n" + 
                            "3) Check item in\n" + 
                            "4) Check-out item\n" +
                            "5) Add item\n" + 
                            "6) Test for equality\n" + 
                            "0) EXIT\n" +
                            "Please enter your option:");
        
        while(choice !=0){
            int num;
            int id;
            String a;
            String t;
            int c;
            
            switch(choice){
                case 1:
                    item = getInt(input, "Please select which type of item you wish to work with:\n" +
                            "----------------------------------------\n" +
                            "1) Book\n2) Journal Paper\n3) Video\n4) CD\n");
                    switch(item){
                        case 1:
                            System.out.println("Please enter the information of your book (author, id, copies, title): ");
                            a = input.next();
                            id = getInt(input, " ");
                            c = getInt(input, " ");
                            t = input.nextLine();
                            b1.set(a, id,c,t);
                            System.out.println("Is this information correct:\n" + b1);
                            break;
                            
                        case 2:
                            System.out.println("Please enter the information of your journal paper (id, copies, title, author, years): ");
                            jp1.set(getInt(input, null),getInt(input,null),input.nextLine(),input.nextLine(),getInt(input,null));
                            System.out.println("Is this information correct:\n" + jp1);
                            break;
                            
                        case 3:
                            System.out.println("Please enter the information of your video (genre, director, title, length, year, id, copies");
                            v1.set(input.nextLine(),input.nextLine(),input.nextLine(),getInt(input,null),getInt(input,null),getInt(input,null),getInt(input,null));
                            System.out.println("Is this information correct:\n" + v1);
                            break;
                            
                        case 4:
                            System.out.println("Please enter the information of your CD (genre, director, title, length, id, copies");
                            c1.set(input.nextLine(),input.nextLine(),input.nextLine(),getInt(input,null),getInt(input,null),getInt(input,null));
                            System.out.println("Is this information correct:\n" + c1);
                            break;
                            
                        default:
                            System.out.println("Invalid number entered! Please try again.");
                    }
                    break;
                
                case 2:
                    item = getInt(input, "Please select which type of item you wish to work with:\n" +
                            "----------------------------------------\n" +
                            "1) Book\n2) Journal Paper\n3) Video\n4) CD\n");
                    switch(item){
                        case 1:
                            b1.print();
                            b2.print();
                            break;
                            
                        case 2:
                            jp1.print();
                            jp2.print();
                            break;
                            
                        case 3:
                            v1.print();
                            v2.print();
                            break;
                            
                        case 4:
                            c1.print();
                            c2.print();
                            break;
                            
                        default:
                            System.out.println("Invalid number entered! Please try again.");
                    }
                    break;
                    
                case 3:
                    item = getInt(input, "Please select which type of item you wish to work with:\n" +
                            "----------------------------------------\n" +
                            "1) Book\n2) Journal Paper\n3) Video\n4) CD\n");
                    switch(item){
                        case 1:
                            num = getInt(input, "Please enter the book you wish to check in (either 1 or 2): ");
                            if(num == 1)
                                b1.checkIn();
                            else if(num == 2)
                                b2.checkIn();
                            else
                                System.out.println("Invalid input, please try again.");
                            break;
                            
                        case 2:
                            num = getInt(input, "Please enter the journal paper you wish to check in (either 1 or 2): ");
                            if(num == 1)
                                jp1.checkIn();
                            else if(num == 2)
                                jp2.checkIn();
                            else
                                System.out.println("Invalid input, please try again.");
                            break;
                            
                        case 3:
                            num = getInt(input, "Please enter the video you wish to check in (either 1 or 2): ");
                            if(num == 1)
                                v1.checkIn();
                            else if(num == 2)
                                v2.checkIn();
                            else
                                System.out.println("Invalid input, please try again.");
                            break;
                            
                        case 4:
                            num = getInt(input, "Please enter the CD you wish to check in (either 1 or 2): ");
                            if(num == 1)
                                c1.checkIn();
                            else if(num == 2)
                                c2.checkIn();
                            else
                                System.out.println("Invalid input, please try again.");
                            break;
                            
                        default:
                            System.out.println("Invalid number entered! Please try again.");
                    }
                    break;
                    
                case 4:
                    item = getInt(input, "Please select which type of item you wish to work with:\n" +
                            "----------------------------------------\n" +
                            "1) Book\n2) Journal Paper\n3) Video\n4) CD\n");
                    switch(item){
                        case 1:
                            num = getInt(input, "Please enter the book you wish to check out (either 1 or 2): ");
                            if(num == 1)
                                b1.checkOut();
                            else if(num == 2)
                                b2.checkOut();
                            else
                                System.out.println("Invalid input, please try again.");
                            break;
                            
                        case 2:
                            num = getInt(input, "Please enter the journal paper you wish to check in (either 1 or 2): ");
                            if(num == 1)
                                jp1.checkOut();
                            else if(num == 2)
                                jp2.checkOut();
                            else
                                System.out.println("Invalid input, please try again.");
                            break;
                            
                        case 3:
                            num = getInt(input, "Please enter the video you wish to check in (either 1 or 2): ");
                            if(num == 1)
                                v1.checkOut();
                            else if(num == 2)
                                v2.checkOut();
                            else
                                System.out.println("Invalid input, please try again.");
                            break;
                            
                        case 4:
                            num = getInt(input, "Please enter the CD you wish to check in (either 1 or 2): ");
                            if(num == 1)
                                c1.checkOut();
                            else if(num == 2)
                                c2.checkOut();
                            else
                                System.out.println("Invalid input, please try again.");
                            break;
                            
                        default:
                            System.out.println("Invalid number entered! Please try again.");
                    }
                    break;
                    
                case 5:
                    item = getInt(input, "Please select which type of item you wish to work with:\n" +
                            "----------------------------------------\n" +
                            "1) Book\n2) Journal Paper\n3) Video\n4) CD\n");
                    switch(item){
                        case 1:
                            id = getInt(input, "Please enter the ID number of the item you wish to add: ");
                            b1.addItem(id);
                            b2.addItem(id);
                            System.out.println("After call to addItem() method, b1 has " + b1.getCopies() + " copies and b2 has " + b2.getCopies() + "copies.");
                            break;
                            
                        case 2:
                            id = getInt(input, "Please enter the ID number of the item you wish to add: ");
                            jp1.addItem(id);
                            jp2.addItem(id);
                            System.out.println("After call to addItem() method, jp1 has " + jp1.getCopies() + " copies and jp2 has " + jp2.getCopies() + "copies.");
                            break;
                            
                        case 3:
                            id = getInt(input, "Please enter the ID number of the item you wish to add: ");
                            v1.addItem(id);
                            v2.addItem(id);
                            System.out.println("After call to addItem() method, v1 has " + v1.getCopies() + " copies and v2 has " + v2.getCopies() + "copies.");
                            break;
                            
                        case 4:
                            id = getInt(input, "Please enter the ID number of the item you wish to add: ");
                            c1.addItem(id);
                            c2.addItem(id);
                            System.out.println("After call to addItem() method, c1 has " + c1.getCopies() + " copies and c2 has " + c2.getCopies() + "copies.");
                            break;
                            
                        default:
                            System.out.println("Invalid number entered! Please try again.");
                    }
                    break;
                    
                case 6:
                    item = getInt(input, "Please select which type of item you wish to work with:\n" +
                            "----------------------------------------\n" +
                            "1) Book\n2) Journal Paper\n3) Video\n4) CD\n");
                    switch(item){
                        case 1:
                            if(b1.equals(b2))
                                System.out.println("The two books are equal!");
                            else
                                System.out.println("The two books are not equal!");
                            break;
                            
                        case 2:
                            if(jp1.equals(jp2))
                                System.out.println("The two journal papers are equal!");
                            else
                                System.out.println("The two journal papers are not equal!");
                            break;
                            
                        case 3:
                            if(v1.equals(v2))
                                System.out.println("The two videos are equal!");
                            else
                                System.out.println("The two videos are not equal!");
                            break;
                            
                        case 4:
                            if(c1.equals(c2))
                                System.out.println("The two CDs are equal!");
                            else
                                System.out.println("The two CDs are not equal!");
                            break;
                            
                        default:
                            System.out.println("Invalid number entered! Please try again.");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid number entered, please try again.");
            }
            
            choice = getInt(input,"Your options for items in the library are:\n" +
                            "----------------------------------------\n" + 
                            "1) Set item information\n"+ 
                            "2) Print item info\n" + 
                            "3) Check-in item\n" + 
                            "4) Check-out item\n" +
                            "5) Add item\n" + 
                            "6) Test for equality\n" + 
                            "0) EXIT\n" +
                            "Please enter your option:");
        }
        
        
    }
    
    public static int getInt(Scanner in, String prompt){
        System.out.println(prompt);
        
        while(!in.hasNextInt()){
            in.next();
            System.out.println("Not an integer value! Try again: ");
        }
        return in.nextInt();
    }
    
    
    
     
}

