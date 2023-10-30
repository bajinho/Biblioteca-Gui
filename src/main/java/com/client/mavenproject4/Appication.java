/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Frame.java to edit this template
 */
package com.client.mavenproject4;

import com.bajo.mavenproject1.bean.impl.PessoaRemote;
import java.security.PrivilegedActionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author bajinho
 */
public class Appication extends java.awt.Frame {

    /**
     * Creates new form Appication
     */
    public Appication() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setMenuBar(menuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    /**
     * @param args the command line arguments
     * @throws javax.naming.NamingException
     * @throws java.security.PrivilegedActionException
     * @throws java.lang.InterruptedException
     */
    // Invoke a stateful bean
    public static void main(String[] args) throws NamingException, PrivilegedActionException, InterruptedException {
        java.awt.EventQueue.invokeLater(() -> {
            new Appication().setVisible(true);
        });
        System.out.println("Hello World!");
        PessoaRemote pessoaRemote = invokeStatelessBean();

        if (pessoaRemote.consultarPorId(1L) != null) {
            System.out.println("Pessoa por Id: " + pessoaRemote.consultarPorId(1L).getNome());
        } else {
            System.out.println("Deu merda!");
        }

    }

    /**
     * Looks up a stateless bean and invokes on it
     *
     * @throws NamingException
     */
    private static PessoaRemote invokeStatelessBean() {
        try {
            InitialContext context = Invoker.getContext();
            return (PessoaRemote) context.lookup("ejb:/mavenproject1-1.0-SNAPSHOT/PessoaBean!"
                    + PessoaRemote.class.getName());
        } catch (NamingException e) {
            System.out.println("ERROR!: " + e);
            Logger.getLogger(Appication.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
