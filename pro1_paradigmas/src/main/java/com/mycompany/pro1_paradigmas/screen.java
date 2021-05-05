package com.mycompany.pro1_paradigmas;

import com.mycompany.pro1_paradigmas.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Josue
 */
public class screen extends javax.swing.JFrame {

    /**
     * Creates new form screen
     */
    public screen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        in_ta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        out_ta = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        btn_file = new javax.swing.JMenu();
        btn_open = new javax.swing.JMenuItem();
        btn_play = new javax.swing.JMenu();
        btn_stop = new javax.swing.JMenu();
        btn_clear = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        in_ta.setColumns(20);
        in_ta.setRows(5);
        jScrollPane1.setViewportView(in_ta);

        out_ta.setColumns(20);
        out_ta.setRows(5);
        jScrollPane2.setViewportView(out_ta);

        btn_file.setText("File");

        btn_open.setText("Open");
        btn_open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                click_btn_open(evt);
            }
        });
        btn_file.add(btn_open);

        jMenuBar1.add(btn_file);

        btn_play.setText("Play");
        btn_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                click_btn_play(evt);
            }
        });
        jMenuBar1.add(btn_play);

        btn_stop.setText("Stop");
        jMenuBar1.add(btn_stop);

        btn_clear.setText("Clear");
        jMenuBar1.add(btn_clear);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void click_btn_play(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click_btn_play
        // TODO add your handling code here:
        String a = in_ta.getText();

        controller.algo(a);

        out_ta.setText(a);
    }//GEN-LAST:event_click_btn_play

    private void click_btn_open(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click_btn_open
        // TODO add your handling code here:
        
        controller.cargarTxt();
        
    }//GEN-LAST:event_click_btn_open

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btn_clear;
    private javax.swing.JMenu btn_file;
    private javax.swing.JMenuItem btn_open;
    private javax.swing.JMenu btn_play;
    private javax.swing.JMenu btn_stop;
    private javax.swing.JTextArea in_ta;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea out_ta;
    // End of variables declaration//GEN-END:variables
}
