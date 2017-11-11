/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.application.plot;

import java.util.Vector;

/**
 *
 * @author abhayjadhav
 */
public class EntityPlot {

    public int plotNo;
    public String shetrphal;
    public int zadanchiSankhya;
    public int zadanMadhilAntar;
    public int olinMadhilAntar;
    public String zadanchiJat;
    
    public int getPlotNo() {
        return plotNo;
    }
    
    public void setPlotNo(int plotNo) {
        this.plotNo = plotNo;
    }
    
    public String getShetrphal() {
        return shetrphal;
    }
    
    public void setShetrphal(String shetrphal) {
        this.shetrphal = shetrphal;
    }
    
    public int getZadanchiSankhya() {
        return zadanchiSankhya;
    }
    
    public void setZadanchiSankhya(int zadanchiSankhya) {
        this.zadanchiSankhya = zadanchiSankhya;
    }
    
    public int getZadanMadhilAntar() {
        return zadanMadhilAntar;
    }
    
    public void setZadanMadhilAntar(int zadanMadhilAntar) {
        this.zadanMadhilAntar = zadanMadhilAntar;
    }
    
    public int getOlinMadhilAntar() {
        return olinMadhilAntar;
    }
    
    public void setOlinMadhilAntar(int olinMadhilAntar) {
        this.olinMadhilAntar = olinMadhilAntar;
    }
    
    public String getZadanchiJat() {
        return zadanchiJat;
    }
    
    public void setZadanchiJat(String zadanchiJat) {
        this.zadanchiJat = zadanchiJat;
    }
    
    public static Vector getHeaderForSearch() {
        Vector v = new Vector();
        
        v.add("प्लॉट नंबर");
        v.add("क्षेत्रफळ");
        v.add("झाडांची संख्या");
        v.add("झाडांमधील अंतर");
        v.add("ओळींमध्ये अंतर");
        v.add("झाडांची जात");
        return v;
    }

    public Vector getDetailsForSearch() {
        Vector v = new Vector();
//        (plotNo,shetrphal,zadanchiSankhya,zadanMadhilAntar,olinMadhilAntar,zadanchiJat)
        v.add(plotNo);
        v.add(shetrphal);
        v.add(zadanchiSankhya);
        v.add(zadanMadhilAntar);
        v.add(olinMadhilAntar);
        v.add(zadanchiJat);
        return v;
    }
    
    public Vector getDetailsForReports(Vector<String> vector) {
        Vector v = new Vector();
        v.add(this.plotNo);
        v.add(this.shetrphal);
        v.add(this.zadanchiSankhya);
        v.add(this.zadanMadhilAntar);
        v.add(this.olinMadhilAntar);
        v.add(this.zadanchiJat);
        return v;
    }
    
}
