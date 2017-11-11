/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.application.report;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.application.Application;
import org.application.dashboard.Dashboard;
import org.application.plot.EntityPlot;
import org.application.vevhar.EntityAushadh;
import org.application.vevhar.VevharDAO;

/**
 *
 * @author abhayjadhav
 */
public class ReportUI extends javax.swing.JPanel {

    public static ReportUI instance = null;
    public EntityPlot plot = null;
    public ArrayList<EntityPlot> plotList = null;
    private Vector header = new Vector();
    private Vector data = new Vector();
    /**
     * Creates new form AllReport
     */
    
    public static ReportUI getInstance() {
        if (instance == null) {
            instance = new ReportUI();
        }
        return instance;
    }
    
    public static void disposeInstance() {
        instance = null;
    }
    
    public ReportUI() {
        initComponents();
        build_GUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fillerLeft = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0));
        fillerUp = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        fillerRight = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0));
        fillerDown = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        add(fillerLeft, java.awt.BorderLayout.LINE_START);
        add(fillerUp, java.awt.BorderLayout.PAGE_START);
        add(fillerRight, java.awt.BorderLayout.LINE_END);
        add(fillerDown, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("रिपोर्ट पर्याय"));
        jPanel2.setLayout(null);

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(461, 65, 97, 29);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 20, 570, 100);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);
        jButton1.setBounds(110, 340, 97, 29);

        jButton2.setText("jButton2");
        jPanel1.add(jButton2);
        jButton2.setBounds(240, 340, 97, 29);

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(reportTable);

        jScrollPane1.setViewportView(jScrollPane2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 570, 190);

        jButton5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton5.setText("रद्द करा");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(350, 330, 150, 38);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Application.getInstance().display_Panel(Dashboard.getInstance());
        disposeInstance();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        VevharDAO vevharDAO = new VevharDAO();
        plot = new EntityPlot();
        plotList = vevharDAO.getAllPlot();
        if(plotList != null && plotList.size()>0) {
            updatePlotTable(plotList);
        } else {
            JOptionPane.showMessageDialog(Application.getCurrentPanel(), "No Record Found",
                            "Details", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler fillerDown;
    private javax.swing.Box.Filler fillerLeft;
    private javax.swing.Box.Filler fillerRight;
    private javax.swing.Box.Filler fillerUp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable reportTable;
    // End of variables declaration//GEN-END:variables

    private void build_GUI() {
        this.setBorder(BorderFactory.createTitledBorder(""));
        this.setPreferredSize(new Dimension(750, 500));
    }

    private void updatePlotTable(ArrayList<EntityPlot> plotList) {
//        reportTable
        DefaultTableModel model = (DefaultTableModel) reportTable.getModel();
        header.removeAllElements();
        data.removeAllElements();
        header = EntityPlot.getHeaderForSearch();
        for(EntityPlot plot : plotList) {
            data.add(plot.getDetailsForSearch());
        }
        model.setDataVector(data, header);
        reportTable.setModel(model);
        TableRowSorter<? extends TableModel> sort = new TableRowSorter<>(model);
        reportTable.setRowSorter(sort);
        model.fireTableDataChanged();
    }
}