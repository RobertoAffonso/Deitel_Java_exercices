/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author robertoaraujo
 */
@ManagedBean(name = "validationBean")
public class ValidationBean implements Serializable {
    private String name;
    private String email;
    private String phone;
    
    public ValidationBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getResult(){
        if ( name != null && email != null && phone != null )
         return "<p style=\"background-color:yellow;width:200px;" +
            "padding:5px\">Name: " + getName() + "<br/>E-Mail: " +
            getEmail() + "<br/>Phone: " + getPhone() + "<br/>" +"</p>";
        
        else
            return "";
        
    }
    
}
