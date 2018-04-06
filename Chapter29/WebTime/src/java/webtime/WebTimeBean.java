/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtime;

import java.text.DateFormat;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author robertoaraujo
 */
@Named(value = "webTimeBean")
@Dependent
@ManagedBean
public class WebTimeBean {

    /**
     * Creates a new instance of WebTimeBean
     */
    public WebTimeBean() {
    }
    
    public String getTime(){
        return DateFormat.getDateInstance(DateFormat.LONG).format(new Date());
    }
    
}
