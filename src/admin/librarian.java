/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import javax.swing.JOptionPane;
import admin.contaner;

/**
 *
 * @author hadi Atef
 */
public class librarian extends User 
{

    public librarian(int ID, String password, String Type, String First_Name, String Last_Name, String Address, String Cellphone, String Email, boolean is_blooked) {
        super(ID, password, Type, First_Name, Last_Name, Address, Cellphone, Email, is_blooked);
    }
    
    /**
     * This method adds a new object of book into the last index of the array of books
     * @param id ID of the new book object
     * @param name Name of the new book object
     * @param production_year Production Year of the new book object
     * @param no_copies Number of copies of the new book object
     * @param auther Name of the new book object
     * @param category Category of the new book object
     */
    public static void add_book( int id, String name,String production_year,int no_copies,String auther,String category)
    {
        Home.books[Home.b_index]=new Book(id,name,production_year,no_copies,auther,category);
    }
    /**
     * This method is used by the librarian to remove a book data from the array of books
     * @param name The name of the required book to be removed
     */
    public static void remove_book(String name)
    {
        int the_index;
        if(User.search_for_book(name))
        {
            the_index=User.currentbook_id;
            for (int i = the_index; i <Home.b_index;i++) 
            {
                Home.books[i]=Home.books[i+1];
            }
            Home.b_index--;
            JOptionPane.showMessageDialog(new Remove_Book(), "You have removed a book data");
        }
        else
        {
            JOptionPane.showMessageDialog(new Remove_Book(), "Sorry book is not found");
        } 
    }
    /**
     * This method adds a new object of reader into the last index of the array of readers
     * @param id ID of the new reader object
     * @param pass password of the new reader object
     * @param first first name of the new reader object
     * @param last  last name of the new reader object
     * @param phone phone number of the new reader object
     * @param type type of reader (to solve login issues) 
     * @param address address of the new reader object
     * @param email e-mail of the new reader object
     * @param b boolean 
     */
    public static void add_rEADER(int id,String pass,String first, String last,String phone, String type, String address, String email, boolean b)     
    {
        Home.readers[Home.r_index]=new Reader(id,pass,type,first,last,address,phone,email,b);
        System.out.println("user is registered");
    }
    /**
     * This method is used to search for a reader to remove him/her from the array of readers
     * @param id Reader's ID that the librarian wants to remove
     */
    public static void remove_reader(int id)
    {
        int the_index;
        if(User.search_member(id))
        {
            if(User.type.equals("r"))
            {
                the_index = User.current_member_id;
                for (int i = the_index; i <= Home.r_index; i++) {
                    Home.readers[i] = Home.readers[i + 1];
                }
                Home.r_index--;
                JOptionPane.showMessageDialog(new Remove_User(), "You have removed data of user no." + id);
            }
            else  
            {
                JOptionPane.showMessageDialog(new Remove_User(), "This is not a reader's data","Alert",JOptionPane.WARNING_MESSAGE);
            }
            
          
        }
    }
    /**
     * This method is used to add a user in the waiting list for a book which has no left copies in the library
     * @param user_id The waiting user_id
     * @param book_name The book name that the user wants
     */
    public static void add_user_to_watting_list(int user_id,String book_name)
    {
        if(User.search_for_book(book_name))
        {
            if(Home.books[User.currentbook_id].getNo_of_existing_copies()==0)
            {
                if(User.search_member(user_id))
                {
                    if(Home.books[User.currentbook_id].watting_list_index==5)
                    {
                        JOptionPane.showMessageDialog(new Add_User_to_list(), "Sorry, you can't book this book now");
                    }
                    else
                    {
                        if(User.type.equals("r"))
                        {
                            Home.books[User.currentbook_id].waitting_list[Home.books[User.currentbook_id].watting_list_index]=Home.readers[User.current_member_id];
                            Home.books[User.currentbook_id].watting_list_index++;
                            JOptionPane.showMessageDialog(new Add_User_to_list(), "User is added");
                        }
                        else
                        {
                            Home.books[User.currentbook_id].waitting_list[Home.books[User.currentbook_id].watting_list_index]=Home.libs[User.current_member_id];
                            Home.books[User.currentbook_id].watting_list_index++;
                            JOptionPane.showMessageDialog(new Add_User_to_list(), "User is added");
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(new Add_User_to_list(), "User is not found");
                }   
            }
            else
            {
                JOptionPane.showMessageDialog(new Add_User_to_list(), "You don't have to add the user to the waiting list because this book is already avilable");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(new Add_User_to_list(), "Book is not found","Alert",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    public static void remove_book_from_list(int user_id,String book_name)
    {
      int the_index=0;
      boolean is_found=false;
      if(User.search_for_book(book_name))
       {
          for (int i = 0; i < Home.books[User.currentbook_id].watting_list_index; i++) 
           {
              if(Home.books[User.currentbook_id].waitting_list[i].ID==user_id)
              {
                the_index=i;
                is_found=true;
                break;
              }
              else 
              {
                is_found=false;
              }
            }
          if(is_found)
           {
                for (int i = the_index; i <Home.books[User.currentbook_id].watting_list_index; i++)
                {
                    Home.books[User.currentbook_id].waitting_list[i]=Home.books[User.currentbook_id].waitting_list[i+1];
                }
                Home.books[User.currentbook_id].watting_list_index--;
                JOptionPane.showMessageDialog(new Remove_User_from_list(), "User is removed from the book list with name "+Home.books[User.currentbook_id].getBook_Name());
            }
          else 
            JOptionPane.showMessageDialog(new Remove_User_from_list(), "User is not found in list");
       }
      else
        JOptionPane.showMessageDialog(new Remove_User_from_list(), "Book is not found in list");
    }
    /**
     * This method allows a librarian to rent a book 
     * @param name the name of the required book
     */
    @Override
    public  void rent_book(String name)
    {
        if(User.search_for_book(name))
        {
            if(Home.books[User.currentbook_id].getNo_of_existing_copies()==0)
            {
                JOptionPane.showMessageDialog(new Rent_a_Book(),"Sorry, you can't rent this book and you can book it");
            }
            else
            {
                if(Home.libs[Home.current_user_index].rented_index==2)
                {
                    JOptionPane.showMessageDialog(new Rent_a_Book(),"Sorry, you can't rent more books");
                }
                else
                {
                    Home.libs[Home.current_user_index].rented_index++;
                    Home.libs[Home.current_user_index].my_rented[Home.libs[Home.current_user_index].rented_index]= Home.books[User.currentbook_id];
                    
                    int no=Home.books[User.currentbook_id].getNo_of_existing_copies();
                    no--;
                    Home.books[User.currentbook_id].setNo_of_existing_copies(no);
                    Home.rented_book_index++;
                    Home.Rented_books[Home.rented_book_index]=Home.books[User.currentbook_id];
                    JOptionPane.showMessageDialog(new Rent_a_Book(),"You have rented the required book of name "+name+" successfully");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(new Rent_a_Book(),"This book has not been found!!","Alert",JOptionPane.WARNING_MESSAGE);
        }     
    }
    
    /**
     * This methods allows a librarian to block a user who returns books late
     * @param id The ID of the user who will be blocked
     */
    public static void block_user(int id)
    {
        int index=0;
        //int index_for_current_user=0;
        boolean blocked_is_found=false;
                 if (User.search_member(id)) {
                     if(User.type.equals("r"))
                     {
                         if(Home.readers[User.current_member_id].is_Blocked==true)
                         {
                             JOptionPane.showMessageDialog(new Block_User(), "This User is already blocked");
                         }
                         else
                         {
                             Home.readers[User.current_member_id].is_Blocked=true;
                             JOptionPane.showMessageDialog(new Block_User(), "This user of ID "+id+" has been blocked successfully");
                             Home.blocked_user_index++;
                             Home.blocked_readers[Home.blocked_user_index]=Home.readers[User.current_member_id];
                         }
                         
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(new Block_User(), "Member is not found!!", "Alert", JOptionPane.WARNING_MESSAGE);
                     }
                 }
         else {
            JOptionPane.showMessageDialog(new Block_User(), "Member is not found!!", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }
    /**
     * This method allows a librarian to unblock a user
     * @param id The ID of the user who will be unblocked
     */
    public static void unblock_user(int id)
    {
        int index=0;
        boolean blocked_is_found=false;
        if(User.search_member(id))
            {
                if(Home.readers[User.current_member_id].is_Blocked==false)
                {
                    JOptionPane.showMessageDialog(new unblock_user(), "This user is already unblocked");
                
                }
                else
                {
                    Home.readers[User.current_member_id].is_Blocked=false;
                    JOptionPane.showMessageDialog(new unblock_user(), "The user with ID "+id+" has been unblocked");
                    for(int i=0;i<=Home.blocked_user_index;i++){
                        if(id==Home.blocked_readers[i].ID)
                        {
                            blocked_is_found=true;
                            index=i;
                            break;
                        }
                        else
                        {
                            blocked_is_found=false;
                        }
                    }
                    if(blocked_is_found)
                    {
                        for (int i = index; i <= Home.blocked_user_index; i++) {
                            Home.blocked_readers[i] = Home.blocked_readers[i + 1];
                        }
                        Home.blocked_user_index--;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(new unblock_user(), "This user has not been found","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }

                
            }
            else
            JOptionPane.showMessageDialog(new unblock_user(), "Member is not found!!","Alert",JOptionPane.WARNING_MESSAGE);
    }
}
