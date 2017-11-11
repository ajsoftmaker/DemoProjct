/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.application.vevhar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.application.data.InitDatabase;
import org.application.plot.EntityPlot;

/**
 *
 * @author abhayjadhav
 */
public class VevharDAO {
    
    public EntityPlot plot = null;
    public ArrayList<EntityPlot> plotList = null;
    
    public ArrayList<EntityPlot> getAllPlot() {
            
        try {
            Connection con = InitDatabase.getInstance().getConnection();
            //Search
            Statement stm = con.createStatement();
            String query = "select * from plot";
            ResultSet rs = stm.executeQuery(query);
            plotList = new ArrayList<>();
            while(rs.next()) {
                
                plot = new EntityPlot();
                plot.setPlotNo(rs.getInt("plotNo"));
                plot.setShetrphal(rs.getString("shetrphal"));
                plot.setZadanchiSankhya(rs.getInt("zadanchiSankhya"));
                plot.setZadanMadhilAntar(rs.getInt("zadanMadhilAntar"));
                plot.setOlinMadhilAntar(rs.getInt("olinMadhilAntar"));
                plot.setZadanchiJat(rs.getString("zadanchiJat"));
                
                plotList.add(plot);
            }
        } catch (Exception ex) {
            Logger.getLogger(VevharDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plotList;
            
    }

    public boolean saveAushad(EntityAushadh aushad) {
        try {
            Connection con = InitDatabase.getInstance().getConnection();
            String query = "insert into aushadh(plotNo,divas,vatavrn,dinak,aushadhNav,aushadhPrman,aushadhVatavrn,aushadhRogacheNav,aushadhPrinam) values("
                    + aushad.getPlotNo()+","
                    + aushad.getDivas()+","
                    + "'"+ aushad.getVatavrn()+"',"
                    + "'"+ aushad.getDinak()+"',"
                    + "'"+ aushad.getAushadhNav()+"',"
                    + "'"+ aushad.getAushadhPrman()+"',"
                    + "'"+ aushad.getAushadhVatavrn()+"',"
                    + "'"+ aushad.getAushadhRogacheNav()+"',"
                    + "'"+ aushad.getAushadhPrinam()+"')";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.execute();
        } catch(Exception e) {
            System.out.println("Fail "+e);
            return false;
        }
        return true;
    }

    public boolean saveKhat(EntityKhat khat) {
        try{
            Connection con = InitDatabase.getInstance().getConnection();
            String query = "insert into khat(plotNo,divas,vatavrn,dinak,khatNav,khatPrman,khatPani,khatPrinam) values("
                    + khat.getPlotNo()+","
                    + khat.getDivas()+","
                    + "'"+ khat.getVatavrn()+"',"
                    + "'"+ khat.getDinak()+"',"
                    + "'"+ khat.getKhatNav()+"',"
                    + "'"+ khat.getKhatPrman()+"',"
                    + "'"+ khat.getKhatPani()+"',"
                    + "'"+ khat.getKhatPrinam()+"')";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.execute();
        }catch(Exception e) {
            System.out.println("Fail "+e);
            return false;
        }
        return true;
    }

    public boolean savePani(EntityPani pani) {
        try{
            Connection con = InitDatabase.getInstance().getConnection();
            String query = "insert into pani(plotNo,divas,vatavrn,dinak,paniPrkar,paniTaas) values("
                    + pani.getPlotNo()+","
                    + pani.getDivas()+","
                    + "'"+ pani.getVatavrn()+"',"
                    + "'"+ pani.getDinak()+"',"
                    + "'"+ pani.getPaniPrkar()+"',"
                    + "'"+ pani.getPaniTaas()+"')";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.execute();
        } catch(Exception e) {
            System.out.println("Fail "+e);
            return false;
        }
        return true;
    }

    public boolean saveKamgar(EntityKamgar kamgar) {
        try{
            Connection con = InitDatabase.getInstance().getConnection();
            String query = "insert into kamgar(plotNo,divas,vatavrn,dinak,kamgarPrkar,kamgarSankhya) values("
                    + kamgar.getPlotNo()+","
                    + kamgar.getDivas()+","
                    + "'"+ kamgar.getVatavrn()+"',"
                    + "'"+ kamgar.getDinak()+"',"
                    + "'"+ kamgar.getKamgarPrkar()+"',"
                    + kamgar.getKamgarSankhya()+")";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.execute();
        } catch(Exception e) {
            System.out.println("Fail "+e);
            return false;
        }
        return true;
    }

    public boolean saveKharch(EntityKharch kharch) {
        try{
            Connection con = InitDatabase.getInstance().getConnection();
            String query = "insert into kharch(plotNo,divas,vatavrn,dinak,kharchPrkar,kharchUpPrkar,kharchRakkam) values("
                    + kharch.getPlotNo()+","
                    + kharch.getDivas()+","
                    + "'"+ kharch.getVatavrn()+"',"
                    + "'"+ kharch.getDinak()+"',"
                    + "'"+ kharch.getKharchPrkar()+"',"
                    + "'"+ kharch.getKharchUpPrkar()+"',"
                    + kharch.getKharchRakkam()+")";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.execute();
        } catch(Exception e) {
            System.out.println("Fail "+e);
            return false;
        }
        return true;
    }

    public boolean saveJama(EntityJama jama) {
        try{
            Connection con = InitDatabase.getInstance().getConnection();
            String query = "insert into jama(plotNo,divas,vatavrn,dinak,jamaPrkar,jamaUpPrkar,jamaRakkam) values("
                    + jama.getPlotNo()+","
                    + jama.getDivas()+","
                    + "'"+ jama.getVatavrn()+"',"
                    + "'"+ jama.getDinak()+"',"
                    + "'"+ jama.getJamaPrkar()+"',"
                    + "'"+ jama.getJamaUpPrkar()+"',"
                    + jama.getJamaRakkam()+")";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.execute();
        } catch(Exception e) {
            System.out.println("Fail "+e);
            return false;
        }
        return true;
    }
    
}
