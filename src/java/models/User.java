package models;

import java.io.Serializable;

/**
 * @author 882199
 */
public class User implements Serializable{
    String email;
    String firstName;
    String lastName;
    String password;
    Role role;
    public User(){
    }
    public User(String email, String fName, String lName, String password, Role role){
        this.email = email;
        this.firstName = fName;
        this.lastName = lName;
        this.password = password;
        this.role = role;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getPass(){
        return this.password;
    }
    public void setPass(String password){
        this.password = password;
    }
    public Role getRole(){
        return this.role;
    }
    public void setRole(Role role){
        this.role = role;
    }
}
