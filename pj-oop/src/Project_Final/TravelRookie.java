/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Final;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Pavaree
 * 
 */
public class TravelRookie extends javax.swing.JFrame {
    public String place;
    /**
     * Creates new form TravelRookie
     */
    
    
    public TravelRookie() {
        initComponents();
        btn_place.setVisible(false);
        btn_money.setVisible(false);
        btn_time_emp.setVisible(false);
        Home h = new Home(this);
        main_page.add(h).setVisible(true);
    }
    void setColor(JPanel panel){
        panel.setBackground(new Color(221,119,119));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(188,72,115));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_up = new javax.swing.JPanel();
        img_exit = new javax.swing.JLabel();
        tab_beside = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        txt_home = new javax.swing.JLabel();
        img_home = new javax.swing.JLabel();
        btn_time_emp = new javax.swing.JPanel();
        img_time = new javax.swing.JLabel();
        txt_time = new javax.swing.JLabel();
        btn_money = new javax.swing.JPanel();
        img_money = new javax.swing.JLabel();
        txt_money = new javax.swing.JLabel();
        btn_place = new javax.swing.JPanel();
        img_place = new javax.swing.JLabel();
        txt_place = new javax.swing.JLabel();
        main_page = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab_up.setBackground(new java.awt.Color(39, 35, 67));
        tab_up.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tab_upMouseDragged(evt);
            }
        });
        tab_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab_upMousePressed(evt);
            }
        });

        img_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test_imges/icons8_close_window_30px.png"))); // NOI18N
        img_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab_upLayout = new javax.swing.GroupLayout(tab_up);
        tab_up.setLayout(tab_upLayout);
        tab_upLayout.setHorizontalGroup(
            tab_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_upLayout.createSequentialGroup()
                .addContainerGap(1115, Short.MAX_VALUE)
                .addComponent(img_exit)
                .addContainerGap())
        );
        tab_upLayout.setVerticalGroup(
            tab_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(tab_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 60));

        tab_beside.setBackground(new java.awt.Color(57, 55, 91));
        tab_beside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(221, 119, 119));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });
        btn_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_home.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_home.setForeground(new java.awt.Color(255, 255, 255));
        txt_home.setText("Home");
        btn_home.add(txt_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 85, 20));

        img_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test_imges/icons8_home_20px_1.png"))); // NOI18N
        btn_home.add(img_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        tab_beside.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 40));

        btn_time_emp.setBackground(new java.awt.Color(188, 72, 115));
        btn_time_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_time_empMouseClicked(evt);
            }
        });
        btn_time_emp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test_imges/icons8_schedule_20px.png"))); // NOI18N
        btn_time_emp.add(img_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        txt_time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_time.setForeground(new java.awt.Color(255, 255, 255));
        txt_time.setText("Time & Temperature");
        btn_time_emp.add(txt_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 14, -1, -1));
        txt_time.getAccessibleContext().setAccessibleName("time&temp");

        tab_beside.add(btn_time_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 50));

        btn_money.setBackground(new java.awt.Color(188, 72, 115));
        btn_money.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_moneyMouseClicked(evt);
            }
        });

        img_money.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test_imges/icons8_exchange_20px_1.png"))); // NOI18N

        txt_money.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_money.setForeground(new java.awt.Color(255, 255, 255));
        txt_money.setText("Money");

        javax.swing.GroupLayout btn_moneyLayout = new javax.swing.GroupLayout(btn_money);
        btn_money.setLayout(btn_moneyLayout);
        btn_moneyLayout.setHorizontalGroup(
            btn_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_moneyLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(img_money)
                .addGap(18, 18, 18)
                .addComponent(txt_money, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        btn_moneyLayout.setVerticalGroup(
            btn_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_moneyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_moneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(img_money)
                    .addComponent(txt_money))
                .addGap(14, 14, 14))
        );

        tab_beside.add(btn_money, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 50));

        btn_place.setBackground(new java.awt.Color(188, 72, 115));
        btn_place.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_placeMouseClicked(evt);
            }
        });

        img_place.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test_imges/icons8_point_of_interest_20px_1.png"))); // NOI18N

        txt_place.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_place.setForeground(new java.awt.Color(255, 255, 255));
        txt_place.setText("Place");

        javax.swing.GroupLayout btn_placeLayout = new javax.swing.GroupLayout(btn_place);
        btn_place.setLayout(btn_placeLayout);
        btn_placeLayout.setHorizontalGroup(
            btn_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_placeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(img_place)
                .addGap(18, 18, 18)
                .addComponent(txt_place, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        btn_placeLayout.setVerticalGroup(
            btn_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_placeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btn_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_place)
                    .addComponent(txt_place))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_beside.add(btn_place, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 50));

        getContentPane().add(tab_beside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 630));

        main_page.setBackground(new java.awt.Color(221, 119, 119));

        javax.swing.GroupLayout main_pageLayout = new javax.swing.GroupLayout(main_page);
        main_page.setLayout(main_pageLayout);
        main_pageLayout.setHorizontalGroup(
            main_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        main_pageLayout.setVerticalGroup(
            main_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(main_page, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 930, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int x,y;

    public JPanel getBtn_home() {
        return btn_home;
    }

    public void setBtn_home(JPanel btn_home) {
        this.btn_home = btn_home;
    }

    public JPanel getBtn_place() {
        return btn_place;
    }

    public void setBtn_place(JPanel btn_place) {
        this.btn_place = btn_place;
    }

    public JPanel getBtn_time_emp() {
        return btn_time_emp;
    }

    public void setBtn_time_emp(JPanel btn_time_emp) {
        this.btn_time_emp = btn_time_emp;
    }
    private void tab_upMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_upMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_tab_upMousePressed

    private void tab_upMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_upMouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_tab_upMouseDragged

    private void img_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_img_exitMouseClicked

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        // TODO add your handling code here:
        setColor(btn_home);
        resetColor(btn_time_emp);
        resetColor(btn_money);
        resetColor(btn_place);
        Home h = new Home(this);
        main_page.add(h).setVisible(true);
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_moneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_moneyMouseClicked
        // TODO add your handling code here:
        setColor(btn_money);
        resetColor(btn_time_emp);
        resetColor(btn_home);
        resetColor(btn_place);
        Money m = new Money();
        main_page.add(m).setVisible(true);
    }//GEN-LAST:event_btn_moneyMouseClicked

    private void btn_placeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_placeMouseClicked
        // TODO add your handling code here:
        setColor(btn_place);
        resetColor(btn_time_emp);
        resetColor(btn_money);
        resetColor(btn_home);
        Place p = new Place(this);
        main_page.add(p).setVisible(true);
    }//GEN-LAST:event_btn_placeMouseClicked

    private void btn_time_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_time_empMouseClicked
        // TODO add your handling code here:
        setColor(btn_time_emp);
        resetColor(btn_home);
        resetColor(btn_money);
        resetColor(btn_place);
        Time tt = new Time(place);
        
        main_page.add(tt).setVisible(true);
    }//GEN-LAST:event_btn_time_empMouseClicked
    
    public void click(){
        setColor(btn_time_emp);
        resetColor(btn_home);
        resetColor(btn_money);
        resetColor(btn_place);
        System.out.println("Hello");
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TravelRookie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelRookie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelRookie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelRookie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelRookie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_home;
    public javax.swing.JPanel btn_money;
    public javax.swing.JPanel btn_place;
    public javax.swing.JPanel btn_time_emp;
    private javax.swing.JLabel img_exit;
    private javax.swing.JLabel img_home;
    private javax.swing.JLabel img_money;
    private javax.swing.JLabel img_place;
    private javax.swing.JLabel img_time;
    private javax.swing.JDesktopPane main_page;
    private javax.swing.JPanel tab_beside;
    private javax.swing.JPanel tab_up;
    private javax.swing.JLabel txt_home;
    private javax.swing.JLabel txt_money;
    private javax.swing.JLabel txt_place;
    private javax.swing.JLabel txt_time;
    // End of variables declaration//GEN-END:variables

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }
    
    
    
}
