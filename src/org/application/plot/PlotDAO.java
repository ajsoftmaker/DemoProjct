/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.application.plot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.application.data.InitDatabase;

/**
 *
 * @author abhayjadhav
 */
public class PlotDAO {
    
    public int getNextPlotNo() {
        int nextId = 1;
        try{
            Connection con = InitDatabase.getInstance().getConnection();
            //Search
            Statement stm = con.createStatement();
            String query = "select * from plot order by plotNo desc;";
            ResultSet rs = stm.executeQuery(query);
            if(rs.next()) {
                nextId = rs.getInt("plotNo") + 1;
            }
        }catch (Exception ex) {
            System.out.println(ex);
        }
        return nextId;
    }
    public boolean savePlot(EntityPlot plot) {
        try{
            Connection con = InitDatabase.getInstance().getConnection();
            
            //insert
            String query = "insert into plot(plotNo,shetrphal,zadanchiSankhya,zadanMadhilAntar,olinMadhilAntar,zadanchiJat) values("
                    + plot.getPlotNo()+","
                    + "'"+ plot.getShetrphal()+"',"
                    + plot.getZadanchiSankhya()+","
                    + plot.getZadanMadhilAntar()+","
                    + plot.getOlinMadhilAntar()+","
                    + "'"+ plot.getZadanchiJat()+"')";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.execute();
            
            //update
//            String query = "update tb1 set cl1= ? where cl2 = ?";
//            PreparedStatement preparedStmt = con.prepareStatement(query);
//            preparedStmt.setString(1,"Akshay");
//            preparedStmt.setInt(1,22);
//            preparedStmt.setString(2,"Jadhav");
//            preparedStmt.executeUpdate();
            
            //delete
//            String query = "delete from tb1 where cl1=?";
//            PreparedStatement pstm = con.prepareStatement(query);
//            pstm.setString(1, "Barney1");
//            pstm.executeUpdate();
            
            //Search
//            Statement stm = con.createStatement();
//            String query = "select * from tb1";
//            ResultSet rs = stm.executeQuery(query);
//            ArrayList<Book> bookList = new ArrayList<>();
//            while(rs.next()) {
//                Book bk = new Book();
//                bk.setId(rs.getLong("Id"));
//                bk.setName(rs.getString("Nmae"));
//                bookList.add(bk);
//                System.out.println(""+rs.getString("cl1")+" "+rs.getString("cl2")+" "+rs.getString("cl3")+" "+rs.getString("cl4"));
//            }
//            stm.close();
            
//            
//            con.close();
//            System.out.print("insert");
            
        } catch(Exception e) {
            System.out.print("fail"+e);
        }
        return true;
    }

    public ArrayList<EntityPlot> getAllPlot() {
        ArrayList<EntityPlot> plotList = new ArrayList<>();
        try{
            Connection con = InitDatabase.getInstance().getConnection();
            //Search
            Statement stm = con.createStatement();
            String query = "select * from plot";
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()) {
                EntityPlot plot = new EntityPlot();
                plot.setPlotNo(rs.getInt("plotNo"));
                plot.setShetrphal(rs.getString("shetrphal"));
                plot.setZadanchiSankhya(rs.getInt("zadanchiSankhya"));
                plot.setZadanMadhilAntar(rs.getInt("zadanMadhilAntar"));
                plot.setOlinMadhilAntar(rs.getInt("olinMadhilAntar"));
                plot.setZadanchiJat(rs.getString("zadanchiJat"));
                plotList.add(plot);
            }
        }catch (Exception ex) {
            System.out.println(ex);
        }
        return plotList;
    }
    
}
