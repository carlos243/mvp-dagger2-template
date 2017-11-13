package cl.carlostapia.mvpdagger2template.screens.login.core;

import cl.carlostapia.mvpdagger2template.providers.dto.User;

/**
 * Created by CarlosTapia on 12-11-17.
 */

public class LoginModel {

    User mock_user = new User("foo@gmail.com","foo");

    public boolean authenticateUser(User user){
        if (user.equals(mock_user)){
            return true;
        }
        return false;
    }

}
