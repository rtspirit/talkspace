/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author juhip
 */

public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList = new ArrayList<>();

    public ArrayList<UserAccount> getUseraccountList() {
        if(userAccountList == null){
            userAccountList = new ArrayList<>();
        }
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){        
        for (UserAccount useraccount : userAccountList) {
//             System.out.println("User Name******** "+useraccount.getUsername());
//            System.out.println("Password********* "+useraccount.getPassword());
            if (useraccount.getUsername().equals(username) && useraccount.getPassword().equals(password)){
                return useraccount;
            }
        }
        return null;
    } 
    public void addAccount(UserAccount useraccount){
        userAccountList.add(useraccount);
        System.out.println("Password********* "+useraccount.getPassword());
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

    public boolean checkIfUserIdIsUnique(String userId) {
         //To change body of generated methods, choose Tools | Templates.
         for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(userId))
                return false;
        }
        return true;
    }
    
     public UserAccount addUserAccount(UserAccount userAccount) {
        if(userAccountList==null){
        userAccountList = new ArrayList<>();
        }
        userAccountList.add(userAccount);
        return userAccount;
    }
}
