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
public class ForgotPasswordBean {

   
    /**
     * Creates a new instance of ForgotPasswordBean
     */
    
    private String email;

    
    public ForgotPasswordBean() {
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean verifyEmail(){
        return false;
    }
    
    public void coisas(){
        
    }
    
    
    
    
}
