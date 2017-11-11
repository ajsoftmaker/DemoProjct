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
public class EntityPani {
    
    public int paniNo;
    public int plotNo;
    public int divas;
    public String vatavrn;
    public Date dinak;
    
    public String paniPrkar;
    public String paniTaas;
    
    public int getPaniNo() {
        return paniNo;
    }
    
    public void setPaniNo(int paniNo) {
        this.paniNo = paniNo;
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
//    public String paniPrkar;
    public String getPaniPrkar() {
        return paniPrkar;
    }
    
    public void setpaniPrkar(String paniPrkar) {
        this.paniPrkar = paniPrkar;
    }
//    public String paniTaas;
    public String getPaniTaas() {
        return paniTaas;
    }
    
    public void setpaniTaas(String paniTaas) {
        this.paniTaas = paniTaas;
    }
    
    public static Vector getHeaderForSearch() {
        Vector v = new Vector();
        
        v.add("प्लॉट नंबर");
        v.add("दिवस");
        v.add("वातावरण");
        v.add("दिनांक");
        
        v.add("प्रकार");
        v.add("किती तास सोडले");
        return v;
    }
    
    public Vector getDetailsForSearch() {
        Vector v = new Vector();
//        (ploatNo,days,climate,dinak,paniPrkar,paniTaas)
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(paniPrkar);
        v.add(paniTaas);
        return v;
    }
    
    public Vector getDetailsForReports(Vector<String> vector) {
        Vector v = new Vector();
        v.add(plotNo);
        v.add(divas);
        v.add(vatavrn);
        v.add(dinak);
        
        v.add(paniPrkar);
        v.add(paniTaas);
        return v;
    }
    
}
