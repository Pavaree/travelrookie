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
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Pavaree
 */
public class Time extends javax.swing.JInternalFrame {

    public String placeSelect = "";
    private Home main;
    public int hourThem;

    /**
     * Creates new form time
     */
    public Time() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        clock();
        try {
            temp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Time(String a) {
        this.placeSelect = a;
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        clock();
        try {
            temp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Time(Home h) {
        this.main = h;
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        clock();
        try {
            temp();
        } catch (Exception e) {
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

        Time_and_temp = new javax.swing.JPanel();
        time_us = new javax.swing.JLabel();
        imgtemp = new javax.swing.JLabel();
        Temparature = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        time_them = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        d_or_n_us = new javax.swing.JLabel();
        d_or_n_them = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(640, 640));

        Time_and_temp.setBackground(new java.awt.Color(8, 126, 145));
        Time_and_temp.setPreferredSize(new java.awt.Dimension(940, 660));

        time_us.setFont(new java.awt.Font("Yu Gothic UI", 0, 48)); // NOI18N
        time_us.setForeground(new java.awt.Color(255, 255, 255));
        time_us.setText("--:--:--");
        time_us.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                time_usPropertyChange(evt);
            }
        });

        imgtemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test_imges/icons8_snowy_sunny_day_100px.png"))); // NOI18N

        Temparature.setBackground(new java.awt.Color(0, 156, 134));
        Temparature.setFont(new java.awt.Font("Harlow Solid Italic", 0, 48)); // NOI18N
        Temparature.setForeground(new java.awt.Color(255, 255, 255));
        Temparature.setText("Temparature");

        time.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("Time");

        time_them.setFont(new java.awt.Font("Yu Gothic UI", 0, 48)); // NOI18N
        time_them.setForeground(new java.awt.Color(255, 255, 255));
        time_them.setText("--:--:--");

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

        javax.swing.GroupLayout Time_and_tempLayout = new javax.swing.GroupLayout(Time_and_temp);
        Time_and_temp.setLayout(Time_and_tempLayout);
        Time_and_tempLayout.setHorizontalGroup(
            Time_and_tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Time_and_tempLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(time_us)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(time_them)
                .addGap(214, 214, 214))
            .addGroup(Time_and_tempLayout.createSequentialGroup()
                .addGroup(Time_and_tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Time_and_tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Time_and_tempLayout.createSequentialGroup()
                            .addGap(326, 326, 326)
                            .addComponent(Temparature))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Time_and_tempLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(imgtemp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(temp)))
                    .addGroup(Time_and_tempLayout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(city))
                    .addGroup(Time_and_tempLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(time)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Time_and_tempLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(d_or_n_us)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(d_or_n_them)
                .addGap(243, 243, 243))
        );
        Time_and_tempLayout.setVerticalGroup(
            Time_and_tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Time_and_tempLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(Temparature, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Time_and_tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Time_and_tempLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(city)
                        .addGap(16, 16, 16)
                        .addComponent(imgtemp))
                    .addGroup(Time_and_tempLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(temp)))
                .addGap(18, 18, 18)
                .addComponent(time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Time_and_tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time_us, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_them, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Time_and_tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d_or_n_us)
                    .addComponent(d_or_n_them))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Time_and_temp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Time_and_temp, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void time_usPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_time_usPropertyChange

    }//GEN-LAST:event_time_usPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Temparature;
    private javax.swing.JPanel Time_and_temp;
    private javax.swing.JLabel city;
    private javax.swing.JLabel d_or_n_them;
    private javax.swing.JLabel d_or_n_us;
    private javax.swing.JLabel imgtemp;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel time;
    private javax.swing.JLabel time_them;
    private javax.swing.JLabel time_us;
    // End of variables declaration//GEN-END:variables

    public void clock() {
        Thread clock = new Thread() {
            public void run() {
                try {
                    while (true) {
                        Calendar d = Calendar.getInstance();
                        int sec = d.get(Calendar.SECOND);
                        int min = d.get(Calendar.MINUTE);
                        int hour = d.get(Calendar.HOUR_OF_DAY);
                        time_us.setText(String.format("%02d:%02d:%02d", hour, min, sec));
                        int hourThemFormat = hour - 7 + hourThem;
                        if (hourThemFormat >= 24) {
                            hourThemFormat -= 24;
                        }else if(hourThemFormat < 0){
                            hourThemFormat += 24;
                        }
                        time_them.setText(String.format("%02d:%02d:%02d", hourThemFormat, min, sec));

                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();

    }

    public void temp() throws Exception {
        String url = "https://api.weatherbit.io/v2.0/current";
        String place = "";
        String key = "&key=3213a3ed4eab4b798f7bf32372334b75";
        if (main != null) {
            //from HOME class
            if (main.place.equals("Australia")) {
                place = "?city=Canberra";
            } else if (main.place.equals("Canada")) {
                place = "?city=Ottawa";
            } else if (main.place.equals("China")) {
                place = "?city=Beijing";
            } else if (main.place.equals("Croatia")) {
                place = "?city=Zagreb";
            } else if (main.place.equals("Denmark")) {
                place = "?city=Copenhagen";
            }

        } else {

            //not from Home class
            if (placeSelect.equals("Australia")) {
                place = "?city=Canberra";
            } else if (placeSelect.equals("Canada")) {
                place = "?city=Ottawa";
            } else if (placeSelect.equals("China")) {
                place = "?city=Beijing";
            } else if (placeSelect.equals("Croatia")) {
                place = "?city=Zagreb";
            } else if (placeSelect.equals("Denmark")) {
                place = "?city=Copenhagen";
            }
        }
        URL obj = new URL(url + place + key);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        //System.out.println("\nSending 'GET' request to URL : " + url);
        //System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        in.close();
        //print in String
        //System.out.println(response);
        //Read JSON response and print
        JSONObject myResponse = new JSONObject(response.toString());
        //System.out.println("result after Reading JSON Response");
        //System.out.println(myResponse);
        JSONArray array_data = new JSONArray(myResponse.getJSONArray("data").toString());
        JSONObject object_data = new JSONObject(array_data.getJSONObject(0).toString());
        //System.out.println(object_data.getInt("temp"));
        temp.setText(object_data.getInt("temp") + " °C");
        //System.out.println(object_data.getString("city_name"));
        city.setText(object_data.getString("city_name"));
        //System.out.println(object_data.getString("app_temp"));
        URL placeZone = new URL("http://worldtimeapi.org/api/timezone/" + object_data.getString("timezone"));
        HttpURLConnection bridge = (HttpURLConnection) placeZone.openConnection();
        bridge.setRequestMethod("GET");
        bridge.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader input = new BufferedReader(
                new InputStreamReader(bridge.getInputStream()));
        String inputText;
        StringBuffer timeResponse = new StringBuffer();
        while ((inputText = input.readLine()) != null) {
            timeResponse.append(inputText);
        }
        input.close();

        JSONObject myTimeResponse = new JSONObject(timeResponse.toString());
        //offset + time local
        String dateTime = myTimeResponse.getString("datetime");
        String utc_offset = myTimeResponse.getString("utc_offset");
        String hourThemText = utc_offset;
        if (hourThemText.charAt(0) == '+') {
            String numString = "";
            for (int start = 1; start < hourThemText.length(); start++) {
                if (hourThemText.charAt(start) == ':') {
                    hourThem = Integer.parseInt(numString);
                    break;
                } else {
                    numString += hourThemText.charAt(start);
                }
            }
        } else {
            String numString = "";
            for (int start = 1; start < hourThemText.length(); start++) {
                if (hourThemText.charAt(start) == ':') {
                    hourThem = Integer.parseInt(numString) - (Integer.parseInt(numString));
                    break;
                } else {
                    numString += hourThemText.charAt(start);
                }

            }
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = format.parse(dateTime);
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(date);
        String dateUpdate = DATE_FORMAT.format(date);
        d_or_n_them.setText(dateUpdate + "");
        d_or_n_us.setText(DATE_FORMAT.format(new Date()));

    }
}
