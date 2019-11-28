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

        if (page.place.equals("Australia")) {
            img1.setIcon(new ImageIcon("src\\aus\\12apostles.jpg"));
            name1.setText("Apostles");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            jTextField1.setText("เสาหินปูนที่ตั้งเรียงรายอย่างตระหง่านนอกขายฝั่งรัฐวิคตอเรียนี้จริงๆ "
                    + "นับได้เพียงเก้าต้น เท่านั้นแต่ว่าตั้งชื่อตามคริสต์ศาสนาว่ามีสิบสองต้นเพื่อวัตถุประสงค์ทางการท่องเที่ยว "
                    + " การกัดเซาะของ น้ำทะเลทำให้เสาต้นหนึ่งล้มไปแล้ว ส่วนที่เหลือก็คาดว่าจะประสบชะตากรรมเช่นเดียวกัน ลองเข้าไป "
                    + "ชมเสาเหล่านี้ได้จากถนนเกรท โอเชียน (Great Ocean Road) เขตเมืองเมลเบิร์น ซึ่งเป็นถนนขับรถ ชมวิวที่สวยที่สุดในทวีป ");
            img2.setIcon(new ImageIcon("src\\aus\\bondibeach.jpg"));
            name2.setText("Bondibeach");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            jTextField2.setText("ชายหาดบอนไดเป็นชายหาดที่เป็นเอกลักษณ์ที่มีชื่อเสียงมากที่สุดแห่งหนึ่งไม่เพียงแต่ใน ออสเตรเลียเท่านั้นแต่ทั่วโลก"
                    + "เป็นจุดพักผ่อนยอดนิยมในท้องถิ่นทั้งสำหรับการเล่นกระดานโต้คลื่น ว่ายน้ำและอาบแดด ชายหาดที่เป็นสวรรค์สำหรับการออกมาดูผู้คนทำกิจกรรมนี้ยังมีพื้นที่สวนสาธารณะด้านหลังที่มีนักเล่น "
                    + " โรลเลอร์เบลดและสเก็ตมาโชว์ทักษะการเล่นให้ได้ชมกันอีกด้วย ");
            img3.setIcon(new ImageIcon("src\\aus\\sydneyopera.jpg"));
            name3.setText("Sydneyopera");
            season3.setText("ช่วงเวลาที่เหมาะสม ช่วงคริสต์มาสถึงปีใหม่");
            jTextField3.setText("เป็นสัญลักษณ์ของออสเตรเลียที่รู้จักกันทั่วโลกอย่างไม่ต้องสงสัย คุณสามารถแค่ถ่ายรูปภาพอาคารทรง ใบเรือที่มีชื่อเสียง เข้าไปนั่งฟังโอเปร่า หรือชมดอกไม้ไฟจากเรือในท่าเรือซิดนีย์ตอนเที่ยงคืนในคืน ก่อนปีใหม่ก็ได้ ");
        } else if (page.place.equals("Canada")) {
            img1.setIcon(new ImageIcon("src\\canada\\banff-national-park.jpg"));
            name1.setText("Banff National Park");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            jTextField1.setText("เป็นสถานที่ท่องเที่ยวยอด นิยมมากที่สุดแห่งหนึ่งของแคนาดา ด้วยที่นี่มีพื้นที่ส่วนหนึ่งอยู่ในแนวเทือกเขาร็อกกี เมาน์เทน และมี "
                    + " จุดชมวิวเทือกเขาร็อกกี เมาน์เทน ที่สวยที่สุดอีกด้วย ทะเลสาบก็ไม่น้อยหน้า มี ความงดงามติดอันดับต้น ๆ ของโลกเลยทีเดียว นั่นก็คือ Lake Louise มีลักษณะเป็นทะเลสาบสีฟ้า "
                    + " เขียวมรกตสวยใส รายล้อมไปด้วยเทือกเขาสีเขียวสูงใหญ่");
            img2.setIcon(new ImageIcon("src\\canada\\niagara-falls.jpg"));
            name2.setText("Niagara Falls");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            jTextField2.setText("าเป็นหนึ่งในน้ำตกที่ยิ่งใหญ่ที่สุด ในโลก ตั้งอยู่ระหว่างชายแดนรัฐนิวยอร์ก ประเทศสหรัฐอเมริกา และรัฐออนตาริโอ ประเทศแคนาดา "
                    + " ซึ่งน้ำตกแห่งนี้จะประกอบด้วย 3 น้ำตกด้วยกัน คือน้ำตกเกือกม้า (Horseshoe Falls) อยู่ทางฝั่ง แคนาดา, น้ำตกอเมริกา (American Falls) อยู่ทางฝั่งสหรัฐอเมริกา "
                    + " และน้ำตก Bridal Veil อยู่ทางฝั่ง อเมริกาเช่นกัน");
            img3.setIcon(new ImageIcon("src\\canada\\ottawa.jpg"));
            name3.setText("Ottawa");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            jTextField3.setText("เป็น เมืองหลวงที่มีเสน่ห์มากที่สุดแห่งหนึ่งของโลก ใครที่หลงใหลในสถาปัตยกรรมฟื้นฟูโกธิค (Gothic Revival architecture) จะต้องหลงรักเมืองแห่งนี้แน่นอน"
                    + " ที่นี่ไม่ค่อยมีตึกและอาคารสูง ๆ รูปแบบทันสมัยเยอะ มากนัก รอบ ๆ เมืองเราจะได้เห็นอาคารในรูปแบบสถาปัตยกรรมฟื้นฟูโกธิคเสียเป็นส่วนใหญ่");
        } else if (page.place.equals("China")) {
            img1.setIcon(new ImageIcon("src\\china\\798 Art District_5.jpg"));
            name1.setText("798 Art District");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            jTextField1.setText("เป็นชุมชนศิลปินขนาดใหญ่ที่มีชื่อเสียงมากของจีน ตั้งอยู่ใจกลางกรุงปักกิ่ง\n" +
"สมัยก่อนโรงงาน 798 แห่งนี้เคยเป็นที่ตั้งของโรงงานผลิตอุปกรณ์ไฟฟ้า และอิเล็กทรอนิกส์ ของทหาร\n" +
"โดยจะเป็นชุมชนศิลปะ งานอาร์ต ร้านของแฮนเมดต่างๆ");
            img2.setIcon(new ImageIcon("src\\china\\Great Wall of China_3.jpg"));
            name2.setText("Great Wall of China");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูใบไม้ผลิ และฤดูหนาว");
            jTextField2.setText("เป็นสิ่งมหัศจรรย์ของโลกที่มนุษย์สร้างขึ้น โดยเป็นกำแพงที่มีความยาวถึง 21,196.18 กิโลเมตร อย่างที่เรียกกันว่า กําแพงหมื่นลี้ ครอบคลุมพื้นที่ 15 มณฑลทั่วประเทศจีน");
            img3.setIcon(new ImageIcon("src\\china\\Olympic Stadium 2008_3.jpg"));
            name3.setText("The Beijing National Stadium");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            jTextField3.setText("โดยสนามแห่งนี้ได้ใช้ในมหกรรมกีฬาโอลิมปิกในปี 2008 พองานกีฬาได้สิ้นสุดลง\n"
                    + "ก็ได้เปิดเป็นสถานที่ท่องเที่ยวให้นักท่องเที่ยวเข้ามาชม ถือว่าถ้ามาปักกิ่งแล้วต้องห้ามพลาดค่ะ");
        } else if (page.place.equals("Croatia")) {
            img1.setIcon(new ImageIcon("src\\croatia\\dubrovnikwalls.jpg"));
            name1.setText("Dubrovnik Old Town");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\croatia\\Plitvice_Lakes-National-Park.jpg"));
            name2.setText("Plitvice National Park");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img3.setIcon(new ImageIcon("src\\croatia\\hvartown.jpg"));
            name3.setText("Hvar Town");
            season3.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
        } else if (page.place.equals("Denmark")) {
            img1.setIcon(new ImageIcon("src\\denmark\\mulafossur.jpg"));
            name1.setText("Mulafossur Waterfall");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\denmark\\Torshavn.jpg"));
            name2.setText("Torshavn");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\denmark\\cityhallsquare.jpeg"));
            name3.setText("City Hall Square");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Hungary")) {
            img1.setIcon(new ImageIcon("src\\hungary\\budacastle.jpg"));
            name1.setText("Buda Castle");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล แต่จะให้ดีที่สุดคือ ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\hungary\\Szechenyi-Baths.jpg"));
            name2.setText("Széchenyi Thermal Bath");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\hungary\\gellerthill.jpg"));
            name3.setText("Gellert Hill");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Iceland")) {
            img1.setIcon(new ImageIcon("src\\iceland\\bluelagoon.jpg"));
            name1.setText("Blue Lagoon");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว");
            img2.setIcon(new ImageIcon("src\\iceland\\hallgrimskirkja.jpg"));
            name2.setText("Hallgrimskirkja");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\iceland\\gullfoss.jpg"));
            name3.setText("Gullfoss");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Indonesia")) {
            img1.setIcon(new ImageIcon("src\\indonesia\\Bali.jpg"));
            name1.setText("Bali");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\indonesia\\borobudur.jpg"));
            name2.setText("Borobudur");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\indonesia\\bunaken.jpg"));
            name3.setText("Bunaken");
            season3.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
        } else if (page.place.equals("Japan")) {
            img1.setIcon(new ImageIcon("src\\japan\\fuji.jpg"));
            name1.setText("Fuji");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว ฤดุใบไม้ผลิ ฤดูใบไม้ร่วง");
            img2.setIcon(new ImageIcon("src\\japan\\hokkaido.jpg"));
            name2.setText("Hokkaido");
            season2.setText("ช่วงเวลาที่เหมาะสม ช่วงกลางปีจนถึงฤดูร้อน");
            img3.setIcon(new ImageIcon("src\\japan\\Shirakawa-go.jpg"));
            name3.setText("Shirakawa-go");
            season3.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว");
        } else if (page.place.equals("Thailand")) {
            img1.setIcon(new ImageIcon("src\\thailand\\Tarutao-National-Park-.jpg"));
            name1.setText("Tarutao National Park");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\thailand\\Intanon.jpg"));
            name2.setText("Intanon");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว");
            img3.setIcon(new ImageIcon("src\\thailand\\amphawa.jpg"));
            name3.setText("Amphawa Floating Market");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Switzerland")) {
            img1.setIcon(new ImageIcon("src\\Switzerland\\Zytgloggeturm_2.jpg"));
            name1.setText("Zytgloggeturm");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\Switzerland\\Munster_4.jpg"));
            name2.setText("Munster");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\Switzerland\\Nydeggbrücke_2.jpg"));
            name3.setText("Nydeggbrücke");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Singapore")) {
            img1.setIcon(new ImageIcon("src\\Singapore\\Sea Aquarium_1.jpg"));
            name1.setText("Sea Aquarium");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\Singapore\\Gardens by the Bay_2.jpg"));
            name2.setText("Gardens by the Bay");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\Singapore\\Universal Studios Singapore_2.jpg"));
            name3.setText("Universal Studios Singapore");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Turkey")) {
            img1.setIcon(new ImageIcon("src\\Turkey\\Pamukkale_2.jpg"));
            name1.setText("Pamukkale");
            season1.setText("ช่วงเวลาที่เหมาะสม ฤดูร้อน");
            img2.setIcon(new ImageIcon("src\\Turkey\\Ephesus_3.jpg"));
            name2.setText("Ephesus");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\Turkey\\Istanbul_3.jpg"));
            name3.setText("Istanbul");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
        } else if (page.place.equals("Norway")) {
            img1.setIcon(new ImageIcon("src\\Norway\\Oslo_2.jpg"));
            name1.setText("Oslo");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\Norway\\Tromso_2.jpg"));
            name2.setText("Tromso");
            season2.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว");
            img3.setIcon(new ImageIcon("src\\Norway\\Lofoten_3.jpg"));
            name3.setText("Lofoten");
            season3.setText("ช่วงเวลาที่เหมาะสม ฤดูหนาว");
        } else if (page.place.equals("South Africa")) {
            img1.setIcon(new ImageIcon("src\\South Africa\\Bo Kaap_1.jpg"));
            name1.setText("Bo Kaap");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\South Africa\\moro gelato_1.jpg"));
            name2.setText("MORO GELATO");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\South Africa\\V & A Waterfront_3.jpg"));
            name3.setText("V & A Waterfront");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุถกช่วงฤดูกาล");
        } else if (page.place.equals("United States")) {
            img1.setIcon(new ImageIcon("src\\US\\United States Capitol_3.jpg"));
            name1.setText("United States Capitol");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\US\\Lincoln Memorial_1.jpg"));
            name2.setText("Lincoln Memorial");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\US\\Smithsonian Institution_2.jpg"));
            name3.setText("Smithsonian Institution");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุถกช่วงฤดูกาล");
        } else if (page.place.equals("Mexico")) {
            img1.setIcon(new ImageIcon("src\\Mexico\\Polanco_1.jpg"));
            name1.setText("Polanco");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\Mexico\\Casa Azul – Frida House_2.jpg"));
            name2.setText("Casa Azul");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\Mexico\\the national museum of anthropology_3.jpg"));
            name3.setText("The National Museum of Anthropology");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุถกช่วงฤดูกาล");
        }
         else if (page.place.equals("England")) {
            img1.setIcon(new ImageIcon("src\\England\\Tower of London_3.jpg"));
            name1.setText("Tower of London");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\England\\Casa Azul – Frida House_2.jpg"));
            name2.setText("Stonehenge");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\England\\British Museum_5.jpg"));
            name3.setText("British Museum");
            season3.setText("ช่วงเวลาที่เหมาะสม ทุถกช่วงฤดูกาล");
        }
         else if (page.place.equals("Korea")) {
            img1.setIcon(new ImageIcon("src\\South Korea\\Bukchon Hanok Village_3.jpg"));
            name1.setText("Bukchon Hanok Village");
            season1.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img2.setIcon(new ImageIcon("src\\South Korea\\N Seoul Tower_2.jpg"));
            name2.setText("N Seoul Tower");
            season2.setText("ช่วงเวลาที่เหมาะสม ทุกช่วงฤดูกาล");
            img3.setIcon(new ImageIcon("src\\South Korea\\Cheonggye Plaza_3.jpg"));
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(930, 630));

        Page_place.setBackground(new java.awt.Color(3, 151, 161));
        Page_place.setPreferredSize(new java.awt.Dimension(930, 630));
        Page_place.setRequestFocusEnabled(false);

        txt_recommended.setFont(new java.awt.Font("OCR A Extended", 0, 48)); // NOI18N
        txt_recommended.setForeground(new java.awt.Color(255, 255, 255));
        txt_recommended.setText("Recommended Place");

        name1.setFont(new java.awt.Font("Consolas", 0, 26)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("name1");

        season1.setForeground(new java.awt.Color(255, 255, 255));
        season1.setText("season1");

        name2.setFont(new java.awt.Font("Consolas", 0, 26)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setText("name2");

        season2.setForeground(new java.awt.Color(255, 255, 255));
        season2.setText("season2");

        name3.setFont(new java.awt.Font("Consolas", 0, 26)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setText("name3");

        season3.setForeground(new java.awt.Color(255, 255, 255));
        season3.setText("season3");

        img1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField1");

        jTextField3.setText("jTextField1");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Page_placeLayout.createSequentialGroup()
                        .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Page_placeLayout.createSequentialGroup()
                                .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(56, 56, 56))
                            .addGroup(Page_placeLayout.createSequentialGroup()
                                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(season1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Page_placeLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)))
                        .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Page_placeLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Page_placeLayout.createSequentialGroup()
                                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(season2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57)
                                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(season3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(season2)
                    .addComponent(season3)
                    .addComponent(season1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Page_placeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Page_place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Page_place, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Page_place;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel season1;
    private javax.swing.JLabel season2;
    private javax.swing.JLabel season3;
    private javax.swing.JLabel txt_recommended;
    // End of variables declaration//GEN-END:variables
}
