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
public class EntityJama {
    
    public int jamaNo;
    public int plotNo;
    public int divas;
    public String vatavrn;
    public Date dinak;
    
    public String jamaPrkar;
    public String jamaUpPrkar;
    public int jamaRakkam;
    
    public int getJamaNo() {
        return jamaNo;
    }
    
    public void setJamaNo(int jamaNo) {
        this.jamaNo = jamaNo;
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
    
//    public String jamaPrkar;
    public String getJamaPrkar() {
        return jamaPrkar;
    }
    
    public void setJamaPrkar(String jamaPrkar) {
        this.jamaPrkar = jamaPrkar;
    }
//    public String jamaUpPrkar;
    public String getJamaUpPrkar() {
        return jamaUpPrkar;
    }
    
    public void setJamaUpPrkar(String jamaUpPrkar) {
        this.jamaUpPrkar = jamaUpPrkar;
    }
//    public int jamaRakkam;
    public int getJamaRakkam() {
        return jamaRakkam;
    }
    
    public void setJamaRakkam(int jamaRakkam) {
        this.jamaRakkam = jamaRakkam;
    }
    
    public static Vector getHeaderForSearch() {
        Vector v = new Vector();
        
        v.add("प्लॉट नंबर");
        v.add("दिवस");
        v.add("वातावरण");
        v.add("दिनांक");
        
        v.add("जमेचा प्रकार");
        v.add("उपप्रकार");
        v.add("जमेची रक्कम");
        return v;
    }
    
    public Vector getDetailsForSearch() {
        Vector v = new Vector();
//        (ploatNo,days,climate,dinak,jamaPrkar,jamaUpPrkar,jamaRakkam)
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(jamaPrkar);
        v.add(jamaUpPrkar);
        v.add(jamaRakkam);
        return v;
    }
    
    public Vector getDetailsForReports(Vector<String> vector) {
        Vector v = new Vector();
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(jamaPrkar);
        v.add(jamaUpPrkar);
        v.add(jamaRakkam);
        return v;
    }
    
}
