package controller;

import DBInteraction.MainDBI;
import DBInteraction.InsertDBI;
import DBInteraction.SearchDBI;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Main;

/**
 *
 * @author Baran Bursalı
 */
@ManagedBean
@SessionScoped
public class Managed_Bean {
    
    
    private String username,password,name_surname,mail,tel,address,kan, search;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    
   public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getname_surname() {
        return name_surname;
    }

    public void setname_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getmail() {
        return mail;
    }

    public void setmail(String mail) {
        this.mail = mail;
    }
     public String gettel() {
        return tel;
    }

    public void settel(String tel) {
        this.tel = tel;
    }
     public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }
     public String getkan() {
        return kan;
    }

    public void setkan(String kan) {
        this.kan = kan;
    }
    public ArrayList<Main> getMainShow() {
        return new MainDBI().getAllMain();
    }
    public void getAllByusername(String username,String password,String name_surname,String mail,String tel,String address,String kan) {
        this.username = username;
        this.password = password;
        this.name_surname = name_surname;
        this.mail = mail;
        this.tel = tel;
        this.address = address;
        this.kan = kan;
    }
    public void resetValue(){
        this.username = "";
        this.password = "";
        this.name_surname = "";
        this.mail = "";
        this.tel = "";
        this.address = "";
        this.kan = "";
    }
    public boolean insertB() throws SQLException {
        Main b = new Main(username,password,name_surname,mail,tel,address,kan);
        return new InsertDBI().insertMain(b);
    }
    public ArrayList<Main> getSearchBluewave() {
        return new SearchDBI().SearchMain(search);
    }
}
