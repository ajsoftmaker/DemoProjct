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
public class EntityKharch {
    
    public int kharchNo;
    public int plotNo;
    public int divas;
    public String vatavrn;
    public Date dinak;
    
    public String kharchPrkar;
    public String kharchUpPrkar;
    public int kharchRakkam;
    
    public int getKharchNo() {
        return kharchNo;
    }
    
    public void setKharchNo(int kharchNo) {
        this.kharchNo = kharchNo;
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
//    public String kharchPrkar;
    public String getKharchPrkar() {
        return kharchPrkar;
    }
    
    public void setKharchPrkar(String kharchPrkar) {
        this.kharchPrkar = kharchPrkar;
    }
//    public String kharchUpPrkar;
    public String getKharchUpPrkar() {
        return kharchUpPrkar;
    }
    
    public void setKharchUpPrkar(String kharchUpPrkar) {
        this.kharchUpPrkar = kharchUpPrkar;
    }
//    public int kharchRakkam;
    public int getKharchRakkam() {
        return kharchRakkam;
    }
    
    public void setKharchRakkam(int kharchRakkam) {
        this.kharchRakkam = kharchRakkam;
    }
    
    public static Vector getHeaderForSearch() {
        Vector v = new Vector();
        
        v.add("प्लॉट नंबर");
        v.add("दिवस");
        v.add("वातावरण");
        v.add("दिनांक");
        
        v.add("खर्चाचा प्रकार");
        v.add("उपप्रकार");
        v.add("खर्चाची रक्कम");
        return v;
    }
    
    public Vector getDetailsForSearch() {
        Vector v = new Vector();
//        (ploatNo,days,climate,dinak,kharchPrkar,kharchUpPrkar,kharchRakkam)
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(kharchPrkar);
        v.add(kharchUpPrkar);
        v.add(kharchRakkam);
        return v;
    }
    
    public Vector getDetailsForReports(Vector<String> vector) {
        Vector v = new Vector();
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(kharchPrkar);
        v.add(kharchUpPrkar);
        v.add(kharchRakkam);
        return v;
    }
    
}
