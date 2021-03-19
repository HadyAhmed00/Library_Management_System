/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static admin.Admin_GUI.cont;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Hadi Ehab
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
    //int blocked_index=-1; //the last index
    Book my_rented[]=new Book[3];//array of reader rented books,It is special for each reader 
    static String type;
    DefaultListModel<String> model = new DefaultListModel<>();
    public User(int ID, String password, String Type, String First_Name, String Last_Name, String Address, String Cellphone, String Email, boolean is_Blocked) 
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
    
    /**
     * This method is used to search for any user whether a librarian or a reader
     * @param id The user is searched for by entering his/her ID 
     * @return A boolean value;"true" if the user is found,"false" if the user is not found.
     */
    public static boolean search_member(int id)
    {
        boolean found1=false;
       // boolean found2=false;
        for (int i = 0; i <=Home.r_index; i++) 
        {
            if(id==Home.readers[i].ID)
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
    
    /**
     * This method searches for a required book inside the array of books (by entering its name)
     * @param namee Book name entered by the user
     * @return A boolean value;"true" if the book is found,"false" if the book is not found.
     */
    public static boolean search_for_book(String namee)
    {
        boolean found=false;
        for (int i = 0; i <= Home.b_index; i++) {
            if(namee.equals(Home.books[i].getBook_Name()))
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
    
    /**
     * This method searches for a required book inside the array of books (by entering its ID)
     * @param id Book id entered by the user
     * @return A boolean value;"true" if the book is found,"false" if the book is not found.
     */
    public static boolean search_for_book(int id)
    {
        boolean found=false;
        for (int i = 0; i <= Home.b_index; i++) {
            if(id==Home.books[i].getBook_ID())
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
    /**
     * This abstract method is overridden in subclasses(librarian,Reader) 
     * and it is used to rent a book by entering its name
     * @param name The book name that the user enters
     */
    public abstract void rent_book(String name);
    
    /**
     * This method is used to return a rented book by the user by entering its name
     * The method checks for whether the book entered by the user is rented or not
     * If it is rented, it checks whether this book is rented by the active user or not
     * @param name The rented book name entered by user
     */
    public static void return_book(String name)
    {
        boolean rented_is_found=false;
        boolean rented_is_found_for_current_user=false;
        int index=0;
        int index_for_current_user=0;
        if(User.search_for_book(name)) 
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
        else
        {
            JOptionPane.showMessageDialog(new Return_a_book(), "This book has not been found");
        }
    }
    
    /**
     * This method validates Login Operation by checking whether ID and password entered by user 
     * are both stored and valid or not
     * @param ID ID entered by user (should be a valid stored value to login successfully)
     * @param password password entered by user (should be a valid stored value to login successfully)
     */
    public static void Login(String ID,String password)
    {
            if(!Validation.valid1(ID)||password.isEmpty())
            {
                JOptionPane.showMessageDialog(new Login(), "Wrong data");
            }
            else
            {
                int id = Integer.valueOf(ID);
                String pass=password;
                boolean log=false;
                if(Home.login==true)
                {
                    for (int i = 0; i <= Home.l_index; i++) 
                    {
                        if(id==Home.libs[i].ID&&pass.equals(Home.libs[i].password)&&Home.libs[i].Type.equals("l"))
                        {
                            log=true;
                            Home.current_user_index=i;
                            break;
                        }
                        else 
                        {
                            log=false;
                        }
                    }
                    if(log==true)
                    {
                        cont.log.setVisible(false);
                        cont.Admin.setVisible(true); 
                        cont.Admin.setResizable(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(new Login(), "Sorry, your information is not correct");
                    }
                }
            else
            {
                for (int i = 0; i <= Home.r_index; i++) 
                {
                    if(id==Home.readers[i].ID&&pass.equals(Home.readers[i].password)&&Home.readers[i].Type.equals("r"))
                    {
                        log=true;
                        Home.current_user_index=i;
                        break;
                    }
                    else 
                    {
                        log=false;
                    }
                }
                if(log==true)
                {
                    cont.log.setVisible(false);
                    cont.read.setVisible(true); 
                    cont.read.setResizable(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(new Login(), "Sorry, your information is not correct");
                }
            }
       }
   }
}

      


 




    
    
    
    
    



