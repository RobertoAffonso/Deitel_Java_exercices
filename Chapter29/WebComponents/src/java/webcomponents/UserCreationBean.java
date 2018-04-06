/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcomponents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author robertoaraujo
 */
@ManagedBean(name="userCreationBean")
@Dependent
public class UserCreationBean implements Serializable{
private String firstName;
private String lastName;
private String phone;
private String email;
private String os;
private String book;
private Set<String> osSet = new TreeSet<>();
private Set<String> bookSet = new TreeSet<>();
private final HashMap<String, String> bookMap = new HashMap<>();
private final HashMap<String, String> osMap = new HashMap<>();
    /**
     * Creates a new instance of UserCreationBean
     */
    public UserCreationBean() {
        bookMap.put("CHTP", "C How to Program");
        bookMap.put("CPPHTP", "C++ How To Program");
        bookMap.put("IW3HTP", "Internet &amp; How to Program");
        bookMap.put("JHTP", "Java How to Program");
        bookMap.put("VBHTP", "Visual Basic How to Program");
        bookMap.put("VCSHTP", "Visual C# How to Program");
        
        osMap.put("win10", "Windows 10");
        osMap.put("win7", "Windows 7");
        osMap.put("winVista", "Windows Vista");
        osMap.put("OSX", "Mac OSX");
        osMap.put("linux", "Linux");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String[] getBookSet(){
        return bookSet.toArray(new String[bookSet.size()]);
    }
    
    public String[] getOsSet(){
        return osSet.toArray(new String[osSet.size()]);
    }
 
    public String getOs(){
        return os;
    }
    
    public void setOs(String key){
        os = osMap.get(key);
        osSet.add(os);
    }
    
    public String getBook(){
        return book;
    }
    
    public void setBook(String key){
        book = bookMap.get(key);
        bookSet.add(book);
    }
    
    public String getResult(){
        if(firstName != null && lastName != null && email != null && phone != null){
            
            return "<p>User Registered!" + "<br>" + getFirstName() + " "
                    + getLastName() + "<br>" +
                    getEmail() + "<br>" +
                    getPhone() + "<br>" + 
                    getBook() + "<br>" + 
                    getOs() + "</p>";
        }
        else{
            return "";
        }
    }
}
