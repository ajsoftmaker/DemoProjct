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
public class EntityKhat {
    
    public int khatNo;
    public int plotNo;
    public int divas;
    public String vatavrn;
    public Date dinak;
    
    public String khatNav;
    public String khatPrman;
    public String khatPani;
    public String khatPrinam;
    
    public int getKhatNo() {
        return khatNo;
    }
    
    public void setKhatNo(int khatNo) {
        this.khatNo = khatNo;
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
    
//    public String khatNav;
    public String getKhatNav() {
        return khatNav;
    }
    
    public void setKhatNav(String khatNav) {
        this.khatNav = khatNav;
    }
//    public String khatPrman;
    public String getKhatPrman() {
        return khatPrman;
    }
    
    public void setKhatPrman(String khatPrman) {
        this.khatPrman = khatPrman;
    }
//    public String khatPani;
    public String getKhatPani() {
        return khatPani;
    }
    
    public void setKhatPani(String khatPani) {
        this.khatPani = khatPani;
    }
//    public String khatPrinam;
    public String getKhatPrinam() {
        return khatPrinam;
    }
    
    public void setKhatPrinam(String khatPrinam) {
        this.khatPrinam = khatPrinam;
    }
    
    public static Vector getHeaderForSearch() {
        Vector v = new Vector();
        
        v.add("प्लॉट नंबर");
        v.add("दिवस");
        v.add("वातावरण");
        v.add("दिनांक");
        
        v.add("खत नाव");
        v.add("खत प्रमाण");
        v.add("पाणी");
        v.add("परिणाम");
        return v;
    }
    
    public Vector getDetailsForSearch() {
        Vector v = new Vector();
//        (ploatNo,days,climate,dinak,khatNav,khatPrman,khatPani,khatPrinam)
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(khatNav);
        v.add(khatPrman);
        v.add(khatPani);
        v.add(khatPrinam);
        return v;
    }
    
    public Vector getDetailsForReports(Vector<String> vector) {
        Vector v = new Vector();
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(khatNav);
        v.add(khatPrman);
        v.add(khatPani);
        v.add(khatPrinam);
        return v;
    }
    
}
