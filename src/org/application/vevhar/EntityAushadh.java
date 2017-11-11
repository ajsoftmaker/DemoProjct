/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.application.vevhar;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author abhayjadhav
 */
public class EntityAushadh {
    
    public int aushadhNo;
    public int plotNo;
    public int divas;
    public String vatavrn;
    public Date dinak;
    
    public String aushadhNav;
    public String aushadhPrman;
    public String aushadhVatavrn;
    public String aushadhRogacheNav;
    public String aushadhPrinam;
    
    public int getAushadhNo() {
        return aushadhNo;
    }
    
    public void setAushadhNo(int aushadhNo) {
        this.aushadhNo = aushadhNo;
    }
    
    public int getPlotNo() {
        return plotNo;
    }
    
    public void setPlotNo(int plotNo) {
        this.plotNo = plotNo;
    }
    
    public int getDivas() {
        return divas;
    }
    
    public void setDivas(int divas) {
        this.divas = divas;
    }
    
    public String getVatavrn() {
        return vatavrn;
    }
    
    public void setVatavrn(String vatavrn) {
        this.vatavrn = vatavrn;
    }
    
    public Date getDinak() {
        return dinak;
    }
    
    public void setDinak(Date dinak) {
        this.dinak = dinak;
    }
    
    public String getAushadhNav() {
        return aushadhNav;
    }
    
    public void setAushadhNav(String aushadhNav) {
        this.aushadhNav = aushadhNav;
    }
    
    public String getAushadhPrman() {
        return aushadhPrman;
    }
    
    public void setAushadhPrman(String aushadhPrman) {
        this.aushadhPrman = aushadhPrman;
    }
    
    public String getAushadhVatavrn() {
        return aushadhVatavrn;
    }
    
    public void setAushadhVatavrn(String aushadhVatavrn) {
        this.aushadhVatavrn = aushadhVatavrn;
    }
    
    public String getAushadhRogacheNav() {
        return aushadhRogacheNav;
    }
    
    public void setAushadhRogacheNav(String aushadhRogacheNav) {
        this.aushadhRogacheNav = aushadhRogacheNav;
    }
    
    public String getAushadhPrinam() {
        return aushadhPrinam;
    }
    
    public void setAushadhPrinam(String aushadhPrinam) {
        this.aushadhPrinam = aushadhPrinam;
    }
    
    public static Vector getHeaderForSearch() {
        Vector v = new Vector();
        
        v.add("प्लॉट नंबर");
        v.add("दिवस");
        v.add("वातावरण");
        v.add("दिनांक");
        
        v.add("औषधाचे नाव");
        v.add("औषधाचे प्रमाण");
        v.add("वातावरण");
        v.add("रोगाचे नाव");
        v.add("परिणाम");
        return v;
    }
    
    public Vector getDetailsForSearch() {
        Vector v = new Vector();
//        (ploatNo,divas,vatavrn,dinak,aushadhNav,aushadhPrman,aushadhVatavrn,aushadhRogacheNav,aushadhPrinam)
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(aushadhNav);
        v.add(aushadhPrman);
        v.add(aushadhVatavrn);
        v.add(aushadhRogacheNav);
        v.add(aushadhPrinam);
        return v;
    }
    
    public Vector getDetailsForReports(Vector<String> vector) {
        Vector v = new Vector();
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(aushadhNav);
        v.add(aushadhPrman);
        v.add(aushadhVatavrn);
        v.add(aushadhRogacheNav);
        v.add(aushadhPrinam);
        return v;
    }
}
