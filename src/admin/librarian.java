/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import javax.swing.JOptionPane;

/**
 *
 * @author hadi
 */
public class librarian extends User {
    
    
    public librarian(int ID, String password, String Type, String First_Name, String Last_Name, String Address, int Cellphone, String Email, boolean is_Blocked) {
        super(ID, password, Type, First_Name, Last_Name, Address, Cellphone, Email, is_Blocked);
    }
    public static void add_book( int id, String name,String production_year,int no_copies,String auther,String category)
    {
        Home.books[Home.b_index]=new Book(id,name,production_year,no_copies,auther,category);
    }
    public static void remove_book(String name)
    {
        int the_index;
        if(User.search_for_book(name, Home.b_index, Home.books))
        {
            the_index=User.currentbook_id;
        for (int i = the_index; i <Home.b_index;i++) {
            Home.books[i]=Home.books[i+1];
        }
          Home.b_index--;
            JOptionPane.showMessageDialog(new Remove_Book(), "You have removed a book data");
        }
        else
        {
            JOptionPane.showMessageDialog(new Remove_Book(), "sorry book not found");
        }
        
        
    }
    public static void add_rEADER(int id,String pass,String first, String last,int phone, String type, String address, String email, boolean b)
            
    {
        Home.readers[Home.r_index]=new Reader(id,pass,type,first,last,address,phone,email,b);
        System.out.println("user is registered");
    }
    public static void remove_reader(int id)
    {
        int the_index;
        if(User.search_member(id, Home.r_index, Home.readers))
        {
            the_index=User.current_member_id;
        for (int i = the_index; i <Home.r_index;i++) {
            Home.readers[i]=Home.readers[i+1];
        }
          Home.r_index--;
          
        }
    }
    
       
        
    
    
}
