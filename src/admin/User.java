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
/**
 *
 * @author hadi Atef
 */
public abstract class User 
{
    int ID;   //user id
    String password;//user password
    String Type; //user type(admin or reader)
    String First_Name;//user first name
    String Last_Name;//user last name
    String Address;//user address
    int Cellphone;//user phone
    String Email;//user email
    boolean is_Blocked;
    static int currentbook_id=0;//the index of the book that i search
    static int current_member_id=0;//the index of the reader that i search
    int rented_index=0;//the last index of the my rented array, It is special for each reader
    Book my_rented[]=new Book[3];//array of reader rented books,It is special for each reader 
    static String type;
    DefaultListModel<String> model = new DefaultListModel<>();
    public User(int ID, String password, String Type, String First_Name, String Last_Name, String Address, int Cellphone, String Email, boolean is_blooked) 
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
        my_rented[0]=new Book(0,"" , "", 0, "", "");
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
            int phone_number=Home.readers[User.current_member_id].Cellphone;
            String address=Home.readers[User.current_member_id].Address;
            String email=Home.readers[User.current_member_id].Email;
            cont.Display.Display_u(f_name,l_name, String.valueOf(id), address, String.valueOf(phone_number), email);
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
                int phone_number=Home.libs[User.current_member_id].Cellphone;
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
    public abstract void rent_book(String name);
}

      


 




    
    
    
    
    



