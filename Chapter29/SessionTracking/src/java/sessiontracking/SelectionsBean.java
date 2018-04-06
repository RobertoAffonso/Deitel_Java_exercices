/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessiontracking;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author robertoaraujo
 */
@SessionScoped
@ManagedBean(name="selectionsBean")
public class SelectionsBean implements Serializable{

    private static final HashMap<String, String>  booksMap = new HashMap<>();
    static{
        booksMap.put("java", "Java, How to Program");
        booksMap.put("cpp", "C++, How to Program");
        booksMap.put("iphone", "iPhone for Programmers: An App-Driven Approach");
        booksMap.put("android", "Android for Programmers: An App-Driven Approach");
    }
    private Set<String> selections = new TreeSet<>();
    private String selection;
    
    public SelectionsBean() {    
    }
    
    public int getNumberOfSelections(){
        return selections.size();
    }
    
    public String[] getSelections() {
        return selections.toArray(new String[selections.size()]);
    }
    
    public String getSelection() {
        return selection;
    }

    public void setSelection(String key) {
        selection = booksMap.get(key);
        selections.add(selection);
    }
}