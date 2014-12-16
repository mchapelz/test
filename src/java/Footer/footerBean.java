/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Footer;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author NB20694
 */
@ManagedBean
@RequestScoped
public class footerBean {

     
    private String titleToShow = "Coisas Lindas";
    private String descriptionToShow;
    private String imageToShow;
    
    /**
     * Creates a new instance of footerBean
     */
    public footerBean() {
    }

    public String getTitleToShow() {
        return titleToShow;
    }

    public void setTitleToShow(String titleToShow) {
        this.titleToShow = titleToShow;
    }

    public String getDescriptionToShow() {
        return descriptionToShow;
    }

    public void setDescriptionToShow(String descriptionToShow) {
        this.descriptionToShow = descriptionToShow;
    }

    public String getImageToShow() {
        return imageToShow;
    }

    public void setImageToShow(String imageToShow) {
        this.imageToShow = imageToShow;
    }
    
    public void changeContent(){
        
    }
    
    
}
