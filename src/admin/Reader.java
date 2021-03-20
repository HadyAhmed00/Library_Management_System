/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import javax.swing.JOptionPane;

/**
 *
 * @author hadi Atef
 */
public class Reader extends User 
{

    public Reader(int ID, String password, String Type, String First_Name, String Last_Name, String Address, String Cellphone, String Email, boolean is_blooked) {
        super(ID, password, Type, First_Name, Last_Name, Address, Cellphone, Email, is_blooked);
    }
        
        
    public static void Add_of_self_to_watting_list(String book_name)
    {
        if(User.search_for_book(book_name))
        {
            if(Home.books[User.currentbook_id].getNo_of_existing_copies()==0)
            {
                if(Home.books[User.currentbook_id].watting_list_index==5)
                {
                    JOptionPane.showMessageDialog(new Add_User_to_list(), "sorry you can't book this book now");
                }
                else
                {
                    Home.books[User.currentbook_id].waitting_list[Home.books[User.currentbook_id].watting_list_index]=Home.readers[Home.current_user_index];
                    Home.books[User.currentbook_id].watting_list_index++;
                    JOptionPane.showMessageDialog(new Add_User_to_list(), "user is added");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(new Add_User_to_list(), "You can't do that as this book is avilable");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(new Add_User_to_list(), "book is not found");
        }
    }
    /**
     * This method allows a reader to rent a book
     * @param name the name of the required book
     */
    @Override
        public  void rent_book(String name)
        {
            if(User.search_for_book(name))
            {
                int checkForID=Login.getIdForIsBlocked;
                int ctr;
                boolean checkIsBlocked=false;
                for ( ctr=0;ctr<Home.r_index;ctr++)
                {
                    if(Home.readers[ctr].ID==checkForID)
                    {
                       checkIsBlocked=Home.readers[ctr].is_Blocked;
                       break;
                    }
               }
                if(Home.readers[ctr].is_Blocked == true)
                {
                    JOptionPane.showMessageDialog(new Show_All_Books(), "You are blocked ");
                }
                else 
                {
                    if(Home.books[User.currentbook_id].getNo_of_existing_copies()==0)
                    {
                        JOptionPane.showMessageDialog(new Rent_a_Book(),"Sorry you can't rent this book but you can book it");
                    }
                    else
                    {
                        if(Home.readers[Home.current_user_index].rented_index==2)
                        {
                            System.out.println(Home.readers[ctr].is_Blocked);
                            JOptionPane.showMessageDialog(new Rent_a_Book(),"Sorry you can't rent more books");
                        }
                        else
                        {
                            Home.readers[Home.current_user_index].rented_index++;
                            Home.readers[Home.current_user_index].my_rented[Home.readers[Home.current_user_index].rented_index]= Home.books[User.currentbook_id];
                            
                            int no=Home.books[User.currentbook_id].getNo_of_existing_copies();
                            no--;
                            Home.books[User.currentbook_id].setNo_of_existing_copies(no);                
                            Home.rented_book_index++;      //the last index of array of all rented books
                            Home.Rented_books[Home.rented_book_index]=Home.books[User.currentbook_id];
                            JOptionPane.showMessageDialog(new Rent_a_Book(),"You have rented the required book of name "+name+" successfully");
                            //System.out.println(Home.readers[ctr].is_Blocked);
                        }
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(new Rent_a_Book(),"This book has not been found!!","Alert",JOptionPane.WARNING_MESSAGE);
            }    
        }
    
}