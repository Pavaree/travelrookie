/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Pavaree
 */
public class Place extends javax.swing.JInternalFrame {

    TravelRookie page;

    /**
     * Creates new form Place
     */
    public Place() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);

    }

    public Place(TravelRookie in) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        this.page = in;
        System.out.println(page.place);
        showInfo();
    }

    public void showInfo() {
        String path = "../place_image/australia/bondibeach.jpg";
        
        if (page.place.equals("Australia")){
            img1.setIcon(new ImageIcon("src\\aus\\12apostles.jpg"));
            name1.setText("Apostles");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\aus\\bondibeach.jpg"));
            name2.setText("Bondibeach");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img3.setIcon(new ImageIcon("src\\aus\\sydneyopera.jpg"));
            name3.setText("Sydneyopera");
            season3.setText("ช่วงเวลาที่เหมาะสม ช่วงคริสต์มาสถึงปีใหม่");
//        }else if(page.place.equals("Australia")){
//            img1.setIcon(new ImageIcon("src\\aus\\12apostles.jpg"));
//            name1.setText("Apostles");
//            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
//            img2.setIcon(new ImageIcon("src\\aus\\bondibeach.jpg"));
//            name2.setText("Bondibeach");
//            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
//            img3.setIcon(new ImageIcon("src\\aus\\sydneyopera.jpg"));
//            name3.setText("Sydneyopera");
//            season3.setText("ช่วงเวลาที่เหมาะสม ช่วงคริสต์มาสถึงปีใหม่");
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Page_place = new javax.swing.JPanel();
        txt_recommended = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        season1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        season2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        season3 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(930, 630));

        Page_place.setBackground(new java.awt.Color(3, 151, 161));
        Page_place.setPreferredSize(new java.awt.Dimension(930, 630));
        Page_place.setRequestFocusEnabled(false);

        txt_recommended.setFont(new java.awt.Font("Harlow Solid Italic", 0, 48)); // NOI18N
        txt_recommended.setForeground(new java.awt.Color(255, 255, 255));
        txt_recommended.setText("Recommended Place");

        name1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 26)); // NOI18N
        name1.setText("name1");

        season1.setFont(new java.awt.Font("CordiaUPC", 0, 18)); // NOI18N
        season1.setText("เหมาะสม");

        name2.setFont(new java.awt.Font("Harlow Solid Italic", 0, 26)); // NOI18N
        name2.setText("name2");

        season2.setText("season2");

        name3.setFont(new java.awt.Font("Harlow Solid Italic", 0, 26)); // NOI18N
        name3.setText("name3");

        season3.setText("season3");

        img1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout Page_placeLayout = new javax.swing.GroupLayout(Page_place);
        Page_place.setLayout(Page_placeLayout);
        Page_placeLayout.setHorizontalGroup(
            Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Page_placeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Page_placeLayout.createSequentialGroup()
                        .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Page_placeLayout.createSequentialGroup()
                                .addComponent(season1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(Page_placeLayout.createSequentialGroup()
                                .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(56, 56, 56)))
                        .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(season2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(season3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Page_placeLayout.createSequentialGroup()
                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addGroup(Page_placeLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(txt_recommended)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Page_placeLayout.setVerticalGroup(
            Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Page_placeLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txt_recommended, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name3)))
                .addGap(18, 18, 18)
                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(season1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(season2)
                    .addComponent(season3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Page_place, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Page_place, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Page_place;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel season1;
    private javax.swing.JLabel season2;
    private javax.swing.JLabel season3;
    private javax.swing.JLabel txt_recommended;
    // End of variables declaration//GEN-END:variables
}
