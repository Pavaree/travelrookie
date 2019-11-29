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
import java.time.*;
import java.time.format.DateTimeFormatter;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
        date = new javax.swing.JLabel();
        time_them = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        d_or_n_us = new javax.swing.JLabel();
        d_or_n_them = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        tell_weather = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(640, 640));

        Time_and_temp.setBackground(new java.awt.Color(231, 123, 165));
        Time_and_temp.setPreferredSize(new java.awt.Dimension(940, 660));
        Time_and_temp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time_us.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        time_us.setForeground(new java.awt.Color(255, 255, 255));
        time_us.setText("--:--:--");
        time_us.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                time_usPropertyChange(evt);
            }
        });
        Time_and_temp.add(time_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 180, 87));
        Time_and_temp.add(imgtemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 122, 110));

        Temparature.setBackground(new java.awt.Color(0, 156, 134));
        Temparature.setFont(new java.awt.Font("Consolas", 0, 50)); // NOI18N
        Temparature.setForeground(new java.awt.Color(255, 255, 255));
        Temparature.setText("Temparature");
        Time_and_temp.add(Temparature, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 300, 87));

        date.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText(" Date :");
        Time_and_temp.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 150, -1));

        time_them.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        time_them.setForeground(new java.awt.Color(255, 255, 255));
        time_them.setText("--:--:--");
        Time_and_temp.add(time_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 170, 87));

        temp.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        temp.setForeground(new java.awt.Color(255, 255, 255));
        temp.setText("Temp");
        Time_and_temp.add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 120, -1));

        city.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setText(" City");
        Time_and_temp.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 260, -1));

        d_or_n_us.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        d_or_n_us.setForeground(new java.awt.Color(255, 255, 255));
        d_or_n_us.setText("dorn");
        Time_and_temp.add(d_or_n_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 220, -1));

        d_or_n_them.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        d_or_n_them.setForeground(new java.awt.Color(255, 255, 255));
        d_or_n_them.setText("dorn");
        Time_and_temp.add(d_or_n_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 200, -1));

        time1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("Time :");
        Time_and_temp.add(time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 140, -1));

        tell_weather.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        tell_weather.setForeground(new java.awt.Color(255, 255, 255));
        tell_weather.setText(" tell_temp");
        Time_and_temp.add(tell_weather, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 240, 80));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bangkok");
        Time_and_temp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("jLabel1");
        Time_and_temp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Time_and_temp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Time_and_temp, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
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
    private javax.swing.JLabel date;
    private javax.swing.JLabel imgtemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel tell_weather;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel time1;
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
                        } else if (hourThemFormat < 0) {
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
            } else if (main.place.equals("Hungary")) {
                place = "?city=Budapest";
            } else if (main.place.equals("Iceland")) {
                place = "?city=Reykjavik";
            } else if (main.place.equals("Indonesia")) {
                place = "?city=Jakarta";
            } else if (main.place.equals("Japan")) {
                place = "?city=Tokyo";
            } else if (main.place.equals("Korea")) {
                place = "?city=South Korea";
            } else if (main.place.equals("Mexico")) {
                place = "?city=Mexico";
            } else if (main.place.equals("Norway")) {
                place = "?city=Oslo";
            } else if (main.place.equals("Singapore")) {
                place = "?city=Singapore";
            } else if (main.place.equals("South Africa")) {
                place = "?city=Cape Town";
            } else if (main.place.equals("Sweden")) {
                place = "?city=Stockholm";
            } else if (main.place.equals("Switzerland")) {
                place = "?city=Bern";
            } else if (main.place.equals("Thailand")) {
                place = "?city=Bangkok";
            } else if (main.place.equals("Turkey")) {
                place = "?city=Ankara";
            } else if (main.place.equals("United Kingdom")) {
                place = "?city=London";
            } else if (main.place.equals("United States")) {
                place = "?city=Washington";
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
            } else if (placeSelect.equals("Hungary")) {
                place = "?city=Budapest";
            } else if (placeSelect.equals("Iceland")) {
                place = "?city=Reykjavik";
            } else if (placeSelect.equals("Indonesia")) {
                place = "?city=Jakarta";
            } else if (placeSelect.equals("Japan")) {
                place = "?city=Tokyo";
            } else if (placeSelect.equals("Korea")) {
                place = "?city=South Korea";
            } else if (placeSelect.equals("Mexico")) {
                place = "?city=Mexico";
            } else if (placeSelect.equals("Norway")) {
                place = "?city=Oslo";
            } else if (placeSelect.equals("Singapore")) {
                place = "?city=Singapore";
            } else if (placeSelect.equals("South Africa")) {
                place = "?city=Cape Town";
            } else if (placeSelect.equals("Sweden")) {
                place = "?city=Stockholm";
            } else if (placeSelect.equals("Switzerland")) {
                place = "?city=Bern";
            } else if (placeSelect.equals("Thailand")) {
                place = "?city=Bangkok";
            } else if (placeSelect.equals("Turkey")) {
                place = "?city=Ankara";
            } else if (placeSelect.equals("United Kingdom")) {
                place = "?city=London";
            } else if (placeSelect.equals("United States")) {
                place = "?city=Washington";
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
        jLabel1.setText(main.place);
        //System.out.println(object_data.getString("app_temp"));

        JSONObject weather_data = new JSONObject(object_data.getJSONObject("weather").toString());
        String code = weather_data.getString("description");
        if (code.equals("Thunderstorm with light rain") || code.equals("Thunderstorm with rain")
                || code.equals("Thunderstorm with heavy rain") || code.equals("Thunderstorm with light drizzle") || code.equals("Thunderstorm with drizzle")
                || code.equals("Thunderstorm with heavy drizzle") || code.equals("Thunderstorm with Hail")) {
            imgtemp.setIcon(new ImageIcon("src\\icon-temp\\Thunders.png"));
        } else if (code.equals("Light drizzle") || code.equals("Drizzle")
                || code.equals("Heavy drizzle") || code.equals("Light rain") || code.equals("Moderate rain") || code.equals("Flurries")
                || code.equals("Heavy rain") || code.equals("Freezing rain") || code.equals("Light shower rain")
                || code.equals("Shower rain") || code.equals("Heavy shower rain")) {
            imgtemp.setIcon(new ImageIcon("src\\icon-temp\\Rain.png"));
        } else if (code.equals("Light snow") || code.equals("Snow") || code.equals("Snow shower") || code.equals("Heavy snow shower")) {
            imgtemp.setIcon(new ImageIcon("src\\icon-temp\\snow.png"));
        } else if (code.equals("Heavy Snow") || code.equals("Mix snow/rain")) {
            imgtemp.setIcon(new ImageIcon("src\\icon-temp\\snow_storm.png"));
        } else if (code.equals("Sleet") || code.equals("Heavy sleet")) {
            imgtemp.setIcon(new ImageIcon("src\\icon-temp\\sleet.png"));
        } else if (code.equals("Mist") || code.equals("Smoke") || code.equals("Haze") || code.equals("Sand/dust") || code.equals("Fog") || code.equals("Freezing fog")) {
            imgtemp.setIcon(new ImageIcon("src\\icon-temp\\haze.png"));
        } else if (code.equals("Clear sky")) {
            imgtemp.setIcon(new ImageIcon("src\\icon-temp\\moon_and_sunx.png"));
        } else if (code.equals("Unknown Precipitation")) {
            imgtemp.setIcon(new ImageIcon("src\\icon-temp\\Precipitation.png"));
        } else if (code.equals("Few clouds") || code.equals("Scattered clouds") || code.equals("Broken clouds") || code.equals("Overcast clouds")) {
            imgtemp.setIcon(new ImageIcon("src\\icon-temp\\clouds.png"));
        }
        tell_weather.setText(weather_data.getString("description"));

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
                    hourThem = Integer.parseInt(numString) - (Integer.parseInt(numString)) * 2;
                    System.out.println(hourThem);
                    break;
                } else {
                    numString += hourThemText.charAt(start);
                }

            }
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = format.parse(dateTime);
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(date);
        String dateUpdate = DATE_FORMAT.format(date);
        d_or_n_them.setText(dateUpdate + "");
        
        LocalDate date_us = LocalDate.now(); // gets the current date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(date_us.format(formatter));
        d_or_n_us.setText(date_us.format(formatter));
        
        

    }
}
