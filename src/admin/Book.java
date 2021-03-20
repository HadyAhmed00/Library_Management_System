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
public class Book {
   private final int Book_ID;
   private final String Book_Name;
   private final String production_year;
   private int no_of_existing_copies;
   private final String author_name;
   private final String category;
   int watting_list_index=0;
   User waitting_list[]=new User[5];
   
   public Book(int Book_Id, String Book_Name, String Book_Production_year, int no_of_existing_copies, String author_name, String category) 
   {
        this.Book_ID = Book_Id;
        this.Book_Name = Book_Name;
        this.production_year = Book_Production_year;
        this.no_of_existing_copies = no_of_existing_copies;
        this.author_name = author_name;
        this.category = category;  
    }

    public int getBook_ID() {
        return Book_ID;
    }

    public void setNo_of_existing_copies(int no_of_existing_copies) {
        this.no_of_existing_copies = no_of_existing_copies;
    }

    public String getBook_Name() {
        return Book_Name;
    }

    public String getProduction_year() {
        return production_year;
    }

    public int getNo_of_existing_copies() {
        return no_of_existing_copies;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getCategory() {
        return category;
    }
    
    /**
     * This method is used to search for a book by one of two ways 
     * @param is_name the boolean argument that determines whether the search is done by searching book name or book ID
     */
    public static void search_option(boolean is_name){
        if (cont.op_search.isname) 
        {
        String name=cont.se_book.bookinfo.getText();
        DefaultListModel<String> model2 = new DefaultListModel<>();
        if(User.search_for_book(name))
        {
               
            if(Home.books[User.currentbook_id].watting_list_index==0)
            {
                Home.books[User.currentbook_id].waitting_list[0]=new Reader(0, " ", "r", " ", " ", " ", "0", " ", false);
                model2.addElement(String.valueOf(Home.books[User.currentbook_id].waitting_list[0].ID));
               cont.Dis_Book.jList1.setModel(model2);
               cont.se_book.setVisible(false);
               cont.Dis_Book.setVisible(true);
               cont.Dis_Book.setResizable(false);
            }
            else
            {
            for (int i = 0; i < Home.books[User.currentbook_id].watting_list_index; i++) {
                model2.addElement(String.valueOf(Home.books[User.currentbook_id].waitting_list[i].ID));
                 cont.Dis_Book.jList1.setModel(model2);
                 cont.se_book.setVisible(false);
                 cont.Dis_Book.setVisible(true);
                 cont.Dis_Book.setResizable(false);
            }
            }
        }
        else 
            JOptionPane.showMessageDialog(new Search_For_Book(), "This book has not been found!!", "Alert", JOptionPane.WARNING_MESSAGE);   
        }
        else 
        {
            int id=Integer.valueOf(cont.se_book.bookinfo.getText()); 
        DefaultListModel<String> model2 = new DefaultListModel<>();
        if(User.search_for_book(id))
        {
               
            if(Home.books[User.currentbook_id].watting_list_index==0)
            {
                Home.books[User.currentbook_id].waitting_list[0]=new Reader(0, " ", "r", " ", " ", " ", "0", " ", false);
                model2.addElement(String.valueOf(Home.books[User.currentbook_id].waitting_list[0].ID));
                 cont.Dis_Book.jList1.setModel(model2);
                cont.se_book.setVisible(false);
               cont.Dis_Book.setVisible(true);
               cont.Dis_Book.setResizable(false);
            }
            else
            {
            for (int i = 0; i < Home.books[User.currentbook_id].watting_list_index; i++) {
                model2.addElement(String.valueOf(Home.books[User.currentbook_id].waitting_list[i].ID));
                 cont.Dis_Book.jList1.setModel(model2);
                 cont.se_book.setVisible(false);
                 cont.Dis_Book.setVisible(true);
                 cont.Dis_Book.setResizable(false);
            }
            }
        }
        else 
            JOptionPane.showMessageDialog(new Search_For_Book(), "This book has not been found!!", "Alert", JOptionPane.WARNING_MESSAGE);
            
        }
       
    }
}
