/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Pavaree
 */
public class time extends javax.swing.JInternalFrame {

    /**
     * Creates new form time
     */
    public time() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        clock();
        try{
            temp();
        }catch (Exception e){
            e.printStackTrace();
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

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        d_or_n_us = new javax.swing.JLabel();
        d_or_n_them = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(640, 640));

        jPanel3.setBackground(new java.awt.Color(8, 126, 145));
        jPanel3.setPreferredSize(new java.awt.Dimension(940, 660));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("--:--:--");
        jLabel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel2PropertyChange(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test_imges/icons8_snowy_sunny_day_100px.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 156, 134));
        jLabel5.setFont(new java.awt.Font("Harlow Solid Italic", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Temparature");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Time");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("--:--:--");

        temp.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        temp.setForeground(new java.awt.Color(255, 255, 255));
        temp.setText("Temp");

        city.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setText("City");

        d_or_n_us.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        d_or_n_us.setForeground(new java.awt.Color(255, 255, 255));
        d_or_n_us.setText("dorn");

        d_or_n_them.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        d_or_n_them.setForeground(new java.awt.Color(255, 255, 255));
        d_or_n_them.setText("dorn");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(214, 214, 214))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(326, 326, 326)
                            .addComponent(jLabel5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(temp)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(city))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(d_or_n_us)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(d_or_n_them)
                .addGap(243, 243, 243))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(city)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(temp)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d_or_n_us)
                    .addComponent(d_or_n_them))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel2PropertyChange

    }//GEN-LAST:event_jLabel2PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel city;
    private javax.swing.JLabel d_or_n_them;
    private javax.swing.JLabel d_or_n_us;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel temp;
    // End of variables declaration//GEN-END:variables

    public void clock() {
        Thread clock = new Thread() {
            public void run() {
                try {
                    while(true){
                    Calendar d = Calendar.getInstance();
                    int sec = d.get(Calendar.SECOND);
                    int min = d.get(Calendar.MINUTE);
                    int hour = d.get(Calendar.HOUR_OF_DAY);
                    jLabel2.setText(String.format("%02d:%02d:%02d", hour, min, sec));
                    jLabel7.setText(String.format("%02d:%02d:%02d", hour, min, sec));
                    
                    sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(time.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();

    }
    public void temp() throws Exception{
        String url = "https://api.weatherbit.io/v2.0/current?city=Seoul&key=3213a3ed4eab4b798f7bf32372334b75";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        //print in String
        System.out.println(response);
        //Read JSON response and print
        JSONObject myResponse = new JSONObject(response.toString());
        System.out.println("result after Reading JSON Response");
        System.out.println(myResponse);
        JSONArray array_data = new JSONArray(myResponse.getJSONArray("data").toString());
        JSONObject object_data = new JSONObject(array_data.getJSONObject(0).toString());
        System.out.println(object_data.getInt("temp"));
        temp.setText(object_data.getInt("temp")+" °C");
        System.out.println(object_data.getString("city_name"));
        city.setText(object_data.getString("city_name"));
        //System.out.println(object_data.getString("app_temp"));
        
    }
}
