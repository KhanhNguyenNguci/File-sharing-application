/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.event.ActionListener;

/**
 *
 * @author NKT
 */
public class PanelStatus_Item extends javax.swing.JPanel {

    /**
     * Creates new form PanelStatus
     */
    public PanelStatus_Item() {
        initComponents();
    }
    public void showStatus(int values){
        pro.setValue(values);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pro = new javax.swing.JProgressBar();
        cmd = new javax.swing.JButton();

        pro.setStringPainted(true);

        cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/download.png"))); // NOI18N
        cmd.setContentAreaFilled(false);
        cmd.setName("S"); // NOI18N
        cmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pro, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActionPerformed
        // TODO add your handling code here:
        if(cmd.getName().equals("R")){
            cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resume.jpg")));
            cmd.setName("P");
            eventPause.actionPerformed(evt);
        }else if(cmd.getName().equals("P")){
            cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pause.png")));
            cmd.setName("R");
            eventPause.actionPerformed(evt);
        }else if(cmd.getName().equals("S")){
            eventSave.actionPerformed(evt);
        }
    }//GEN-LAST:event_cmdActionPerformed

    private ActionListener eventSave;
    private ActionListener eventPause;
    public void addEventSave(ActionListener eventSave){
        this.eventSave = eventSave;
    }
    public void addEvent(ActionListener event){
        this.eventPause = event;
    }
    public void done(){
        cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/done.png")));
        cmd.setName("D");
    }
    public void lock(){
        cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock.jpg")));
        cmd.setName("L");
    }
    public boolean isPause(){
        return cmd.getName().equals("P");
    }
    public void startFile(){
        cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pause.png")));
        cmd.setName("R");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd;
    private javax.swing.JProgressBar pro;
    // End of variables declaration//GEN-END:variables
}