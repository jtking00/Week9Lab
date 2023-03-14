package services;

import java.util.*;
import dataaccess.UserDB;
import models.User;
import models.Role;
/**
 * @author 882199
 */
public class UserService {
    public ArrayList<User> getUsers() throws Exception{
        UserDB userDB = new UserDB();
        ArrayList<User> users = userDB.getUsers();
        return users;
    }
    public User getUser(String email) throws Exception{
        UserDB userDB = new UserDB();
        User user = userDB.getUser(email);
        return user;
    }
    public void insertUser(String email, String fName, String lName, String pass, Role role) throws Exception {
        UserDB userDB = new UserDB();
        User user = new User(email, fName, lName, pass, role);
        userDB.insertUser(user);
    }
    public void updateUser(String email, String fName, String lName, String pass, Role role) throws Exception {
        UserDB userDB = new UserDB();
        User user = new User(email, fName, lName, pass, role);
        userDB.updateUser(user);
    }
    public void deleteUser(String email) throws Exception {
        UserDB userDB = new UserDB();
        User user = new User();
        user.setEmail(email);
        userDB.deleteUser(user);
    }
}
