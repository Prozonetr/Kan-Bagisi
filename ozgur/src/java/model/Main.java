package model;
/**
 *
 * @author Baran Bursalı
 */
public class Main {

    private String username,password,name_surname,mail,tel,address,kan;

    public Main(String username,String password,String name_surname,String mail,String tel,String address,String kan) {
        this.username = username;
        this.password = password;
        this.name_surname = name_surname;
        this.mail = mail;
        this.tel = tel;
        this.address = address;
        this.kan = kan;
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

}
