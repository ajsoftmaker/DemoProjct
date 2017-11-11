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
public class EntityKamgar {
    
    public int kamgarNo;
    public int plotNo;
    public int divas;
    public String vatavrn;
    public Date dinak;
    
    public String kamgarPrkar;
    public int kamgarSankhya;
    
    public int getKamgarNo() {
        return kamgarNo;
    }
    
    public void setKamgarNo(int amgarNo) {
        this.kamgarNo = kamgarNo;
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
    
//    public String kamgarPrkar;
    public String getKamgarPrkar() {
        return kamgarPrkar;
    }
    
    public void setKamgarPrkar(String kamgarPrkar) {
        this.kamgarPrkar = kamgarPrkar;
    }
//    public int kamgarSankhya;
    public int getKamgarSankhya() {
        return kamgarSankhya;
    }
    
    public void setKamgarSankhya(int kamgarSankhya) {
        this.kamgarSankhya = kamgarSankhya;
    }
    
    public static Vector getHeaderForSearch() {
        Vector v = new Vector();
        
        v.add("प्लॉट नंबर");
        v.add("दिवस");
        v.add("वातावरण");
        v.add("दिनांक");
        
        v.add("कामाचा प्रकार");
        v.add("कामगार संख्या");
        return v;
    }
    
    public Vector getDetailsForSearch() {
        Vector v = new Vector();
//        (ploatNo,days,climate,dinak,kamgarPrkar,kamgarSankhya)
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(kamgarPrkar);
        v.add(kamgarSankhya);
        return v;
    }
    
    public Vector getDetailsForReports(Vector<String> vector) {
        Vector v = new Vector();
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(kamgarPrkar);
        v.add(kamgarSankhya);
        return v;
    }
    
}
