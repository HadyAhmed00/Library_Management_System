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
public class Reader extends User {

    public Reader(int ID, String password, String Type, String First_Name, String Last_Name, String Address, int Cellphone, String Email, boolean is_Blocked) {
        super(ID, password, Type, First_Name, Last_Name, Address, Cellphone, Email, is_Blocked);
    }
    public  void rent_book(String name)
    {
        if(User.search_for_book(name,Home.b_index ,Home.books))
            {
                  int checkForID=Login.getIdForIsBlocked;
                  int ctr;
                  boolean checkIsBlocked=false;
                  for ( ctr=0;ctr<Home.r_index;ctr++){
                  if(Home.readers[ctr].ID==checkForID){
                       checkIsBlocked=Home.readers[ctr].is_Blocked;
                       break;
                    }
                  }
                 if(Home.readers[ctr].is_Blocked == true){
                 JOptionPane.showMessageDialog(new Show_All_Books(), "You are blocked ");
                 }
                 else {
                  if(Home.readers[Home.current_user_index].rented_index==3)
                  {
                      System.out.println(Home.readers[ctr].is_Blocked);
                      JOptionPane.showMessageDialog(new Rent_a_Book(),"sorry you can't rent more books");
                  }
                  else
                  {
                    Home.readers[Home.current_user_index].my_rented[Home.readers[Home.current_user_index].rented_index]= Home.books[User.currentbook_id];
                    Home.readers[Home.current_user_index].rented_index++;
                    int no=Home.books[User.currentbook_id].getNo_of_existing_copies();
                    no--;
                    Home.books[User.currentbook_id].setNo_of_existing_copies(no);                
                    Home.rented_book_index++;
                    Home.Rented_books[Home.rented_book_index]=Home.books[User.currentbook_id];
                    JOptionPane.showMessageDialog(new Rent_a_Book(),"You have rented the required book of name "+name+" successfully");
                    System.out.println(Home.readers[ctr].is_Blocked);
                  }
                }
            }
        else
            {
                JOptionPane.showMessageDialog(new Rent_a_Book(),"This book has not been found!!","Alert",JOptionPane.WARNING_MESSAGE);
            }
        
                
    }
    
        
    
}
