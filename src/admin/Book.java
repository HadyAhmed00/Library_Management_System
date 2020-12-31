/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

/**
 *
 * @author hadi Atef
 */
public class Book {
   private int Book_ID;
   private String Book_Name;
   private String production_year;
   private int no_of_existing_copies;
   private String author_name;
   private String category;
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
}
