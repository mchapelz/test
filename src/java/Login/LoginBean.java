/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author NB20694
 */
@ManagedBean
@RequestScoped
public class LoginBean {

    private final String validUsername = "Capela";

    private DAOUsers daousers;
    private final String validPassword = "capela123";
    private String username;
    private String password;

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getValidUsername() {
        return validUsername;
    }

    public String getValidPassword() {
        return validPassword;
    }

    public String checkValidity() {
        if (username.equals(validUsername) && password.equals(validPassword)) {
            return "userHome";
        } else {
            return "index";
        }
    }

    public String logout() {
        username = null;
        password = null;
        return "index";

    }

    public String checkValitidtyFromDB() {
        daousers = new DAOUsers();
        if (daousers.getUsers(username, password)) {
            return "userHome";
        } else {
            return "login";
        }

    }

}
