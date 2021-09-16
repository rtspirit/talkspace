/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;

/**
 *
 * @author juhip
 */
public class UserDirectory {
    ArrayList<User> userList = new ArrayList<>();

    public ArrayList<User> getUserList() {
        if(userList == null){
        userList = new ArrayList<>();
        }
        return userList;
    }
    
    public void addUser(User user){
    userList.add(user);
    }
    
    public void removeUser(User user){
    userList.remove(user);
    }
    
    public User findUserByUserName(String username){
        User user = null;
        
        for(User usr: userList){
        if(usr.getUsername().equalsIgnoreCase(username)){
            user=usr;
        }
        }
        return user;
    }
    
}
