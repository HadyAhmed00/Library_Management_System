/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
//import admin.Home;
//import admin.Home;
//import java.util.Scanner;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import static admin.Admin_GUI.cont;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author hadi Atef
 */
public abstract class User 
{
    protected int ID;   //user id
    protected String password;//user password
    protected String Type; //user type(admin or reader)
    protected String First_Name;//user first name
    protected String Last_Name;//user last name
    protected String Address;//user address
    protected String Cellphone;//user phone
    protected String Email;//user email
    boolean is_Blocked;
    static int currentbook_id=0;//the index of the book that i search
    static int current_member_id=0;//the index of the reader that i search
    int rented_index=-1;//the last index of the my rented array, It is special for each reader
    Book my_rented[]=new Book[3];//array of reader rented books,It is special for each reader 
    static String type;
    DefaultListModel<String> model = new DefaultListModel<>();
    public User(int ID, String password, String Type, String First_Name, String Last_Name, String Address, String Cellphone, String Email, boolean is_blooked) 
    {
        this.ID = ID;
        this.password = password;
        this.Type = Type;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Address = Address;
        this.Cellphone = Cellphone;
        this.Email = Email;
        this.is_Blocked = is_Blocked;
        //my_rented[0]=new Book(0,"" , "", 0, "", "");
    }
   public static boolean search_member(int id,int r_index,Reader r_arr[])
    {
        boolean found1=false;
       // boolean found2=false;
        for (int i = 0; i <=r_index; i++) 
        {
            if(id==r_arr[i].ID)
            {
                current_member_id=i;
                found1=true;
                break;
            }
            else
                found1=false;
        }
        if(found1==true)
        {
            int ID=Home.readers[User.current_member_id].ID;
            String f_name=Home.readers[User.current_member_id].First_Name;
            String l_name=Home.readers[User.current_member_id].Last_Name;
            String phone_number=Home.readers[User.current_member_id].Cellphone;
            String address=Home.readers[User.current_member_id].Address;
            String email=Home.readers[User.current_member_id].Email;
            cont.Display.Display_u(f_name,l_name, String.valueOf(id), address, phone_number, email);
            type="r";
            return true;
        }
        else
        {
           for (int i = 0; i <=Home.l_index; i++) {
            if(id==Home.libs[i].ID)
            {
                current_member_id=i;
                found1=true;
                break;
            }
            else
                found1=false; 
        }
           if(found1==true)
           {
                int ID=Home.libs[User.current_member_id].ID;
                String f_name=Home.libs[User.current_member_id].First_Name;
                String l_name=Home.libs[User.current_member_id].Last_Name;
                String phone_number=Home.libs[User.current_member_id].Cellphone;
                String address=Home.libs[User.current_member_id].Address;
                String email=Home.libs[User.current_member_id].Email;
                cont.Display.Display_u(f_name,l_name, String.valueOf(id), address, String.valueOf(phone_number), email);
                type="l";
                return true;
           }
           else
           {
               return false;
           }
        }
    }
    public static boolean search_for_book(String namee, int b_index,Book b_arr[])
    {
        boolean found=false;
        for (int i = 0; i <= b_index; i++) {
            if(namee.equals(b_arr[i].getBook_Name()))
            {
                currentbook_id=i;
                found=true;
                break;
            }
            else
                found=false;         
    }
        if(found==true)
        {
            int ID=Home.books[User.currentbook_id].getBook_ID();
            String name=Home.books[User.currentbook_id].getBook_Name();
            String year=Home.books[User.currentbook_id].getProduction_year();
            String a_name=Home.books[User.currentbook_id].getAuthor_name();
            int no_of_copies=Home.books[User.currentbook_id].getNo_of_existing_copies();
            String category=Home.books[User.currentbook_id].getCategory();
            cont.Dis_Book.Display(name, String.valueOf(ID), year, a_name,category,String.valueOf(no_of_copies));
            return true;
        }
        
        else
        {
            return false;
        }
    }
    public static boolean search_for_book(int id, int b_index,Book b_arr[])
    {
        boolean found=false;
        for (int i = 0; i <= b_index; i++) {
            if(id==b_arr[i].getBook_ID())
            {
                currentbook_id=i;
                found=true;
                break;
            }
            else
                found=false;         
    }
        if(found==true)
        {
            int ID=Home.books[User.currentbook_id].getBook_ID();
            String name=Home.books[User.currentbook_id].getBook_Name();
            String year=Home.books[User.currentbook_id].getProduction_year();
            String a_name=Home.books[User.currentbook_id].getAuthor_name();
            int no_of_copies=Home.books[User.currentbook_id].getNo_of_existing_copies();
            String category=Home.books[User.currentbook_id].getCategory();
            cont.Dis_Book.Display(name, String.valueOf(ID), year, a_name,category,String.valueOf(no_of_copies));
            return true;
        }
        
        else
        {
            return false;
        }
    }
    public abstract void rent_book(String name);
    public static void return_book(String name)
    {
        boolean rented_is_found=false;
        boolean rented_is_found_for_current_user=false;
        int index=0;
        int index_for_current_user=0;
        if(User.search_for_book(name, Home.b_index, Home.books)) 
        {
           for(int i=0;i<=Home.rented_book_index;i++)
            {
                if(Home.Rented_books[i].getBook_Name().equals(name))
                {
                    rented_is_found=true;
                    index=i;
                    break;
                }
                else
                {
                    rented_is_found=false;
                }
            }
            if(rented_is_found==true)
            {
                if(Home.login)
                {
                    
                   for (int i = 0; i <= Home.libs[Home.current_user_index].rented_index; i++) {
                    if(Home.libs[Home.current_user_index].my_rented[i].getBook_Name().equals(name))
                    {
                        rented_is_found_for_current_user=true;
                        index_for_current_user=i;
                        break;
                    }
                    else
                    {
                        rented_is_found_for_current_user=false;
                    }
                } 
                  if(rented_is_found_for_current_user) 
                  {
                      for (int i = index; i <= Home.rented_book_index; i++) {
                    Home.Rented_books[i]=Home.Rented_books[i+1];
                }
                Home.rented_book_index--;
                int no=Home.books[User.currentbook_id].getNo_of_existing_copies();
                no++;
                Home.books[User.currentbook_id].setNo_of_existing_copies(no);
                JOptionPane.showMessageDialog(new Return_a_book(), "You have returned this book successfully");
                      for (int i = index_for_current_user; i < Home.libs[Home.current_user_index].rented_index; i++) {
                    Home.libs[Home.current_user_index].my_rented[i]=Home.libs[Home.current_user_index].my_rented[i+1];
                }
                      Home.libs[Home.current_user_index].rented_index--;
                  }
                  else{
                      JOptionPane.showMessageDialog(new Return_a_book(), "You are not the user who rented this book so you can't return it","Alert",JOptionPane.WARNING_MESSAGE);
                  }
                }
                else
                {
                    for (int i = 0; i <= Home.readers[Home.current_user_index].rented_index; i++) {
                    if(Home.readers[Home.current_user_index].my_rented[i].getBook_Name().equals(name))
                    {
                        rented_is_found_for_current_user=true;
                        index_for_current_user=i;
                        break;
                    }
                    else
                    {
                        rented_is_found_for_current_user=false;
                    }
                } 
                  if(rented_is_found_for_current_user) 
                  {for (int i = index; i <= Home.rented_book_index; i++) {
                    Home.Rented_books[i]=Home.Rented_books[i+1];
                }
                Home.rented_book_index--;
                int no=Home.books[User.currentbook_id].getNo_of_existing_copies();
                no++;
                Home.books[User.currentbook_id].setNo_of_existing_copies(no);
                JOptionPane.showMessageDialog(new Return_a_book(), "You have returned this book successfully");
                      for (int i = index_for_current_user; i < Home.readers[Home.current_user_index].rented_index; i++) {
                    Home.readers[Home.current_user_index].my_rented[i]=Home.readers[Home.current_user_index].my_rented[i+1];
                }
                      Home.readers[Home.current_user_index].rented_index--;
                  }
                  else{
                      JOptionPane.showMessageDialog(new Return_a_book(), "You are not the user who rented this book so you can't return it","Alert",JOptionPane.WARNING_MESSAGE);
                  }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(new Return_a_book(), "The book has not been found","Failed!",JOptionPane.WARNING_MESSAGE);
            } 
        }
        else{
            JOptionPane.showMessageDialog(new Return_a_book(), "This book has not been found");
        }
    }
}

      


 




    
    
    
    
    



