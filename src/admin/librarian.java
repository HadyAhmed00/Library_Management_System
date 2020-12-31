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
    
    public  void rent_book(String name)
    {
        if(User.search_for_book(name,Home.b_index ,Home.books))
            {
                if(Home.books[User.currentbook_id].getNo_of_existing_copies()==0)
                {
                    JOptionPane.showMessageDialog(new Rent_a_Book(),"sorry you can't rent this book and you can book it");
                }
                else
                {
                if(Home.libs[Home.current_user_index].rented_index==3)
                  {
                      JOptionPane.showMessageDialog(new Rent_a_Book(),"sorry you can't rent more books");
                  }
                  else
                  {
                    Home.libs[Home.current_user_index].my_rented[Home.libs[Home.current_user_index].rented_index]= Home.books[User.currentbook_id];
                    Home.libs[Home.current_user_index].rented_index++;
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
    
       public static void add_user_to_watting_list(int user_id,String book_name)
      {
          if(User.search_for_book(book_name, Home.b_index, Home.books))
        {
            if(Home.books[User.currentbook_id].getNo_of_existing_copies()==0)
            {
                if(User.search_member(user_id, Home.r_index, Home.readers))
                {
                    if(Home.books[User.currentbook_id].watting_list_index==5)
                    {
                          JOptionPane.showMessageDialog(new Add_User_to_list(), "sorry you can't book this book now");
                    }
                    else
                    {
                    if(User.type.equals("r"))
                    {
                     
                     Home.books[User.currentbook_id].waitting_list[Home.books[User.currentbook_id].watting_list_index]=Home.readers[User.current_member_id];
                     Home.books[User.currentbook_id].watting_list_index++;
                     JOptionPane.showMessageDialog(new Add_User_to_list(), "user is added");
                    }
                    else
                    {
                    
                     Home.books[User.currentbook_id].waitting_list[Home.books[User.currentbook_id].watting_list_index]=Home.libs[User.current_member_id];
                      Home.books[User.currentbook_id].watting_list_index++;
                     JOptionPane.showMessageDialog(new Add_User_to_list(), "user is added");
                        
                    }
                }
                }
                else
                {
                    JOptionPane.showMessageDialog(new Add_User_to_list(), "user is not found");
                }
               
                
            }
            else
            {
                JOptionPane.showMessageDialog(new Add_User_to_list(), "you catnt do that as this book is avilable");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(new Add_User_to_list(), "book is not found");
        }
        
      }
       public static void remove_book_from_list(int user_id,String book_name)
      {
          int the_index=0;
          boolean is_found=false;
          if(User.search_for_book(book_name, Home.b_index, Home.books))
          {
              for (int i = 0; i < Home.books[User.currentbook_id].watting_list_index; i++) {
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
                   for (int i = the_index; i <Home.books[User.currentbook_id].watting_list_index; i++) {
                      Home.books[User.currentbook_id].waitting_list[i]=Home.books[User.currentbook_id].waitting_list[i+1];
                  }
                  Home.books[User.currentbook_id].watting_list_index--;
                  JOptionPane.showMessageDialog(new Remove_User_from_list(), "user is re,oved from the book list with name "+Home.books[User.currentbook_id].getBook_Name());
              }
              else 
                  JOptionPane.showMessageDialog(new Remove_User_from_list(), "user is not found in list");
              
              
          }
          else
          JOptionPane.showMessageDialog(new Remove_User_from_list(), "book is not found in list");
      }
        
    
    
}
