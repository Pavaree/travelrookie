/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Final;

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

        if (page.place.equals("Australia")) {
            img1.setIcon(new ImageIcon("src\\pic\\aus\\12apostles.jpg"));
            name1.setText("Apostles");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\pic\\aus\\bondibeach.jpg"));
            name2.setText("Bondibeach");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img3.setIcon(new ImageIcon("src\\pic\\aus\\sydneyopera.jpg"));
            name3.setText("Sydneyopera");
            season3.setText("ช่วงเวลาที่เหมาะสม ช่วงคริสต์มาสถึงปีใหม่");
        } else if (page.place.equals("Canada")) {
            img1.setIcon(new ImageIcon("src\\pic\\canada\\banff-national-park.jpg"));
            name1.setText("Banff National Park");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\pic\\canada\\niagara-falls.jpg"));
            name2.setText("Niagara Falls");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img3.setIcon(new ImageIcon("src\\pic\\canada\\ottawa.jpg"));
            name3.setText("Ottawa");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("China")) {
            img1.setIcon(new ImageIcon("src\\pic\\china\\798 Art District_5.jpg"));
            name1.setText("798 Art District");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\pic\\china\\Great Wall of China_3.jpg"));
            name2.setText("Great Wall of China");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูใบไม้ผลิ และฤดูหนาว");
            img3.setIcon(new ImageIcon("src\\pic\\china\\Olympic Stadium 2008_3.jpg"));
            name3.setText("The Beijing National Stadium");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Croatia")) {
            img1.setIcon(new ImageIcon("src\\pic\\croatia\\dubrovnikwalls.jpg"));
            name1.setText("Dubrovnik Old Town");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\pic\\croatia\\Plitvice_Lakes-National-Park.jpg"));
            name2.setText("Plitvice National Park");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img3.setIcon(new ImageIcon("src\\pic\\croatia\\hvartown.jpg"));
            name3.setText("Hvar Town");
            season3.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
        } else if (page.place.equals("Denmark")) {
            img1.setIcon(new ImageIcon("src\\pic\\denmark\\mulafossur.jpg"));
            name1.setText("Mulafossur Waterfall");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\pic\\denmark\\Torshavn.jpg"));
            name2.setText("Torshavn");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\denmark\\cityhallsquare.jpeg"));
            name3.setText("City Hall Square");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Hungary")) {
            img1.setIcon(new ImageIcon("src\\pic\\hungary\\budacastle.jpg"));
            name1.setText("Buda Castle");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล แต่จะให้ดีที่สุดคือ ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\pic\\hungary\\Szechenyi-Baths.jpg"));
            name2.setText("Széchenyi Thermal Bath");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\hungary\\gellerthill.jpg"));
            name3.setText("Gellert Hill");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Iceland")) {
            img1.setIcon(new ImageIcon("src\\pic\\iceland\\bluelagoon.jpg"));
            name1.setText("Blue Lagoon");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว");
            img2.setIcon(new ImageIcon("src\\pic\\iceland\\hallgrimskirkja.jpg"));
            name2.setText("Hallgrimskirkja");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\iceland\\gullfoss.jpg"));
            name3.setText("Gullfoss");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Indonesia")) {
            img1.setIcon(new ImageIcon("src\\pic\\indonesia\\Bali.jpg"));
            name1.setText("Bali");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\pic\\indonesia\\borobudur.jpg"));
            name2.setText("Borobudur");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\indonesia\\bunaken.jpg"));
            name3.setText("Bunaken");
            season3.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
        } else if (page.place.equals("Japan")) {
            img1.setIcon(new ImageIcon("src\\pic\\japan\\fuji.jpg"));
            name1.setText("Fuji");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว ฤดุใบไม้ผลิ ฤดูใบไม้ร่วง");
            img2.setIcon(new ImageIcon("src\\pic\\japan\\hokkaido.jpg"));
            name2.setText("Hokkaido");
            season2.setText("ช่วงเวลาที่เหมาะสม ช่วงกลางปีจนถึงฤดูร้อน");
            img3.setIcon(new ImageIcon("src\\pic\\japan\\Shirakawa-go.jpg"));
            name3.setText("Shirakawa-go");
            season3.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว");
        } else if (page.place.equals("Thailand")) {
            img1.setIcon(new ImageIcon("src\\pic\\thailand\\Tarutao-National-Park-.jpg"));
            name1.setText("Tarutao");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\pic\\thailand\\Intanon.jpg"));
            name2.setText("Intanon");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว");
            img3.setIcon(new ImageIcon("src\\pic\\thailand\\amphawa.jpg"));
            name3.setText("Amphawa");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Switzerland")) {
            img1.setIcon(new ImageIcon("src\\pic\\Switzerland\\Zytgloggeturm_2.jpg"));
            name1.setText("Zytgloggeturm");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\pic\\Switzerland\\Munster_4.jpg"));
            name2.setText("Munster");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\Switzerland\\Nydeggbrücke_2.jpg"));
            name3.setText("Nydeggbrücke");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Singapore")) {
            img1.setIcon(new ImageIcon("src\\pic\\Singapore\\Sea Aquarium_1.jpg"));
            name1.setText("Sea Aquarium");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\pic\\Singapore\\Gardens by the Bay_2.jpg"));
            name2.setText("Gardens by the Bay");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\Singapore\\Universal Studios Singapore_2.jpg"));
            name3.setText("Universal Studios Singapore");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Turkey")) {
            img1.setIcon(new ImageIcon("src\\pic\\Turkey\\Pamukkale_2.jpg"));
            name1.setText("Pamukkale");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\pic\\Turkey\\Ephesus_3.jpg"));
            name2.setText("Ephesus");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\Turkey\\Istanbul_3.jpg"));
            name3.setText("Istanbul");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Norway")) {
            img1.setIcon(new ImageIcon("src\\pic\\Norway\\Oslo_2.jpg"));
            name1.setText("Oslo");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\pic\\Norway\\Tromso_2.jpg"));
            name2.setText("Tromso");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว");
            img3.setIcon(new ImageIcon("src\\pic\\Norway\\Lofoten_3.jpg"));
            name3.setText("Lofoten");
            season3.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว");
        } else if (page.place.equals("South Africa")) {
            img1.setIcon(new ImageIcon("src\\pic\\South Africa\\Bo Kaap_1.jpg"));
            name1.setText("Bo Kaap");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\pic\\South Africa\\moro gelato_1.jpg"));
            name2.setText("MORO GELATO");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\South Africa\\V & A Waterfront_3.jpg"));
            name3.setText("V & A Waterfront");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุถกช่วงฤดูกาล");
        } else if (page.place.equals("United States")) {
            img1.setIcon(new ImageIcon("src\\pic\\US\\United States Capitol_3.jpg"));
            name1.setText("United States Capitol");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\pic\\US\\Lincoln Memorial_1.jpg"));
            name2.setText("Lincoln Memorial");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\US\\Smithsonian Institution_2.jpg"));
            name3.setText("Smithsonian Institution");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุถกช่วงฤดูกาล");
        } else if (page.place.equals("Mexico")) {
            img1.setIcon(new ImageIcon("src\\pic\\Mexico\\Polanco_1.jpg"));
            name1.setText("Polanco");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\pic\\Mexico\\Casa Azul – Frida House_2.jpg"));
            name2.setText("Casa Azul");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\Mexico\\the national museum of anthropology_3.jpg"));
            name3.setText("The National Museum of Anthropology");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุถกช่วงฤดูกาล");
        }
         else if (page.place.equals("England")) {
            img1.setIcon(new ImageIcon("src\\pic\\England\\Tower of London_3.jpg"));
            name1.setText("Tower of London");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\pic\\England\\Casa Azul – Frida House_2.jpg"));
            name2.setText("Stonehenge");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\England\\British Museum_5.jpg"));
            name3.setText("British Museum");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุถกช่วงฤดูกาล");
        }
         else if (page.place.equals("Korea")) {
            img1.setIcon(new ImageIcon("src\\pic\\South Korea\\Bukchon Hanok Village_3.jpg"));
            name1.setText("Bukchon Hanok Village");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\pic\\South Korea\\N Seoul Tower_2.jpg"));
            name2.setText("N Seoul Tower");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\pic\\South Korea\\Cheonggye Plaza_3.jpg"));
            name3.setText("Cheonggye Plaza");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุถกช่วงฤดูกาล");
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(930, 630));

        Page_place.setBackground(new java.awt.Color(221, 119, 119));
        Page_place.setPreferredSize(new java.awt.Dimension(930, 630));
        Page_place.setRequestFocusEnabled(false);

        txt_recommended.setFont(new java.awt.Font("OCR A Extended", 0, 48)); // NOI18N
        txt_recommended.setForeground(new java.awt.Color(255, 255, 255));
        txt_recommended.setText("Recommended Place");

        name1.setFont(new java.awt.Font("Consolas", 0, 26)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("name1");

        season1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        season1.setForeground(new java.awt.Color(255, 255, 255));
        season1.setText("season1");

        name2.setFont(new java.awt.Font("Consolas", 0, 26)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setText("name2");

        season2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        season2.setForeground(new java.awt.Color(255, 255, 255));
        season2.setText("season2");

        name3.setFont(new java.awt.Font("Consolas", 0, 26)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setText("name3");

        season3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        season3.setForeground(new java.awt.Color(255, 255, 255));
        season3.setText("season3");

        img1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ช่วงเวลาที่เหมาะสม");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ช่วงเวลาที่เหมาะสม");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ช่วงเวลาที่เหมาะสม");

        javax.swing.GroupLayout Page_placeLayout = new javax.swing.GroupLayout(Page_place);
        Page_place.setLayout(Page_placeLayout);
        Page_placeLayout.setHorizontalGroup(
            Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Page_placeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_recommended)
                .addGap(240, 240, 240))
            .addGroup(Page_placeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Page_placeLayout.createSequentialGroup()
                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Page_placeLayout.createSequentialGroup()
                        .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Page_placeLayout.createSequentialGroup()
                                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(Page_placeLayout.createSequentialGroup()
                                        .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(56, 56, 56))
                                    .addGroup(Page_placeLayout.createSequentialGroup()
                                        .addComponent(season1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)))
                                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(season2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57))
                            .addGroup(Page_placeLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(season3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(47, 47, 47))
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
                .addGap(10, 10, 10)
                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name3)
                    .addComponent(name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(season1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(season2)
                    .addComponent(season3))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Page_place, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Page_place, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Page_place;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel season1;
    private javax.swing.JLabel season2;
    private javax.swing.JLabel season3;
    private javax.swing.JLabel txt_recommended;
    // End of variables declaration//GEN-END:variables
}
